package com.adept.ims.curriculum.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.course.database.pojo.CourseFee;
import com.adept.ims.student.database.pojo.Student;

/**
 * FeeExemption entity. @author MyEclipse Persistence Tools
 */

public class FeeExemption extends BasePojo implements java.io.Serializable {

	// Fields

	private long feeExemptionId;
	private double amount;
	private String reason;
        private Audit audit;
	private CourseFee courseFee;
	private Student student;
	
	// Constructors

	/** default constructor */
	public FeeExemption() {
	}

	/** minimal constructor */
	public FeeExemption(long feeExemptionId) {
		this.feeExemptionId = feeExemptionId;
	}

	/** full constructor */
	public FeeExemption(long feeExemptionId,double amount,String reason,Audit audit,CourseFee courseFee,
			Student student) {
		this.feeExemptionId = feeExemptionId;
                this.amount = amount;
		this.reason = reason;    
		this.audit = audit;
		this.courseFee = courseFee;
		this.student = student;
		
	}

	// Property accessors

	public long getFeeExemptionId() {
		return this.feeExemptionId;
	}

	public void setFeeExemptionId(long feeExemptionId) {
		this.feeExemptionId = feeExemptionId;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

        public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public CourseFee getCourseFee() {
		return this.courseFee;
	}

	public void setCourseFee(CourseFee courseFee) {
		this.courseFee = courseFee;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
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
		return getFeeExemptionId();
	}

}