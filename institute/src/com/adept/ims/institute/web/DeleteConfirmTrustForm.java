package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.Trust;
import com.adept.ims.institute.service.TrustService;

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
 * JavaBean Form controller that is used to edit an existing <code>Trust</code>.
 */
@Controller
@RequestMapping("/institute/deleteConfirmTrust.do")
public class DeleteConfirmTrustForm {

    private final TrustService trustService;

    @Autowired
    public DeleteConfirmTrustForm(TrustService trustService) {
        this.trustService = trustService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"trustId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("trustId") int trustId,Model model) {
        model.addAttribute("trustId", trustId);
        return "institute/deleteConfirmTrust";
    }
}
