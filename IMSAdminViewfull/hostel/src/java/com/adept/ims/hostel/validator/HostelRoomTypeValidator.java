package com.adept.ims.hostel.validator;

import com.adept.ims.hostel.database.pojo.HostelRoomType;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class HostelRoomTypeValidator {

    public void validate(HostelRoomType hostelroomtype, Errors errors) {
            String str1 = (hostelroomtype.getAudit()).toString();
        if (!StringUtils.hasLength(str1)) {
            errors.rejectValue("hostelroomtypeName", "required", "required");
        }
        
    }
}
