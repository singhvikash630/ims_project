package com.adept.ims.authorization.web;

import com.adept.ims.authorization.database.pojo.Role;
import com.adept.ims.authorization.service.RoleService;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;

/**
 * JavaBean Form controller that is used to search for <code>Trust</code>s by
 * trust name.
 *
 */
@Controller
@RequestMapping("/authorization/showRole.do")
public class ShowRoleForm {

	private final RoleService roleService;

	@Autowired
	public ShowRoleForm(RoleService roleService) {
		this.roleService = roleService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"id"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
		model.addAttribute("", new Role());
		return "authorization/viewRoles";
	}

	@RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(Role role, BindingResult result, Model model) {
		// find trust by trust name
		Collection<Role> results = this.roleService.getByName(role.getRoleName());
		if (results.size() < 1) {
			// no trusts found
			result.rejectValue("roleName", "notFound", "not found");
			return "authorization/viewRoles";
		} else {
			// trusts found
			model.addAttribute("selections", results);
			return "viewRoles";
		}
	}

}
