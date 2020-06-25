package com.adept.ims.course.web;




import com.adept.ims.course.database.pojo.Section;
import com.adept.ims.course.service.SectionService;
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
@RequestMapping("/course/addSection.do")
@SessionAttributes(types = Section.class)
public class AddSectionForm {

    private final SectionService sectionService;

    @Autowired
    public AddSectionForm(SectionService sectionService) {
        this.sectionService = sectionService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"sectionId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        Section section = new Section();
        model.addAttribute(section);
        return "course/addSection";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("addMode") String addMode,
            @ModelAttribute Section section, BindingResult result, Model model, SessionStatus status) {
        if (addMode.trim().equals("cancel")) {
            return "redirect:findSection.do";
        }
        new SectionValidator().validate(section, result);
        if (result.hasErrors()) {
            return "course/addSection";
        } else {
            this.sectionService.save(section);
            section.setNew(true);
            model.addAttribute("section", section);
            return "course/showSection";
        }
    }
}
