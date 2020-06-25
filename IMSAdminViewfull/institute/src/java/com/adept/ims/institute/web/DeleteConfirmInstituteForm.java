/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.institute.web;
import com.adept.ims.institute.service.InstituteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author Viswanath
 */

@Controller
@RequestMapping("/institute/deleteConfirmInstitute.do")
public class DeleteConfirmInstituteForm {

       private final InstituteService instituteService;

    @Autowired
    public DeleteConfirmInstituteForm(InstituteService instituteService) {
        this.instituteService =instituteService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"instituteId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("instituteId") int instituteId,Model model) {
        model.addAttribute("instituteId", instituteId);
        return "institute/deleteConfirmInstitute";
    }
}
