package com.adept.ims.hostel.validator;

import com.adept.ims.hostel.database.pojo.MessType;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class MessTypeValidator {

    public void validate(MessType messtype, Errors errors) {

        if (!StringUtils.hasLength(messtype.getType())) {
            errors.rejectValue("messtype", "required", "required");
        }
        
    }
}
