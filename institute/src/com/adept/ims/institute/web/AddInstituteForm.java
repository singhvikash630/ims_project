/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.web;

import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.institute.database.pojo.*;
import com.adept.ims.institute.service.InstituteMasterService;
import com.adept.ims.institute.service.InstituteService;
import com.adept.ims.institute.service.TrustService;
import com.adept.ims.institute.validator.InstituteValidator;

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
@RequestMapping("/institute/addInstitute.do")
@SessionAttributes(types = Institute.class)
public class AddInstituteForm {

    private final InstituteService instituteService;
    private final TrustService trustService;
    private final InstituteMasterService instituteMasterService;

    @Autowired
    public AddInstituteForm(InstituteService instituteService,
            TrustService trustService, InstituteMasterService instituteMasterService) {
        this.instituteService = instituteService;
        this.trustService = trustService;
        this.instituteMasterService = instituteMasterService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"instituteId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        Institute institute = new Institute();
        model.addAttribute(institute);
        return "institute/addInstitute";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("addMode") String addMode, @ModelAttribute Institute institute,
            BindingResult result, Model model, SessionStatus status) {
        if (addMode.trim().equals("cancel")) {
            return "redirect:findInstitute.do";
        }
        new InstituteValidator().validate(institute, result);
        if (result.hasErrors()) {
            return "institute/addInstitute";
        } else {
            
            Trust trust = trustService.get(institute.getTrust().getTrustId());
            if (trust == null) {
                result.rejectValue("trust.trustId", "not-found", "not found");
                return "institute/addInstitute";
            }
            InstituteMaster instituteMaster = instituteMasterService.get(
                    institute.getInstituteMaster().getInstituteMasterId());
            if (instituteMaster == null) {
                result.rejectValue("instituteMaster.instituteMasterId", "not-found", "not found");
                return "institute/addInstitute";
            }
            institute.setTrust(trust);
            institute.setInstituteMaster(instituteMaster);
            Audit audit = new Audit();
            audit.setCreatedDate(new Date());
            institute.setAudit(audit);
            this.instituteService.save(institute);
            institute.setNew(true);
            model.addAttribute("institute", institute);
            return "institute/showInstitute";
        }
    }
}