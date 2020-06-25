package com.adept.ims.course.web;

import com.adept.ims.course.database.pojo.Section;
import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.course.service.SectionService;
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
@RequestMapping("/course/showSection.do")
public class ShowSectionForm {

	private final SectionService sectionService;

	@Autowired
	public ShowSectionForm(SectionService sectionService) {
		this.sectionService = sectionService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"sectionId"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
		model.addAttribute("section", new Section());
		return "course/viewSections";
	}

	@RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(Section section, BindingResult result, Model model) {
		// find trust by trust name
		Collection<Section> results = this.sectionService.getByName(section.getSectionName());
		if (results.size() < 1) {
			// no trusts found
			result.rejectValue("sectionName", "notFound", "not found");
			return "course/viewSections";
		} else {
			// trusts found
			model.addAttribute("selections", results);
			return "viewSections";
		}
	}

}

