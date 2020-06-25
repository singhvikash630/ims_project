package com.adept.ims.authorization.web;

import com.adept.ims.authorization.database.pojo.RoleService;
import com.adept.ims.authorization.service.RolesService;
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
@RequestMapping("/authorization/showRoleService.do")
public class ShowRoleServiceForm {

	private final RolesService rolesService;

	@Autowired
	public ShowRoleServiceForm(RolesService rolesService) {
		this.rolesService = rolesService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"id"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
		model.addAttribute("", new RoleService());
		return "authorization/viewRoleServices";
	}

    @RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(RoleService roleService, BindingResult result, Model model) {
		// find trust by trust name

			return "viewRoleServices";
		}

}
