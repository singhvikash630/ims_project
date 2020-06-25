/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.InstituteMaster;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.WebDataBinder;
/**
 *
 * @author Viswanath
 */
@Controller
@RequestMapping("/institute/updateInstituteMaster.do")
@SessionAttributes(types = InstituteMaster.class)
public class UpdateInstituteMasterForm {

     private final InstituteMasterService instituteMasterService;

    @Autowired
    public UpdateInstituteMasterForm(InstituteMasterService instituteMasterService) {
        this.instituteMasterService = instituteMasterService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"instituteMasterId"});

    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("instituteMasterId") long instituteMasterId,Model model) {
        InstituteMaster instituteMaster = this.instituteMasterService.get(instituteMasterId);
        model.addAttribute(instituteMaster);
        return "institute/updateInstituteMaster";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("mode") String addMode,
            @ModelAttribute InstituteMaster instituteMaster,BindingResult result,Model model,SessionStatus status) {

        if (addMode.trim().equals("cancel")) {
            return "redirect:findInstituteMaster.do";
        } else if (addMode.trim().equals("delete")) {
           this.instituteMasterService.remove(instituteMaster.getInstituteMasterId());
            return "redirect:deleteConfirmInstituteMaster.do?instituteMasterId="+ instituteMaster.getInstituteMasterId();
        }
        
        new InstituteMasterValidator().validate(instituteMaster,result);
        if (result.hasErrors()) {
            return "institute/updateInstituteMaster";
        } else {
            instituteMaster.getAudit().setModifiedDate(new Date());
            this.instituteMasterService.update(instituteMaster);
            instituteMaster.setNew(false);
            model.addAttribute("instituteMaster",instituteMaster);
            return "institute/showInstituteMaster";
        }
    }
}
