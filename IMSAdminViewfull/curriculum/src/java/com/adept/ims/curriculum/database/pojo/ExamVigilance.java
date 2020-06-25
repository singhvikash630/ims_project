package com.adept.ims.curriculum.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.staff.database.pojo.Staff;

/**
 * ExamVigilance entity. @author MyEclipse Persistence Tools
 */

public class ExamVigilance extends BasePojo implements java.io.Serializable {

	// Fields

	private long examVigilId;
	private Examination examination;
	private Audit audit;
	private Staff staff;

	// Constructors

	/** default constructor */
	public ExamVigilance() {
	}

	/** minimal constructor */
	public ExamVigilance(long examVigilId) {
		this.examVigilId = examVigilId;
	}

	/** full constructor */
	public ExamVigilance(long examVigilId, Examination examination,
			Audit audit, Staff staff) {
		this.examVigilId = examVigilId;
		this.examination = examination;
		this.audit = audit;
		this.staff = staff;
	}

	// Property accessors

	public long getExamVigilId() {
		return this.examVigilId;
	}

	public void setExamVigilId(long examVigilId) {
		this.examVigilId = examVigilId;
	}

	public Examination getExamination() {
		return this.examination;
	}

	public void setExamination(Examination examination) {
		this.examination = examination;
	}

	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
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
		return getExamVigilId();
	}

}