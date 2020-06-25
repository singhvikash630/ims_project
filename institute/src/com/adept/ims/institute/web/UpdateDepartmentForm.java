package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.Department;
import com.adept.ims.institute.service.DepartmentService;
import com.adept.ims.institute.validator.DepartmentValidator;

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
@RequestMapping("/institute/updateDepartment.do")
@SessionAttributes(types = Department.class)
public class UpdateDepartmentForm {

    private final DepartmentService departmentService;

    @Autowired
    public UpdateDepartmentForm(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"departmentId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("departmentId") long departmentId, Model model) {
        Department department = this.departmentService.get(departmentId);
        model.addAttribute(department);
        return "institute/updateDepartment";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("mode") String addMode,
            @ModelAttribute Department department, BindingResult result, Model model, SessionStatus status) {

        if (addMode.trim().equals("cancel")) {
            return "redirect:findDepartment.do";
        } else if (addMode.trim().equals("delete")) {
            this.departmentService.remove(department.getDepartmentId());
            return "redirect:deleteConfirmDepartment.do?departmentId=" + department.getDepartmentId();
        }

        new DepartmentValidator().validate(department, result);

        if (result.hasErrors()) {
            return "institute/updateDepartment";
        } else {
            department.getAudit().setModifiedDate(new Date());
            this.departmentService.update(department);
            status.setComplete();
            department.setNew(false);
            model.addAttribute("department", department);
            return "institute/showDepartment";
        }
    }
}
