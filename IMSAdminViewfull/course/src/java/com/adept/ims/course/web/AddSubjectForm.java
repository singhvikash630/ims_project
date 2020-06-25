package com.adept.ims.course.web;

import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.course.service.SubjectService;
import com.adept.ims.course.validator.SubjectValidator;


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
@RequestMapping("/course/addSubject.do")
@SessionAttributes(types = Subject.class)
public class AddSubjectForm {

    private final SubjectService subjectService;

    @Autowired
    public AddSubjectForm(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"subjectId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        Subject subject = new Subject();
        model.addAttribute(subject);
        return "course/addSubject";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("addMode") String addMode,
            @ModelAttribute Subject subject, BindingResult result, Model model, SessionStatus status) {
        if (addMode.trim().equals("cancel")) {
            return "redirect:findSubject.do";
        }
        new SubjectValidator().validate(subject, result);
        if (result.hasErrors()) {
            return "course/addSubject";
        } else {
            this.subjectService.save(subject);
            subject.setNew(true);
            model.addAttribute("subject", subject);
            return "course/showSubject";
        }
    }
}
