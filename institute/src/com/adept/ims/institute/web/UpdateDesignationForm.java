package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.Designation;
import com.adept.ims.institute.service.DesignationService;
import com.adept.ims.institute.validator.DesignationValidator;

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
@RequestMapping("/institute/updateDesignation.do")
@SessionAttributes(types = Designation.class)
public class UpdateDesignationForm {

    private final DesignationService designationService;

    @Autowired
    public UpdateDesignationForm(DesignationService designationService) {
        this.designationService = designationService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"designationId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("designationId") long designationId, Model model) {
        Designation designation = this.designationService.get(designationId);
        model.addAttribute(designation);
        return "institute/updateDesignation";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("mode") String addMode,
            @ModelAttribute Designation designation, BindingResult result, Model model, SessionStatus status) {

        if (addMode.trim().equals("cancel")) {
            return "redirect:findDesignation.do";
        } else if (addMode.trim().equals("delete")) {
            this.designationService.remove(designation.getDesignationId());
            return "redirect:deleteConfirmDesignation.do?designationId="+designation.getDesignationId();
        }

        new DesignationValidator().validate(designation, result);
        if (result.hasErrors()) {
            return "institute/updateDesignation";
        } else {
            designation.getAudit().setModifiedDate(new Date());
            this.designationService.update(designation);
            status.setComplete();
            designation.setNew(false);
            model.addAttribute("designation", designation);
            return "institute/showDesignation";
        }
    }
}
