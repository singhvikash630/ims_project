/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.Department;
import com.adept.ims.institute.database.pojo.Institute;
import com.adept.ims.institute.service.DepartmentService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/institute/findDepartment.do")
public class FindDepartmentForm {

    private final DepartmentService departmentService;

    @Autowired
    public FindDepartmentForm(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"DepartmentId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        Department department = new Department();
        department.setInstitute(new Institute());
        model.addAttribute("department", new Department());
        model.addAttribute("searchMode", "basic");
        return "institute/findDepartment";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("searchMode") String searchMode, @RequestParam("basicSearchValue") String basicSearchValue,
            @RequestParam("operator") String operator, Department department, BindingResult result, Model model) {
   
        List<Department> results;
        if (searchMode.equals("basic")) {
            results = this.departmentService.getByName(basicSearchValue);
        } else {
            results = this.departmentService.getByOperator(department, operator);
        }

        // trusts found
        model.addAttribute("selections", results);
        model.addAttribute("searchMode", searchMode);
        return "institute/findDepartment";
    }
}
