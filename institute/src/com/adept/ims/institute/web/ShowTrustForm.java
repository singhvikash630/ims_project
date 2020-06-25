package com.adept.ims.institute.web;

import com.adept.ims.institute.service.TrustService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;

/**
 * JavaBean Form controller that is used to search for <code>Trust</code>s by
 * trust name.
 *
 */
@Controller
@RequestMapping("/institute/showTrust.do")
public class ShowTrustForm {

    private final TrustService trustService;

    @Autowired
    public ShowTrustForm(TrustService trustService) {
        this.trustService = trustService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"trustId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        return "institute/showTrust";
    }
}
