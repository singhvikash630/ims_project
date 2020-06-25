package com.adept.ims.course.web;

import com.adept.ims.course.database.pojo.Discipline;
import com.adept.ims.course.database.pojo.Section;
import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.course.service.DisciplineService;
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
@RequestMapping("/course/showDiscipline.do")
public class ShowDisciplineForm {

	private final DisciplineService disciplineService;

	@Autowired
	public ShowDisciplineForm(DisciplineService disciplineService) {
		this.disciplineService = disciplineService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"disciplineId"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
		model.addAttribute("discipline", new Discipline());
		return "course/viewDisciplines";
	}

	@RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(Discipline discipline, BindingResult result, Model model) {
		// find trust by trust name
		Collection<Discipline> results = this.disciplineService.getByName(discipline.getDisciplineName());
		if (results.size() < 1) {
			// no trusts found
			result.rejectValue("disciplineName", "notFound", "not found");
			return "course/viewDisciplines";
		} else {
			// trusts found
			model.addAttribute("selections", results);
			return "viewDisciplines";
		}
	}

}

