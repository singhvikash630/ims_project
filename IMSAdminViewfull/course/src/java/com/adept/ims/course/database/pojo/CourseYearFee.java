package com.adept.ims.course.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * CourseYearFee entity. @author MyEclipse Persistence Tools
 */

public class CourseYearFee extends BasePojo implements java.io.Serializable {

	// Fields

	private long courseYearFeeId;
	private CourseYear courseYear;
	private Audit audit;
	private FeeType feeType;
	private double amount;

	// Constructors

	/** default constructor */
	public CourseYearFee() {
	}

	/** full constructor */
	public CourseYearFee(CourseYear courseYear, Audit audit, FeeType feeType,
			double amount) {
		this.courseYear = courseYear;
		this.audit = audit;
		this.feeType = feeType;
		this.amount = amount;
	}

	// Property accessors

	public long getCourseYearFeeId() {
		return this.courseYearFeeId;
	}

	public void setCourseYearFeeId(long courseYearFeeId) {
		this.courseYearFeeId = courseYearFeeId;
	}

	public CourseYear getCourseYear() {
		return this.courseYear;
	}

	public void setCourseYear(CourseYear courseYear) {
		this.courseYear = courseYear;
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
		return getCourseYearFeeId();
	}

}