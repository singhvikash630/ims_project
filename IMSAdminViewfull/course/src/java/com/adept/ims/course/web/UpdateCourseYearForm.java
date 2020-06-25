package com.adept.ims.course.web;

import com.adept.ims.course.database.pojo.CourseYear;
import com.adept.ims.course.database.pojo.Discipline;
import com.adept.ims.course.database.pojo.Section;

import com.adept.ims.course.service.CourseYearService;

import com.adept.ims.course.validator.CourseYearValidator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.WebDataBinder;

/**
 * JavaBean Form controller that is used to edit an existing <code>Trust</code>.
 */
@Controller
@RequestMapping("/course/updateCourseYear.do")
@SessionAttributes(types = CourseYear.class)
public class UpdateCourseYearForm {

    private final CourseYearService courseYearService;

    @Autowired
    public UpdateCourseYearForm(CourseYearService courseYearService) {
        this.courseYearService = courseYearService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"courseYearId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("courseYearId") long courseYearId, Model model) {
      CourseYear courseYear = this.courseYearService.get(courseYearId);
        model.addAttribute(courseYear);
        return "course/updateCourseYear";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("mode") String addMode,
            @ModelAttribute CourseYear courseYear, BindingResult result, Model model, SessionStatus status) {

        if (addMode.trim().equals("cancel")) {
            return "redirect:findCourseYear.do";
        } else if (addMode.trim().equals("delete")) {
            this.courseYearService.remove(courseYear.getCourseYearId());
            return "redirect:deleteConfirmCourseYear.do?courseYearId="+courseYear.getCourseYearId();
        }

        new CourseYearValidator().validate(courseYear, result);
        if (result.hasErrors()) {
            return "course/updateCourseYear";
        } else {
            this.courseYearService.update(courseYear);
            status.setComplete();
            courseYear.setNew(false);
            model.addAttribute("courseYear", courseYear);
            return "course/showCourseYear";
        }
    }
}
