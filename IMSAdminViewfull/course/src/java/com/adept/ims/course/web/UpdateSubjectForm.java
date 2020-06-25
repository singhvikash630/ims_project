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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.WebDataBinder;

/**
 * JavaBean Form controller that is used to edit an existing <code>Trust</code>.
 */
@Controller
@RequestMapping("/course/updateSubject.do")
@SessionAttributes(types = Subject.class)
public class UpdateSubjectForm {

    private final SubjectService subjectService;

    @Autowired
    public UpdateSubjectForm(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"subjectId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("subjectId") long subjectId, Model model) {
       Subject subject = this.subjectService.get(subjectId);
        model.addAttribute(subject);
        return "course/updateSubject";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("mode") String addMode,
            @ModelAttribute Subject subject, BindingResult result, Model model, SessionStatus status) {

        if (addMode.trim().equals("cancel")) {
            return "redirect:findSubject.do";
        } else if (addMode.trim().equals("delete")) {
            this.subjectService.remove(subject.getSubjectId());
            return "redirect:deleteConfirmSubject.do?subjectId="+subject.getSubjectId();
        }

        new SubjectValidator().validate(subject, result);
        if (result.hasErrors()) {
            return "course/updateSubject";
        } else {
            this.subjectService.update(subject);
            status.setComplete();
            subject.setNew(false);
            model.addAttribute("subject", subject);
            return "course/showSubject";
        }
    }
}
