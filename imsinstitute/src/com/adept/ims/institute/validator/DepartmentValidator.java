/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.validator;

import com.adept.ims.institute.database.pojo.Department;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class DepartmentValidator {

    public void validate(Department department, Errors errors) {

        String instituteId = String.valueOf(department.getInstitute().getInstituteId());

        if (!StringUtils.hasLength(department.getName())) {
            errors.rejectValue("name", "required", "required");
        }

        if (!StringUtils.hasLength(department.getDescription())) {
            errors.rejectValue("description", "required", "required");
        }

        if (instituteId.equals("") || instituteId == null) {
            errors.rejectValue("institute.instituteId", "required", "required");
        }
    }
}
