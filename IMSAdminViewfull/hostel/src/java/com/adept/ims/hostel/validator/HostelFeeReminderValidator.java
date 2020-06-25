package com.adept.ims.hostel.validator;

import org.springframework.util.StringUtils;
import com.adept.ims.hostel.database.pojo.HostelFeeReminder;
import org.springframework.validation.Errors;

public class HostelFeeReminderValidator {

    public void validate(HostelFeeReminder hostelFeeReminder, Errors errors) {

        String str1 = (hostelFeeReminder.getAudit()).toString();
        //String str2 = (hostelFeeReminder.getHostelFeeReminderName()).toString();

        
        if (!StringUtils.hasLength(str1)) {
            errors.rejectValue("reminderId", "required", "required");
        }
        /*if (!StringUtils.hasLength(str2)) {
        errors.rejectValue("feeReminderName", "required", "required");
        }*/

        if (!StringUtils.hasLength(hostelFeeReminder.getStatus())) {
            errors.rejectValue("Status", "required", "required");
        }
    }
}
