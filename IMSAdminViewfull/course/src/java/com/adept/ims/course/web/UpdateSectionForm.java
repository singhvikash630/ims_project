package com.adept.ims.course.web;

import com.adept.ims.course.database.pojo.Section;
import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.course.service.SectionService;
import com.adept.ims.course.service.SubjectService;
import com.adept.ims.course.validator.SectionValidator;
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
@RequestMapping("/course/updateSection.do")
@SessionAttributes(types = Section.class)
public class UpdateSectionForm {

    private final SectionService sectionService;

    @Autowired
    public UpdateSectionForm(SectionService sectionService) {
        this.sectionService = sectionService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"sectionId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("sectionId") long sectionId, Model model) {
       Section section = this.sectionService.get(sectionId);
        model.addAttribute(section);
        return "course/updateSection";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("mode") String addMode,
            @ModelAttribute Section section, BindingResult result, Model model, SessionStatus status) {

        if (addMode.trim().equals("cancel")) {
            return "redirect:findSection.do";
        } else if (addMode.trim().equals("delete")) {
            this.sectionService.remove(section.getSectionId());
            return "redirect:deleteConfirmSection.do?sectionId="+section.getSectionId();
        }

        new SectionValidator().validate(section, result);
        if (result.hasErrors()) {
            return "course/updateSubject";
        } else {
            this.sectionService.update(section);
            status.setComplete();
            section.setNew(false);
            model.addAttribute("subject", section);
            return "course/showSection";
        }
    }
}
