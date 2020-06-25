package com.adept.ims.institute.web;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.WebDataBinder;

/**
 * JavaBean Form controller that is used to edit an existing <code>Trust</code>.
 */
@Controller
@RequestMapping("/institute/updateTrust.do")
@SessionAttributes(types = Trust.class)
public class UpdateTrustForm {

    private final TrustService trustService;

    @Autowired
    public UpdateTrustForm(TrustService trustService) {
        this.trustService = trustService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"id"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("trustId") long trustId, Model model) {
        Trust trust = this.trustService.get(trustId);
        model.addAttribute("trust",trust);
        return "institute/updateTrust";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("mode") String addMode,
            @ModelAttribute Trust trust, BindingResult result, Model model, SessionStatus status) {

        if (addMode.trim().equals("cancel")) {
            return "redirect:findTrust.do";
        } else if (addMode.trim().equals("delete")) {
           this.trustService.remove(trust.getTrustId());
            return "redirect:deleteConfirmTrust.do?trustId="+ trust.getTrustId();
        }

        new TrustValidator().validate(trust, result);
        if (result.hasErrors()) {
            return "institute/updateTrust";
        } else {
            trust.getAudit().setModifiedDate(new Date());
            this.trustService.update(trust);
            trust.setNew(false);
            model.addAttribute("trust", trust);
            return "institute/showTrust";
        }
    }
}
