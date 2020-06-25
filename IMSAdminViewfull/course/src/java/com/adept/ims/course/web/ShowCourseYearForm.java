package com.adept.ims.course.web;

import com.adept.ims.course.database.pojo.CourseYear;
import com.adept.ims.course.database.pojo.Discipline;
import com.adept.ims.course.database.pojo.Section;
import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.course.service.CourseYearService;
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
@RequestMapping("/course/showCourseYear.do")
public class ShowCourseYearForm {

	private final CourseYearService courseYearService;

	@Autowired
	public ShowCourseYearForm(CourseYearService courseYearService) {
		this.courseYearService = courseYearService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"courseYearId"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
		model.addAttribute("courseYear", new CourseYear());
		return "course/viewCourseYears";
	}

	@RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(CourseYear courseYear, BindingResult result, Model model) {
		// find trust by trust name
		Collection<CourseYear> results = this.courseYearService.getByName(courseYear.getYear());
		if (results.size() < 1) {
			// no trusts found
			result.rejectValue("year", "notFound", "not found");
			return "course/viewCourseYears";
		} else {
			// trusts found
			model.addAttribute("selections", results);
			return "viewCourseYears";
		}
	}

}

