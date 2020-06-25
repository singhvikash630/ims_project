package com.adept.ims.authorization.web;

import com.adept.ims.authorization.database.pojo.PersonRole;
import com.adept.ims.authorization.service.PersonRoleService;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * JavaBean Form controller that is used to search for <code>Trust</code>s by
 * trust name.
 *
 */
@Controller
@RequestMapping("/authorization/findPersonRole.do")
public class FindPersonRoleForm {

	private final PersonRoleService personRoleService;

	@Autowired
	public FindPersonRoleForm(PersonRoleService personRoleService) {
		this.personRoleService = personRoleService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"id"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
        model.addAttribute("personRole", new PersonRole());
        model.addAttribute("searchMode","basic");
   /**     model.addAttribute("basicMode", "display:block");
		model.addAttribute("advanceMode", "display:none"); **/
		return "authorization/findPersonRole";
	}

	@RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(@RequestParam("searchMode") String searchMode,@RequestParam("basicSearchValue") String basicSearchValue ,
            @RequestParam("operator") String operator,PersonRole personRole, BindingResult result, Model model) {
		// find trust by trust name
        // For basic search

        model.addAttribute("searchMode",searchMode);
        return "authorization/findPersonRole";
	}
}
