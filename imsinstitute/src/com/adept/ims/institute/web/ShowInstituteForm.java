/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.Institute;
import com.adept.ims.institute.service.InstituteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;

/**
 *
 * @author Viswanath
 */
@Controller
@RequestMapping("/institute/showInstitute.do")
public class ShowInstituteForm {

    private final InstituteService instituteService;

    @Autowired
    public ShowInstituteForm(InstituteService instituteService) {
        this.instituteService = instituteService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"instituteId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        return "institute/showInstitute";
    }
}
