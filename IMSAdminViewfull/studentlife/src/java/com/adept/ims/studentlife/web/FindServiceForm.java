package com.adept.ims.authorization.web;

import com.adept.ims.authorization.database.pojo.Service;
import com.adept.ims.authorization.service.ServiceService;

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
@RequestMapping("/authorization/findService.do")
public class FindServiceForm {

	private final ServiceService serviceService;

	@Autowired
	public FindServiceForm(ServiceService serviceService) {
		this.serviceService = serviceService;
	}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[] {"id"});
    }

	@RequestMapping(method = RequestMethod.GET)
	public  String setupForm(Model model) {
        model.addAttribute("service", new Service());
        model.addAttribute("searchMode","basic");
   /**     model.addAttribute("basicMode", "display:block");
		model.addAttribute("advanceMode", "display:none"); **/
		return "authorization/findService";
	}

	@RequestMapping(method = RequestMethod.POST)
	public  String processSubmit(@RequestParam("searchMode") String searchMode,@RequestParam("basicSearchValue") String basicSearchValue ,
            @RequestParam("operator") String operator,Service service, BindingResult result, Model model) {
		// find trust by trust name
        // For basic search
        List<Service> results;
        if(searchMode.equals("basic")) {
            results = this.serviceService.getByName(basicSearchValue);
       /**     model.addAttribute("basicMode", "display:block");
            model.addAttribute("advanceMode", "display:none"); **/
        } else {
            results = this.serviceService.getByOperator(service,operator);
     /**       model.addAttribute("basicMode", "display:none");
            model.addAttribute("advanceMode", "display:block"); **/
        }
		if (results == null || results.size() == 0) {
			// no trusts found            
			result.rejectValue("serviceName", "notFound", "not found");
		} else {
			// trusts found
			model.addAttribute("selections", results);			
		}
        model.addAttribute("searchMode",searchMode);
        return "authorization/findService";
	}
}
