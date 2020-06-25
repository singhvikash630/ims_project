package com.adept.ims.course.web;

import com.adept.ims.course.service.SubjectService;

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
@RequestMapping("/course/deleteConfirmSubject.do")
public class DeleteConfirmSubjectForm {

    private final SubjectService subjectService;

    @Autowired
    public DeleteConfirmSubjectForm(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"subjectId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("subjectId") int subjectId,Model model) {
        model.addAttribute("subjectId", subjectId);
        return "course/deleteConfirmSubject";
    }
}
