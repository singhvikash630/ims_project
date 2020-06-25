
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.curriculum.validator;

import com.adept.ims.curriculum.database.pojo.Assignment;
import org.springframework.validation.BindingResult;


import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
/**
 *
 * @author shipra
 */
  /*public class FeeExemptionValidator {

    public void validate(FeeExemption feeExemption, BindingResult result) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

} */
public class AssignmentValidator {

    public void validate(Assignment assignment, Errors errors) {

        String assignId = String.valueOf(assignment.getAssignId());
        

        if (!StringUtils.hasLength(assignment.getAudit().toString())) {
            errors.rejectValue("courseYear", "required", "required");
        }
        if (!StringUtils.hasLength(assignment.getSubject().toString())) {
            errors.rejectValue("audit", "required", "required");
        }
        if (!StringUtils.hasLength(assignment.getStaff().toString())) {
            errors.rejectValue("student", "required", "required");
        }
        /* (!StringUtils.hasLength(feeExemption.getAmount().toString())) {
            errors.rejectValue("amount", "required", "required");
        } */
         if(assignId.equals("")||assignId==null)
         {
             errors.rejectValue("amount", "required", "required");
         }
        


        
    }
}