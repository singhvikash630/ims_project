package com.adept.ims.institute.validator;

import com.adept.ims.common.validator.AddressValidator;
import com.adept.ims.institute.database.pojo.Trust;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

/**
 * <code>Validator</code> for <code>Trust</code> forms.
 *
 */
public class TrustValidator {

    public void validate(Trust trust, Errors errors) {

        if (!StringUtils.hasLength(trust.getTrustName().trim())) {
            errors.rejectValue("trustName", "required", "required");
        }
        AddressValidator.validate(trust.getAddress(), errors);
    }
}
