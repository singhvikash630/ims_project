/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.validator;

import com.adept.ims.common.validator.AddressValidator;
import com.adept.ims.institute.database.pojo.InstituteMaster;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

/**
 *
 * @author Viswanath
 */
public class InstituteMasterValidator {

    public void validate(InstituteMaster instituteMaster, Errors errors) {
        
        if (!StringUtils.hasLength(instituteMaster.getName().trim())) {
            errors.rejectValue("name", "required", "required");
        }
        if (!StringUtils.hasLength(instituteMaster.getType().trim())) {
            errors.rejectValue("type", "required", "required");
        }
        if (!StringUtils.hasLength(instituteMaster.getDescription().trim())) {
            errors.rejectValue("description", "required", "required");
        }
        AddressValidator.validate(instituteMaster.getAddress(), errors);
    }
}
