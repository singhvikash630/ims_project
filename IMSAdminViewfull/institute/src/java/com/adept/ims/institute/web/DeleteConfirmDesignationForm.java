package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.Designation;
import com.adept.ims.institute.service.DesignationService;

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
@RequestMapping("/institute/deleteConfirmDesignation.do")
public class DeleteConfirmDesignationForm {

    private final DesignationService designationService;


     @Autowired
    public DeleteConfirmDesignationForm(DesignationService designationService) {
        this.designationService = designationService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"DesignationId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("DesignationId") int designationId,Model model) {
        model.addAttribute("DesignationId", designationId);
        return "institute/deleteConfirmDesignation";
    }
}
