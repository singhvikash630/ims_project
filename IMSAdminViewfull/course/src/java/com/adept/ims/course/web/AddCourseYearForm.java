package com.adept.ims.course.web;




import com.adept.ims.course.database.pojo.CourseYear;

import com.adept.ims.course.service.CourseYearService;

import com.adept.ims.course.validator.CourseYearValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * JavaBean form controller that is used to add a new <code>Trust</code> to
 * the system.
 *
 */
@Controller
@RequestMapping("/course/addCourseYear.do")
@SessionAttributes(types = CourseYearService.class)
public class AddCourseYearForm {

    private final CourseYearService courseYearService;

    @Autowired
    public AddCourseYearForm(CourseYearService courseYearService) {
        this.courseYearService = courseYearService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"courseYearId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        CourseYear courseYear = new CourseYear();
        model.addAttribute(courseYear);
        return "course/addCourseYear";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("addMode") String addMode,
            @ModelAttribute CourseYear courseYear, BindingResult result, Model model, SessionStatus status) {
        if (addMode.trim().equals("cancel")) {
            return "redirect:findCourseYear.do";
        }
        new CourseYearValidator().validate(courseYear, result);
        if (result.hasErrors()) {
            return "course/addCourseYear";
        } else {
            this.courseYearService.save(courseYear);
            courseYear.setNew(true);
            model.addAttribute("courseYear", courseYear);
            return "course/showCourseYear";
        }
    }
}
