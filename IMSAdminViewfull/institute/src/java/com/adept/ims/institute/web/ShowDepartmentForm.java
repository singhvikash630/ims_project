/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.Department;
import com.adept.ims.institute.service.DepartmentService;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;

/**
 * JavaBean Form controller that is used to search for <code>Trust</code>s by
 * trust name.
 *
 */
@Controller
@RequestMapping("/institute/showDepartment.do")
public class ShowDepartmentForm {

	private final DepartmentService departmentService;

	@Autowired
	public ShowDepartmentForm(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"departmentId"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
		return "institute/showDepartment";
	}
}


