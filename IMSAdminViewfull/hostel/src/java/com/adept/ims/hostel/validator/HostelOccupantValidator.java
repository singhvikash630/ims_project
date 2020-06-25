package com.adept.ims.hostel.validator;

import com.adept.ims.hostel.database.pojo.HostelOccupant;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class HostelOccupantValidator {

    public void validate(HostelOccupant hostelOccupant, Errors errors) {



        /*if (!StringUtils.hasLength(hostelOccupant.getHostelOccupantId())) {
        errors.rejectValue("hostelOccupantName", "required", "required");
        }*/
        
    }
}
