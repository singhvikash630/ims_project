/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.web;

import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.institute.database.pojo.Department;
import com.adept.ims.institute.service.DepartmentService;
import com.adept.ims.institute.service.InstituteService;
import com.adept.ims.institute.validator.DepartmentValidator;

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
@RequestMapping("/institute/addDepartment.do")
@SessionAttributes(types = Department.class)
public class AddDepartmentForm {

    private final DepartmentService departmentService;    
    private final InstituteService instituteService;

    @Autowired
    public AddDepartmentForm(DepartmentService departmentService, InstituteService trustInstituteService) {
        this.departmentService = departmentService;
        this.instituteService = trustInstituteService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"departmentId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        Department department = new Department();
        model.addAttribute(department);
        return "institute/addDepartment";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("addMode") String addMode,
            @ModelAttribute Department department, BindingResult result, Model model, SessionStatus status) {
        if (addMode.trim().equals("cancel")) {
            return "redirect:findDepartment.do";
        }
        new DepartmentValidator().validate(department, result);
        if (result.hasErrors()) {
            return "institute/addDepartment";
        } else {
            department.setInstitute(instituteService.get(department.getInstitute().getInstituteId()));
            Audit audit = new Audit();
            audit.setCreatedDate(new Date());
            department.setAudit(audit);
            this.departmentService.save(department);
            department.setNew(true);
            model.addAttribute("department", department);
            return "institute/showDepartment";
        }
    }
}
