/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.validator;


import com.adept.ims.institute.database.pojo.InstituteBuilding;
import org.springframework.validation.Errors;
import org.springframework.util.StringUtils;

/**
 *
 * @author Viswanath
 */
public class InstituteBuildingValidator {

    public void validate(InstituteBuilding instituteBuilding, Errors errors) {
          if (!StringUtils.hasLength(String.valueOf(instituteBuilding.getInstitute().getInstituteId()).trim())) {
            errors.rejectValue("institute.instituteId", "required", "required");
        }
          if (!StringUtils.hasLength(String.valueOf(instituteBuilding.getBuilding().getBuildingId()).trim())) {
            errors.rejectValue("building.buildingId", "required", "required");
        }
    }
}
