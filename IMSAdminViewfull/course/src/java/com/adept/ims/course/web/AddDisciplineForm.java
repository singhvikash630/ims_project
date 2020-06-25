package com.adept.ims.course.web;




import com.adept.ims.course.database.pojo.Discipline;
import com.adept.ims.course.database.pojo.Section;
import com.adept.ims.course.service.DisciplineService;
import com.adept.ims.course.service.SectionService;
import com.adept.ims.course.validator.DisciplineValidator;
import com.adept.ims.course.validator.SectionValidator;
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
@RequestMapping("/course/addDiscipline.do")
@SessionAttributes(types = Discipline.class)
public class AddDisciplineForm {

    private final DisciplineService disciplineService;

    @Autowired
    public AddDisciplineForm(DisciplineService disciplineService) {
        this.disciplineService = disciplineService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"disciplineId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        Discipline discipline = new Discipline();
        model.addAttribute(discipline);
        return "course/addDiscipline";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("addMode") String addMode,
            @ModelAttribute Discipline discipline, BindingResult result, Model model, SessionStatus status) {
        if (addMode.trim().equals("cancel")) {
            return "redirect:findDiscipline.do";
        }
        new DisciplineValidator().validate(discipline, result);
        if (result.hasErrors()) {
            return "course/addDiscipline";
        } else {
            this.disciplineService.save(discipline);
            discipline.setNew(true);
            model.addAttribute("discipline", discipline);
            return "course/showDiscipline";
        }
    }
}
