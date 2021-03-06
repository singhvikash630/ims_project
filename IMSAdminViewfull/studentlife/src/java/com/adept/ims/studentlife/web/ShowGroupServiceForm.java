package com.adept.ims.authorization.web;

import com.adept.ims.authorization.database.pojo.GroupService;
import com.adept.ims.authorization.service.GroupsService;
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
@RequestMapping("/authorization/showGroupService.do")
public class ShowGroupServiceForm {

	private final GroupsService groupsService;

	@Autowired
	public ShowGroupServiceForm(GroupsService groupsService) {
		this.groupsService = groupsService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"id"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
		model.addAttribute("", new GroupService());
		return "authorization/viewGroupServices";
	}

	@RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(GroupService groupService, BindingResult result, Model model) {
		// find groupService by name        
		Collection<GroupService> results = 
                    this.groupsService.getByName(Long.toString(groupService.getId()));
		if (results.size() < 1) {
			// no trusts found
			result.rejectValue("serviceId", "notFound", "not found");
			return "authorization/viewGroupServices";
		} else {
			// trusts found
			model.addAttribute("selections", results);
			return "viewGroupServices";
		}
	}

}
