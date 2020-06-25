package com.adept.ims.student.validator;

import com.adept.ims.student.database.pojo.Alumni;
import org.springframework.validation.Errors;

/**
 * <code>Validator</code> for <code>Trust</code> forms.
 *
 */
public class AlumniValidator {

    

    public void validate(Alumni Alumni, Errors errors) {

        String str1 = String.valueOf(Alumni.getAudit());
        String str2 = String.valueOf(Alumni.getPerson());
        String str3 = String.valueOf(Alumni.getInstitute());

        if(str1.equals("") || str1.equals("null"))
        {
            errors.rejectValue("str1", "required", "required");
        }
        if(str2.equals("") || str2.equals("null"))
        {
            errors.rejectValue("str2", "required", "required");
        }
        if(str3.equals("") || str3.equals("null"))
        {
            errors.rejectValue("str3", "required", "required");
        }

      /*  if (!StringUtils.hasLength(Alumni.getAlumniName())) {
            errors.rejectValue("AlumniName", "required", "required");
        }
        if (!StringUtils.hasLength(Alumni.getAddress())) {
            errors.rejectValue("address", "required", "required");
        }*/

    
    }
}
