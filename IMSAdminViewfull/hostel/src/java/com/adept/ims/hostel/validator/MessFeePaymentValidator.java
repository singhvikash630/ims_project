package com.adept.ims.hostel.validator;

import com.adept.ims.hostel.database.pojo.MessFeePayment;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class MessFeePaymentValidator {

    public void validate(MessFeePayment messfeepayment, Errors errors) {
        String str = (messfeepayment.getMessOccupant()).toString();
        if (!StringUtils.hasLength(str)) {
            errors.rejectValue("messFeePaymentName", "required", "required");
        }
        
    }
}
