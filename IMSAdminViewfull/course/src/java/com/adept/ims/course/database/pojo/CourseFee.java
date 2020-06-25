package com.adept.ims.course.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * CourseFee entity. @author MyEclipse Persistence Tools
 */

public class CourseFee extends BasePojo implements java.io.Serializable {

	// Fields

	private long courseFeeId;
	private Audit audit;
	private FeeType feeType;
	private Course course;
	private double amount;

	// Constructors

	/** default constructor */
	public CourseFee() {
	}

	/** full constructor */
	public CourseFee(Audit audit, FeeType feeType, Course course, double amount) {
		this.audit = audit;
		this.feeType = feeType;
		this.course = course;
		this.amount = amount;
	}

	// Property accessors

	public long getCourseFeeId() {
		return this.courseFeeId;
	}

	public void setCourseFeeId(long courseFeeId) {
		this.courseFeeId = courseFeeId;
	}

	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public FeeType getFeeType() {
		return this.feeType;
	}

	public void setFeeType(FeeType feeType) {
		this.feeType = feeType;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
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
		return getCourseFeeId();
	}

}