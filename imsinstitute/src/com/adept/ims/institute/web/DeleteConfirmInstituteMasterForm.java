/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.institute.web;

import com.adept.ims.institute.service.InstituteMasterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Viswanath
 */
@Controller
@RequestMapping("/institute/deleteConfirmInstituteMaster.do")
public class DeleteConfirmInstituteMasterForm {
     private final InstituteMasterService instituteMasterService;

    @Autowired
    public DeleteConfirmInstituteMasterForm(InstituteMasterService instituteMasterService) {
        this.instituteMasterService = instituteMasterService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"instituteMasterId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("instituteMasterId") int instituteMasterId,Model model) {
        model.addAttribute("instituteMasterId",instituteMasterId);
        return "institute/deleteConfirmInstituteMaster";
    }

}
