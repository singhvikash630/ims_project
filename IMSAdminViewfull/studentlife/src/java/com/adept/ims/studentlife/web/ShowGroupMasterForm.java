package com.adept.ims.authorization.web;

import com.adept.ims.authorization.database.pojo.GroupMaster;
import com.adept.ims.authorization.service.GroupMasterService;
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
@RequestMapping("/authorization/showGroupmaster.do")
public class ShowGroupMasterForm {

	private final GroupMasterService groupMasterService;

	@Autowired
	public ShowGroupMasterForm(GroupMasterService groupMasterService) {
		this.groupMasterService = groupMasterService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"id"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
		model.addAttribute("groupMaster", new GroupMaster());
		return "authorization/viewGroupMasters";
	}

	@RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(GroupMaster groupMaster, BindingResult result, Model model) {
		// find trust by trust name
		Collection<GroupMaster> results = this.groupMasterService.getByName(groupMaster.getGroupName());
		if (results.size() < 1) {
			// no trusts found
			result.rejectValue("groupName", "notFound", "not found");
			return "authorization/viewGroupMasters";
		} else {
			// trusts found
			model.addAttribute("selections", results);
			return "viewGroupMasters";
		}
	}

}
