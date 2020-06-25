package com.adept.ims.course.web;

import com.adept.ims.course.database.pojo.Discipline;
import com.adept.ims.course.database.pojo.Section;
import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.course.service.DisciplineService;
import com.adept.ims.course.service.SectionService;
import com.adept.ims.course.service.SubjectService;
import com.adept.ims.course.validator.DisciplineValidator;
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
@RequestMapping("/course/updateDiscipline.do")
@SessionAttributes(types = Discipline.class)
public class UpdateDisciplineForm {

    private final DisciplineService disciplineService;

    @Autowired
    public UpdateDisciplineForm(DisciplineService disciplineService) {
        this.disciplineService = disciplineService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"disciplineId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(@RequestParam("disciplineId") long disciplineId, Model model) {
       Discipline discipline = this.disciplineService.get(disciplineId);
        model.addAttribute(discipline);
        return "course/updateDiscipline";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("mode") String addMode,
            @ModelAttribute Discipline discipline, BindingResult result, Model model, SessionStatus status) {

        if (addMode.trim().equals("cancel")) {
            return "redirect:findDiscipline.do";
        } else if (addMode.trim().equals("delete")) {
            this.disciplineService.remove(discipline.getDisciplineId());
            return "redirect:deleteConfirmDiscipline.do?disciplineId="+discipline.getDisciplineId();
        }

        new DisciplineValidator().validate(discipline, result);
        if (result.hasErrors()) {
            return "course/updateDiscipline";
        } else {
            this.disciplineService.update(discipline);
            status.setComplete();
            discipline.setNew(false);
            model.addAttribute("discipline", discipline);
            return "course/showDiscipline";
        }
    }
}
