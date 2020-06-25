/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.InstituteMaster;
import com.adept.ims.institute.service.InstituteMasterService;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;

/**
 *
 * @author Viswanath
 */
@Controller
@RequestMapping("/institute/showInstituteMaster.do")
public class ShowInstituteMasterForm {

    private final InstituteMasterService instituteMasterService;

    @Autowired
    public ShowInstituteMasterForm(InstituteMasterService instituteMasterService) {
        this.instituteMasterService = instituteMasterService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"instituteMasterId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        return "institute/showInstituteMaster";
    }
}
