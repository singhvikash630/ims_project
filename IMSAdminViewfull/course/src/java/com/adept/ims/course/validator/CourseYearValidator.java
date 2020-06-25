package com.adept.ims.course.validator;

import com.adept.ims.course.database.pojo.CourseYear;



import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

/**
 * <code>Validator</code> for <code>Trust</code> forms.
 *
 */
public class CourseYearValidator {

    public void validate(CourseYear courseYear, Errors errors) {
        if (!StringUtils.hasLength(courseYear.getYear())) {
            errors.rejectValue("year", "required", "required");
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

