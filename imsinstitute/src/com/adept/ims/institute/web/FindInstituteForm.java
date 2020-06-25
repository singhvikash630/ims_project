/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.Institute;
import com.adept.ims.institute.database.pojo.InstituteMaster;
import com.adept.ims.institute.database.pojo.Trust;
import com.adept.ims.institute.service.InstituteService;
import java.util.ArrayList;
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

/**
 *
 * @author Viswanath
 */
@Controller
@RequestMapping("/institute/findInstitute.do")
public class FindInstituteForm {

    private final InstituteService instituteService;

    @Autowired
    public FindInstituteForm(InstituteService instituteService) {
        this.instituteService = instituteService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"instituteId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        Institute institute = new Institute();
        model.addAttribute("institute", institute);
        model.addAttribute("searchMode", "basic");
        return "institute/findInstitute";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("searchMode") String searchMode,
            @RequestParam("basicSearchValue") String basicSearchValue,
            @RequestParam("operator") String operator, Institute institute,
            BindingResult result, Model model) {
        // find trust by trust name
        // For basic search
        List<Institute> results = null;
        if (searchMode.equals("basic")) {
            if (!"".equals(basicSearchValue.trim())) {
                Institute insObj = this.instituteService.getByPrimaryKey(Long.valueOf(basicSearchValue));
                if (insObj != null) {
                    results = new ArrayList<Institute>();
                    results.add(insObj);
                }
            }
        } else {
            results = this.instituteService.getByOperator(institute, operator);
        }
        model.addAttribute("selections", results);
        model.addAttribute("searchMode", searchMode);
        return "institute/findInstitute";
    }
}
