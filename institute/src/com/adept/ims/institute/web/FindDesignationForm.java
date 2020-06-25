/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.institute.web;
import com.adept.ims.institute.database.pojo.Designation;
import com.adept.ims.institute.service.DesignationService;

import java.util.Collection;
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
@RequestMapping("/institute/findDesignation.do")
public class FindDesignationForm {

    private final DesignationService designationService;


	@Autowired
	public FindDesignationForm(DesignationService designationService) {
		this.designationService = designationService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"DesignationId"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
        model.addAttribute("designation", new Designation());
        model.addAttribute("searchMode","basic");
   /**     model.addAttribute("basicMode", "display:block");
		model.addAttribute("advanceMode", "display:none"); **/
		return "institute/findDesignation";
	}

	@RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(@RequestParam("searchMode") String searchMode,@RequestParam("basicSearchValue") String basicSearchValue ,
            @RequestParam("operator") String operator,Designation designation, BindingResult result, Model model) {
		// find trust by trust name
        // For basic search
        List<Designation> results;
        if(searchMode.equals("basic")) {
            results = this.designationService.getByName(basicSearchValue);
       /**     model.addAttribute("basicMode", "display:block");
            model.addAttribute("advanceMode", "display:none"); **/
        } else {
            results = this.designationService.getByOperator(designation,operator);
     /**       model.addAttribute("basicMode", "display:none");
            model.addAttribute("advanceMode", "display:block"); **/
        }
		if (results == null || results.size() == 0) {
			// no trusts found
			result.rejectValue("designationname", "notFound", "not found");
		} else {
			// trusts found
			model.addAttribute("selections", results);
		}
        model.addAttribute("searchMode",searchMode);
        return "institute/findDesignation";
	}


}
