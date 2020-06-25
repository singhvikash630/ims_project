package com.adept.ims.institute.web;

import com.adept.ims.institute.database.pojo.Trust;
import com.adept.ims.institute.service.TrustService;

import java.util.ArrayList;
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
@RequestMapping("/institute/findTrust.do")
public class FindTrustForm {

    private final TrustService trustService;

    @Autowired
    public FindTrustForm(TrustService trustService) {
        this.trustService = trustService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String[]{"trustId"});
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        Trust trust = new Trust();
        model.addAttribute("trust", trust);
        model.addAttribute("searchMode", "basic");
        return "institute/findTrust";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestParam("searchMode") String searchMode, @RequestParam("basicSearchValue") String basicSearchValue,
            @RequestParam("operator") String operator, Trust trust, BindingResult result, Model model) {
        // find trust by trust name
        // For basic search
        List<Trust> results = null;
        if (searchMode.equals("basic")) {
            if (!"".equals(basicSearchValue.trim())) {
                Trust insObj = this.trustService.getByPrimaryKey(Long.valueOf(basicSearchValue));
                if (insObj != null) {
                    results = new ArrayList<Trust>();
                    results.add(insObj);
                }
            }
        } else {
            results = this.trustService.getByOperator(trust, operator);
        }
        // trusts found
        if (results != null) {
            model.addAttribute("selections", results);
        }
        model.addAttribute("searchMode", searchMode);
        trust = new Trust();
        model.addAttribute("trust", trust);
        return "institute/findTrust";
    }
}
