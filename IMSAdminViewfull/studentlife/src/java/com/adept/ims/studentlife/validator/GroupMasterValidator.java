package com.adept.ims.authorization.validator;

import com.adept.ims.authorization.database.pojo.GroupMaster;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

/**
 * <code>Validator</code> for <code>Trust</code> forms.
 *
 */
public class GroupMasterValidator {

    public void validate(GroupMaster groupMaster, Errors errors) {
        if (!StringUtils.hasLength(groupMaster.getGroupName())) {
            errors.rejectValue("groupName", "required", "required");
        }
        if (!StringUtils.hasLength(groupMaster.getDescription())) {
            errors.rejectValue("description", "required", "required");
        }

    /**
     *
    Following example is for numeric value
    String telephone = trust.getTelephone();
    if (!StringUtils.hasLength(telephone)) {
    errors.rejectValue("telephone", "required", "required");
    }
    else {
    for (int i = 0; i < telephone.length(); ++i) {
    if ((Character.isDigit(telephone.charAt(i))) == false) {
    errors.rejectValue("telephone", "nonNumeric", "non-numeric");
    break;
    }
    }
     */
    }
}
