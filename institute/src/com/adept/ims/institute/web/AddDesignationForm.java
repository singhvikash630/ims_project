package com.adept.ims.institute.web;

import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.institute.database.pojo.Designation;
import com.adept.ims.institute.service.DesignationService;
import com.adept.ims.institute.service.InstituteService;
import com.adept.ims.institute.validator.DesignationValidator;

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

@Controller
@RequestMapping("/institute/addDesignation.do")
@SessionAttributes(types = Designation.class)
public class AddDesignationForm {

    private final DesignationService designationService;
    private final InstituteService instituteService;

    @Autowired
    public AddDesignationForm(DesignationService designationService,InstituteService instituteService) {
        this.designationService = designationService;
        this.instituteService = instituteService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"designationId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        Designation designation = new Designation();
        model.addAttribute(designation);
        return "institute/addDesignation";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("addMode") String addMode,
            @ModelAttribute Designation designation, BindingResult result, Model model, SessionStatus status) {
        if (addMode.trim().equals("cancel")) {
            return "redirect:findDesignation.do";
        }
        new DesignationValidator().validate(designation, result);
        if (result.hasErrors()) {
            return "institute/addDesignation";
        } else {
            designation.setInstitute(instituteService.get(designation.getInstitute().getInstituteId()));
            Audit audit = new Audit();
            audit.setCreatedDate(new Date());
            designation.setAudit(audit);
            this.designationService.save(designation);
            designation.setNew(true);
            model.addAttribute("designation", designation);
            return "institute/showDesignation";
        }
    }
}
