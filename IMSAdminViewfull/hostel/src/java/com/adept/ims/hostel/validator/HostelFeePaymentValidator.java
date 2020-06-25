package com.adept.ims.hostel.validator;

import com.adept.ims.hostel.database.pojo.HostelFeePayment;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class HostelFeePaymentValidator {

    public void validate(HostelFeePayment hostelFeePayment, Errors errors) {

        String str1 = (hostelFeePayment.getAudit()).toString();
       // String str2 = (hostelFeePayment.getAddress()).toString();


        if (!StringUtils.hasLength(str1)) {
            errors.rejectValue("audit", "required", "required");
        }
        /*if (!StringUtils.hasLength(str2)) {
        errors.rejectValue("address", "required", "required");
        }*/
    }
}
