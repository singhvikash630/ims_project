
package com.adept.ims.institute.web;

import com.adept.ims.common.database.pojo.Address;
import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.institute.database.pojo.Trust;
import com.adept.ims.institute.service.TrustService;
import com.adept.ims.institute.validator.TrustValidator;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * JavaBean form controller that is used to add a new <code>Trust</code> to
 * the system.
 *
 */
@Controller
@RequestMapping("/institute/addTrust.do")
@SessionAttributes(types = Trust.class)
public class AddTrustForm {

    private final TrustService trustService;

    @Autowired
    public AddTrustForm(TrustService trustService) {
        this.trustService = trustService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"trustId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        Trust trust = new Trust();        
        model.addAttribute(trust);
        return "institute/addTrust";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("addMode") String addMode,
            @ModelAttribute Trust trust, BindingResult result, Model model, SessionStatus status) {
        if (addMode.trim().equals("cancel")) {
            return "redirect:findTrust.do";
        }
        new TrustValidator().validate(trust, result);
        if (result.hasErrors()) {
            return "institute/addTrust";
        } else {
            Audit audit = new Audit();
            audit.setCreatedDate(new Date());
            trust.setAudit(audit);
            this.trustService.save(trust);
            trust.setNew(true);
            model.addAttribute("trust", trust);
            return "institute/showTrust";
        }
    }
}
