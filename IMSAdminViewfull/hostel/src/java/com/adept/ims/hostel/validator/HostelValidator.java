package com.adept.ims.hostel.validator;

import com.adept.ims.hostel.database.pojo.Hostel;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class HostelValidator {

    public void validate(Hostel hostel, Errors errors) {

        String str1 = (hostel.getAudit()).toString();
        String str2 = (hostel.getAddress()).toString();
        String str3 = (hostel.getPerson()).toString();
        String str4 = (hostel.getStudents()).toString();

        if(!StringUtils.hasLength(str1)){
            errors.rejectValue("str1", "required", "required");
        }
        if(!StringUtils.hasLength(str2)){
            errors.rejectValue("str2", "required", "required");
        }
        if(!StringUtils.hasLength(str3)){
            errors.rejectValue("str3", "required", "required");
        }
        if(!StringUtils.hasLength(str4)){
            errors.rejectValue("str4", "required", "required");
        }

        
        

    }
}
