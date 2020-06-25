package com.adept.ims.course.web;

import com.adept.ims.course.database.pojo.CourseYear;


import com.adept.ims.course.service.CourseYearService;




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
@RequestMapping("/course/findCourseYear.do")
public class FindCourseYearForm {

	private final CourseYearService courseYearService;

	@Autowired
	public FindCourseYearForm(CourseYearService courseYearService) {
		this.courseYearService = courseYearService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"courseYearId"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
        model.addAttribute("courseYear", new CourseYear());
        model.addAttribute("searchMode","basic");
   /**     model.addAttribute("basicMode", "display:block");
		model.addAttribute("advanceMode", "display:none"); **/
		return "course/findCourseYear";
	}

	@RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(@RequestParam("searchMode") String searchMode,@RequestParam("basicSearchValue") String basicSearchValue ,
            @RequestParam("operator") String operator,CourseYear courseYear, BindingResult result, Model model) {
		// find trust by trust name
        // For basic search
        List<CourseYear> results;
        if(searchMode.equals("basic")) {
          results = this.courseYearService.getByName(basicSearchValue);
       /**     model.addAttribute("basicMode", "display:block");
            model.addAttribute("advanceMode", "display:none"); **/
        } else {
            results = this.courseYearService.getByOperator(courseYear,operator);
     /**       model.addAttribute("basicMode", "display:none");
            model.addAttribute("advanceMode", "display:block"); **/
        }
if (results == null || results.size() == 0) {
			// no trusts found
			result.rejectValue("year", "notFound", "not found");
		} else {
			// trusts found
			model.addAttribute("selections", results);
		}
        model.addAttribute("searchMode",searchMode);
        return "course/findCourseYear";
	}
}
