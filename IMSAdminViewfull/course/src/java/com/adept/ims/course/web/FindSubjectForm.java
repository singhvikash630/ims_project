package com.adept.ims.course.web;

import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.course.service.SubjectService;


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

/**
 * JavaBean Form controller that is used to search for <code>Trust</code>s by
 * trust name.
 *
 */
@Controller
@RequestMapping("/course/findSubject.do")
public class FindSubjectForm {

	private final SubjectService subjectService;

	@Autowired
	public FindSubjectForm(SubjectService subjectService) {
		this.subjectService = subjectService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"subjectId"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
        model.addAttribute("subject", new Subject());
        model.addAttribute("searchMode","basic");
   /**     model.addAttribute("basicMode", "display:block");
		model.addAttribute("advanceMode", "display:none"); **/
		return "course/findSubject";
	}

	@RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(@RequestParam("searchMode") String searchMode,@RequestParam("basicSearchValue") String basicSearchValue ,
            @RequestParam("operator") String operator,Subject subject, BindingResult result, Model model) {
		// find trust by trust name
        // For basic search
        List<Subject> results;
        if(searchMode.equals("basic")) {
          results = this.subjectService.getByName(basicSearchValue);
       /**     model.addAttribute("basicMode", "display:block");
            model.addAttribute("advanceMode", "display:none"); **/
        } else {
            results = this.subjectService.getByOperator(subject,operator);
     /**       model.addAttribute("basicMode", "display:none");
            model.addAttribute("advanceMode", "display:block"); **/
        }
if (results == null || results.size() == 0) {
			// no trusts found            
			result.rejectValue("subjectName", "notFound", "not found");
		} else {
			// trusts found
			model.addAttribute("selections", results);			
		}
        model.addAttribute("searchMode",searchMode);
        return "course/findSubject";
	}
}
