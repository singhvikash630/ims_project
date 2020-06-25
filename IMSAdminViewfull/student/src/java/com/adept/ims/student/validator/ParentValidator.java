package com.adept.ims.student.validator;

import com.adept.ims.student.database.pojo.Parent;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

/**
 * <code>Validator</code> for <code>Trust</code> forms.
 *
 */
public class ParentValidator {
    
   public void validate(Parent parent, Errors errors) {
        
        if (!StringUtils.hasLength(parent.getRelationship())) {
            errors.rejectValue("relationship", "required", "required");
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
