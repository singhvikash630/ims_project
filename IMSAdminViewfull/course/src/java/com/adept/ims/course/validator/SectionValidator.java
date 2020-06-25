package com.adept.ims.course.validator;

import com.adept.ims.course.database.pojo.Section;


import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

/**
 * <code>Validator</code> for <code>Trust</code> forms.
 *
 */
public class SectionValidator {

    public void validate(Section section, Errors errors) {
        if (!StringUtils.hasLength(section.getSectionName())) {
            errors.rejectValue("sectionName", "required", "required");
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
