package com.adept.ims.staff.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.course.database.pojo.CourseMaster;
import com.adept.ims.institute.database.pojo.*;

/**
 * StaffMember entity. @author MyEclipse Persistence Tools
 */
public class StaffMember extends BasePojo implements java.io.Serializable {

    // Fields
    private long staffMemberId;
    private Date joiningDate;
    private Department department;
    private Institute institute;
    private Person person;
    private Designation designation;
    private CourseMaster courseMaster;
    private Audit audit;

    // Constructors
    /** default constructor */
    public StaffMember() {
    }

    /** full constructor */
    public StaffMember(Audit audit, Department department, Institute institute,
            Person person, Designation designation, CourseMaster courseMaster,
            Date joiningDate) {
        this.audit = audit;
        this.department = department;
        this.institute = institute;
        this.person = person;
        this.designation = designation;
        this.courseMaster = courseMaster;
        this.joiningDate = joiningDate;
    }

    // Property accessors
    public long getStaffMemberId() {
        return this.staffMemberId;
    }

    public void setStaffMemberId(long staffMemberId) {
        this.staffMemberId = staffMemberId;
    }

    public Date getJoiningDate() {
        return this.joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Institute getInstitute() {
        return this.institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Designation getDesignation() {
        return this.designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public CourseMaster getCourseMaster() {
        return this.courseMaster;
    }

    public void setCourseMaster(CourseMaster courseMaster) {
        this.courseMaster = courseMaster;
    }

    public Audit getAudit() {
        return this.audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    @Override
    public Object clone() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Compare with other object
     * @param o
     * @return -1 if current object is less then other object
    0  if current object is equal to other object
    1  if current object is greater then other objct
     */
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        // TODO Auto-generated method stub
        return getStaffMemberId();
    }
}