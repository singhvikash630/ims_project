/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.InstituteMaster;
import com.adept.ims.institute.service.InstituteMasterService;

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
@RequestMapping("/institute/findInstituteMaster.do")
public class FindInstituteMasterForm {
//private final InstituteMasterService instituteMasterServicee=null;

    private InstituteMasterService instituteMasterService;
    //private InstituteMasterService instituteMasterService;

    @Autowired
    public FindInstituteMasterForm(InstituteMasterService instituteMasterService) {
        this.instituteMasterService = instituteMasterService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"instituteMasterId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        InstituteMaster instituteMaster = new InstituteMaster();
        model.addAttribute("instituteMaster",  instituteMaster);
        model.addAttribute("searchMode", "basic");
        return "institute/findInstituteMaster";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("searchMode") String searchMode, @RequestParam("basicSearchValue") String basicSearchValue,
            @RequestParam("operator") String operator, InstituteMaster instituteMaster, BindingResult result, Model model) {
        // find trust by trust name
        // For basic search
        List<InstituteMaster> results = null;
        if (searchMode.equals("basic")) {
            if (!"".equals(basicSearchValue.trim())) {
                InstituteMaster insObj = this.instituteMasterService.getByPrimaryKey(Long.valueOf(basicSearchValue));
                if (insObj != null) {
                    results = new ArrayList<InstituteMaster>();
                    results.add(insObj);
                }
            }
        } else {
            results = this.instituteMasterService.getByOperator(instituteMaster, operator);
        /**       model.addAttribute("basicMode", "display:none");
        model.addAttribute("advanceMode", "display:block"); **/
        }

        model.addAttribute("selections", results);
        model.addAttribute("searchMode", searchMode);
        return "institute/findInstituteMaster";
    }
}
