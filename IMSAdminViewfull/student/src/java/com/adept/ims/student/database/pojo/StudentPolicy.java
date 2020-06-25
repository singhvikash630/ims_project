package com.adept.ims.student.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import java.util.Date;

/**
 * StudentPolicy entity. @author MyEclipse Persistence Tools
 */
public class StudentPolicy extends BasePojo implements java.io.Serializable {

    // Fields
    private long studentPolicyId;
    private Date creationDate;
    private Audit audit;
    private Policy policy;

    // Constructors
    /** default constructor */
    public StudentPolicy() {
    }

    /** full constructor */
    public StudentPolicy(Audit audit, Policy policy) {
        this.audit = audit;
        this.policy = policy;
    }

    // Property accessors
    public long getStudentPolicyId() {
        return this.studentPolicyId;
    }

    public void setStudentPolicyId(long studentPolicyId) {
        this.studentPolicyId = studentPolicyId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Audit getAudit() {
        return this.audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public Policy getPolicy() {
        return this.policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    @Override
    public Object clone() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        // TODO Auto-generated method stub
        return getStudentPolicyId();
    }
}