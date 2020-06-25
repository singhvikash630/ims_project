/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.Institute;
import com.adept.ims.institute.database.pojo.InstituteMaster;
import com.adept.ims.institute.database.pojo.Trust;
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
@RequestMapping("/institute/updateInstitute.do")
@SessionAttributes(types = Institute.class)
public class UpdateInstituteForm {

    private final InstituteService instituteService;
    private final TrustService trustService;
    private final InstituteMasterService instituteMasterService;

    @Autowired
    public UpdateInstituteForm(InstituteService instituteService,
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
    public String setupForm(@RequestParam("instituteId") long instituteId, Model model) {
        Institute institute = this.instituteService.get(instituteId);
        model.addAttribute(institute);
        return "institute/updateInstitute";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("mode") String addMode,
            @ModelAttribute Institute institute, BindingResult result, Model model, SessionStatus status) {

        if (addMode.trim().equals("cancel")) {
            return "redirect:findInstitute.do";
        } else if (addMode.trim().equals("delete")) {
            this.instituteService.remove(institute.getInstituteId());
            return "redirect:deleteConfirmInstitute.do?instituteId=" + institute.getInstituteId();
        }

        new InstituteValidator().validate(institute, result);
        if (result.hasErrors()) {
            return "institute/updateInstitute";
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

            institute.getAudit().setModifiedDate(new Date());
            this.instituteService.update(institute);
            institute.setNew(false);
            model.addAttribute("institute", institute);
            return "institute/showInstitute";
        }
    }
}
