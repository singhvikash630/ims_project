package com.adept.ims.institute.web;

import com.adept.ims.institute.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/institute/deleteConfirmDepartment.do")
public class DeleteConfirmDepartmentForm {

    private final DepartmentService departmentService;


     @Autowired
    public DeleteConfirmDepartmentForm(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"DepartmentId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("DepartmentId") int departmentId,Model model) {
        model.addAttribute("DepartmentId", departmentId);
        return "institute/deleteConfirmDepartment";
    }
}
