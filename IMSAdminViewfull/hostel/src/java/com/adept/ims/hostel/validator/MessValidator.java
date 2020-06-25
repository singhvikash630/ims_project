package com.adept.ims.hostel.validator;

import com.adept.ims.hostel.database.pojo.Mess;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class MessValidator {

    public void validate(Mess mess, Errors errors) {
        String str1 = (mess.getHostel()).toString();

      
        

        if (!StringUtils.hasLength(str1)) {
            errors.rejectValue("mess", "required", "required");
        }
        
    }
}
