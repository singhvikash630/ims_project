package com.adept.ims.authorization.web;

import com.adept.ims.authorization.database.pojo.GroupMaster;
import com.adept.ims.authorization.service.GroupMasterService;

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
@RequestMapping("/authorization/findGroupMaster.do")
public class FindGroupMasterForm {

	private final GroupMasterService groupMasterService;

	@Autowired
	public FindGroupMasterForm(GroupMasterService groupMasterService) {
		this.groupMasterService = groupMasterService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"id"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
        model.addAttribute("groupMaster", new GroupMaster());
        model.addAttribute("searchMode","basic");
   /**     model.addAttribute("basicMode", "display:block");
		model.addAttribute("advanceMode", "display:none"); **/
		return "authorization/findGroupMaster";
	}

	@RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(@RequestParam("searchMode") String searchMode,@RequestParam("basicSearchValue") String basicSearchValue ,
            @RequestParam("operator") String operator,GroupMaster groupMaster, BindingResult result, Model model) {
		// find trust by trust name
        // For basic search
        List<GroupMaster> results;
        if(searchMode.equals("basic")) {
            results = this.groupMasterService.getByName(basicSearchValue);
       /**     model.addAttribute("basicMode", "display:block");
            model.addAttribute("advanceMode", "display:none"); **/
        } else {
            results = this.groupMasterService.getByOperator(groupMaster,operator);
     /**       model.addAttribute("basicMode", "display:none");
            model.addAttribute("advanceMode", "display:block"); **/
        }
		if (results == null || results.size() == 0) {
			// no trusts found
			result.rejectValue("groupName", "notFound", "not found");
		} else {
			// trusts found
			model.addAttribute("selections", results);
		}
        model.addAttribute("searchMode",searchMode);
        return "authorization/findGroupMaster";
	}
}
