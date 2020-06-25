package com.adept.ims.hostel.validator;


import com.adept.ims.hostel.database.pojo.HostelRoom;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class HostelRoomValidator {

    public void validate(HostelRoom hostelroom, Errors errors) {
        String str1 = (hostelroom.getAudit()).toString();
        if (!StringUtils.hasLength(str1)) {
            errors.rejectValue("hostelroomName", "required", "required");
        }
        
    }
}
