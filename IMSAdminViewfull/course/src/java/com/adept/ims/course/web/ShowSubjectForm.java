package com.adept.ims.course.web;

import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.course.service.SubjectService;

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
@RequestMapping("/course/showSubject.do")
public class ShowSubjectForm {

	private final SubjectService subjectService;

	@Autowired
	public ShowSubjectForm(SubjectService subjectService) {
		this.subjectService = subjectService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"subjectId"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
		model.addAttribute("subject", new Subject());
		return "course/viewSubjects";
	}

	@RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(Subject subject, BindingResult result, Model model) {
		// find trust by trust name
		Collection<Subject> results = this.subjectService.getByName(subject.getSubjectName());
		if (results.size() < 1) {
			// no trusts found
			result.rejectValue("subjectName", "notFound", "not found");
			return "course/viewSubjects";
		} else {
			// trusts found
			model.addAttribute("selections", results);
			return "viewSubjects";
		}
	}

}
