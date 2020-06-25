package com.adept.ims.hostel.validator;

import com.adept.ims.hostel.database.pojo.MessOccupant;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class MessOccupantValidator {

    public void validate(MessOccupant messoccupant, Errors errors) {
        String str = (messoccupant.getMess()).toString();
        if (!StringUtils.hasLength(str)) {
            errors.rejectValue("messoccupantName", "required", "required");
        }
        
    }
}
