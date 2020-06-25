/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.validator;

import com.adept.ims.institute.database.pojo.Institute;

import org.springframework.validation.Errors;
import org.springframework.util.StringUtils;

/**
 *
 * @author Viswanath
 */
public class InstituteValidator {

    public void validate(Institute institute, Errors errors) {
          if (!StringUtils.hasLength(String.valueOf(institute.getTrust().getTrustId()).trim())) {
            errors.rejectValue("trust.trustId", "required", "required");
        }
          if (!StringUtils.hasLength(String.valueOf(institute.getInstituteMaster().getInstituteMasterId()).trim())) {
            errors.rejectValue("institute.instituteId", "required", "required");
        }
    }
}
