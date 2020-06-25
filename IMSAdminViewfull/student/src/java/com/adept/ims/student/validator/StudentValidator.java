package com.adept.ims.student.validator;

import com.adept.ims.student.database.pojo.Student;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

/**
 * <code>Validator</code> for <code>Trust</code> forms.
 *
 */
public class StudentValidator {
    
    public void validate(Student student, Errors errors) {

        
        String durationMonths = String.valueOf(student.getCourseYear().getCourse().getDurationMonths());
        String personByCreatedBy = String.valueOf(student.getAudit().getPersonByCreatedBy());
        String createdDate = String.valueOf(student.getAudit().getCreatedDate());
        String personByModifiedBy = String.valueOf(student.getAudit().getPersonByModifiedBy());
        String modifiedDate = String.valueOf(student.getAudit().getModifiedDate());
        String name = String.valueOf(student.getInstitute().getInstituteMaster().getName());
        String type = String.valueOf(student.getInstitute().getInstituteMaster().getName());
        String description = String.valueOf(student.getInstitute().getInstituteMaster().getDescription());
        String fname = String.valueOf(student.getPerson().getAbstractPerson().getFname());
        String mname = String.valueOf(student.getPerson().getAbstractPerson().getMname());
        String lname = String.valueOf(student.getPerson().getAbstractPerson().getLname());
        String fatherName = String.valueOf(student.getPerson().getAbstractPerson().getFatherName());
        String motherName = String.valueOf(student.getPerson().getAbstractPerson().getMotherName());
        String dob = String.valueOf(student.getPerson().getAbstractPerson().getDob());
        String gender = String.valueOf(student.getPerson().getAbstractPerson().getGender());
        String fathersOcc = String.valueOf(student.getPerson().getAbstractPerson().getFathersOcc());
        String motherOcc = String.valueOf(student.getPerson().getAbstractPerson().getMotherOcc());
        String EMAIL1 = String.valueOf(student.getPerson().getAbstractPerson().getEMail1());
        String EMAIL2 = String.valueOf(student.getPerson().getAbstractPerson().getEMail2());
        String nationality = String.valueOf(student.getPerson().getAbstractPerson().getNationality());
        String phoneNumber = String.valueOf(student.getPerson().getAbstractPerson().getPhoneNumber());
        String mobileNumber = String.valueOf(student.getPerson().getAbstractPerson().getMobileNumber());
        String passportNumber = String.valueOf(student.getPerson().getAbstractPerson().getPassportNumber());
        String languages = String.valueOf(student.getPerson().getAbstractPerson().getLanguages());
        String religion = String.valueOf(student.getPerson().getAbstractPerson().getReligion());
        String caste = String.valueOf(student.getPerson().getAbstractPerson().getCaste());
        String category = String.valueOf(student.getPerson().getAbstractPerson().getCategory());
        String street = String.valueOf(student.getPerson().getAbstractPerson().getAddressByPresentAddId().getStreet());
        String city = String.valueOf(student.getPerson().getAbstractPerson().getAddressByPresentAddId().getCity());
        String state = String.valueOf(student.getPerson().getAbstractPerson().getAddressByPresentAddId().getState());
        String country = String.valueOf(student.getPerson().getAbstractPerson().getAddressByPresentAddId().getCountry());
        String capacity = String.valueOf(student.getHostel().getCapacity());
        String hostelRooms = String.valueOf(student.getHostel().getHostelRooms());
        
        if (!StringUtils.hasLength(durationMonths.trim())) {
            errors.rejectValue("durationMonths", "required", "required");
        }
        if (!StringUtils.hasLength(personByCreatedBy.trim())) {
            errors.rejectValue("personByCreatedBy", "required", "required");
        }
        if (!StringUtils.hasLength(createdDate.trim())) {
            errors.rejectValue("createdDate", "required", "required");
        }
        if (!StringUtils.hasLength(personByModifiedBy.trim())) {
            errors.rejectValue("personByModifiedBy", "required", "required");
        }
        if (!StringUtils.hasLength(modifiedDate.trim())) {
            errors.rejectValue("modifiedDate", "required", "required");
        }
        if (!StringUtils.hasLength(name.trim())) {
            errors.rejectValue("name", "required", "required");
        }
        if (!StringUtils.hasLength(type.trim())) {
            errors.rejectValue("type", "required", "required");
        }
        if (!StringUtils.hasLength(description.trim())) {
            errors.rejectValue("description", "required", "required");
        }
        if (!StringUtils.hasLength(fname.trim())) {
            errors.rejectValue("fname", "required", "required");
        }
        if (!StringUtils.hasLength(mname.trim())) {
            errors.rejectValue("mname", "required", "required");
        }
        if (!StringUtils.hasLength(lname.trim())) {
            errors.rejectValue("lname", "required", "required");
        }
        if (!StringUtils.hasLength(fatherName.trim())) {
            errors.rejectValue("fatherName", "required", "required");
        }
        if (!StringUtils.hasLength(motherName.trim())) {
            errors.rejectValue("motherName", "required", "required");
        }
        if (!StringUtils.hasLength(dob.trim())) {
            errors.rejectValue("dob", "required", "required");
        }
        if (!StringUtils.hasLength(gender.trim())) {
            errors.rejectValue("gender", "required", "required");
        }
        if (!StringUtils.hasLength(fathersOcc.trim())) {
            errors.rejectValue("fathersOcc", "required", "required");
        }
        if (!StringUtils.hasLength(motherOcc.trim())) {
            errors.rejectValue("motherOcc", "required", "required");
        }
        if (!StringUtils.hasLength(EMAIL1.trim())) {
            errors.rejectValue("EMAIL1", "required", "required");
        }
        if (!StringUtils.hasLength(EMAIL2.trim())) {
            errors.rejectValue("EMAIL2", "required", "required");
        }
        if (!StringUtils.hasLength(nationality.trim())) {
            errors.rejectValue("nationality", "required", "required");
        }
        if (!StringUtils.hasLength(phoneNumber.trim())) {
            errors.rejectValue("phoneNumber", "required", "required");
        }
        if (!StringUtils.hasLength(mobileNumber.trim())) {
            errors.rejectValue("mobileNumber", "required", "required");
        }
        if (!StringUtils.hasLength(passportNumber.trim())) {
            errors.rejectValue("passportNumber", "required", "required");
        }
        if (!StringUtils.hasLength(languages.trim())) {
            errors.rejectValue("languages", "required", "required");
        }
        if (!StringUtils.hasLength(religion.trim())) {
            errors.rejectValue("religion", "required", "required");
        }
        if (!StringUtils.hasLength(caste.trim())) {
            errors.rejectValue("caste", "required", "required");
        }
        if (!StringUtils.hasLength(category.trim())) {
            errors.rejectValue("category", "required", "required");
        }
        if (!StringUtils.hasLength(street.trim())) {
            errors.rejectValue("street", "required", "required");
        }
        if (!StringUtils.hasLength(city.trim())) {
            errors.rejectValue("city", "required", "required");
        }
        if (!StringUtils.hasLength(state.trim())) {
            errors.rejectValue("state", "required", "required");
        }
        if (!StringUtils.hasLength(country.trim())) {
            errors.rejectValue("country", "required", "required");
        }
        if (!StringUtils.hasLength(capacity.trim())) {
            errors.rejectValue("capacity", "required", "required");
        }
        if (!StringUtils.hasLength(hostelRooms.trim())) {
            errors.rejectValue("hostelRooms", "required", "required");
        }
        
    }

   }
