/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.validator;

import com.adept.ims.institute.database.pojo.Designation;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class DesignationValidator {

    public void validate(Designation designation, Errors errors) {

        String maxSal = String.valueOf(designation.getMaxSalary());
        String minSal = String.valueOf(designation.getMinSalary());
        String instituteId = String.valueOf(designation.getInstitute().getInstituteId());

        if (!StringUtils.hasLength(designation.getName())) {
            errors.rejectValue("name", "required", "required");
        }
        if (minSal.equals("") || minSal == null) {
            errors.rejectValue("minSalary", "required", "required");
        }
        if (maxSal.equals("") || maxSal == null) {
            errors.rejectValue("maxSalary", "required", "required");
        }
        if (instituteId.equals("") || instituteId == null) {
            errors.rejectValue("institute.instituteId", "required", "required");
        }
    }
}
