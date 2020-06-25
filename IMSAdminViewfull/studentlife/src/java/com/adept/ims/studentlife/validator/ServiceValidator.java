package com.adept.ims.authorization.validator;

import com.adept.ims.authorization.database.pojo.Service;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

/**
 * <code>Validator</code> for <code>Trust</code> forms.
 *
 */
public class ServiceValidator {

    public void validate(Service service, Errors errors) {
        if (!StringUtils.hasLength(service.getServiceName())) {
            errors.rejectValue("serviceName", "required", "required");
        }
        if (!StringUtils.hasLength(service.getDescription())) {
            errors.rejectValue("description", "required", "required");
        }

    /**
     *
    Following example is for numeric value
    String telephone = trust.getTelephone();
    if (!StringUtils.hasLength(telephone)) {
    errors.rejectValue("telephone", "required", "required");
    }
    else {
    for (int i = 0; i < telephone.length(); ++i) {
    if ((Character.isDigit(telephone.charAt(i))) == false) {
    errors.rejectValue("telephone", "nonNumeric", "non-numeric");
    break;
    }
    }
     */
    }
}
