package com.adept.ims.course.web;

import com.adept.ims.course.service.CourseYearService;
import com.adept.ims.course.service.DisciplineService;


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
 * JavaBean Form controller that is used to edit an existing <code>Trust</code>.
 */
@Controller
@RequestMapping("/course/deleteConfirmCourseYear.do")
public class DeleteConfirmCourseYearForm {

    private final CourseYearService courseYearService;

    @Autowired
    public DeleteConfirmCourseYearForm(CourseYearService courseYearService) {
        this.courseYearService = courseYearService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"courseYearId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("courseYearId") int courseYearId,Model model) {
        model.addAttribute("courseYearId", courseYearId);
        return "course/deleteConfirmCourseYear";
    }
}
