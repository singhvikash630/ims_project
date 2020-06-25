package com.adept.ims.hostel.validator;

import com.adept.ims.hostel.database.pojo.MessFeeReminder;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class MessFeeReminderValidator {

    public void validate(MessFeeReminder messfeereminder, Errors errors) {


        String str = messfeereminder.getStatus();
            //String str=ln.toString();
        if(!StringUtils.hasLength(str))
        {
            errors.rejectValue("Status", "required", "required");
        }
        
    }
}
