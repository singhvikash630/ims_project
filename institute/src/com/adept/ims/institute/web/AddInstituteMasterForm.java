/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.InstituteMaster;
import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.institute.service.InstituteMasterService;
import com.adept.ims.institute.validator.InstituteMasterValidator;

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
 *
 * @author Viswanath
 */
@Controller
@RequestMapping("/institute/addInstituteMaster.do")
@SessionAttributes(types = InstituteMaster.class)
public class AddInstituteMasterForm {

    private final InstituteMasterService instituteMasterService;

    @Autowired
    public AddInstituteMasterForm(InstituteMasterService instituteMasterService) {
        this.instituteMasterService = instituteMasterService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"instituteMasterId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        InstituteMaster instituteMaster = new InstituteMaster();
        model.addAttribute("instituteMaster",instituteMaster);
        return "institute/addInstituteMaster";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("addMode") String addMode,
            @ModelAttribute InstituteMaster instituteMaster, BindingResult result, Model model, SessionStatus status) {
        if (addMode.trim().equals("cancel")) {
            return "redirect:findInstituteMaster.do";
        }
        new InstituteMasterValidator().validate(instituteMaster, result);
        if (result.hasErrors()) {
            return "institute/addInstituteMaster";
        } else {
            Audit audit = new Audit();
            audit.setCreatedDate(new Date());
            instituteMaster.setAudit(audit);
            this.instituteMasterService.save(instituteMaster);
            instituteMaster.setNew(true);
            model.addAttribute("instituteMaster", instituteMaster);
            return "institute/showInstituteMaster";
        }
    }
}