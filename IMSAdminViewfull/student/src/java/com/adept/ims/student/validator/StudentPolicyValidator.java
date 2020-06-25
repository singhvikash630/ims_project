package com.adept.ims.student.validator;

import com.adept.ims.student.database.pojo.StudentPolicy;
import org.springframework.validation.Errors;

/**
 * <code>Validator</code> for <code>Trust</code> forms.
 *
 */
public class StudentPolicyValidator {

    public void validate(StudentPolicy studentPolicy, Errors errors) {

        String str1 = String.valueOf(studentPolicy.getPolicy());
        String str2 = String.valueOf(studentPolicy.getAudit());

        if(str1.equals("") || str1.equals("null"))
        {
            errors.rejectValue("str1", "required", "required");
        }
        if(str2.equals("") || str2.equals("null"))
        {
            errors.rejectValue("str2", "required", "required");
        }

       /* if (!StringUtils.hasLength(studentpolicy.getStudentPolicyName())) {
            errors.rejectValue("studentpolicyName", "required", "required");
        }
        if (!StringUtils.hasLength(studentpolicy.getAddress())) {
            errors.rejectValue("address", "required", "required");
        }*/

    
    }
}
