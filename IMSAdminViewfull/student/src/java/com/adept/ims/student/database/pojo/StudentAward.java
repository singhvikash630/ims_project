package com.adept.ims.student.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * StudentAward entity. @author MyEclipse Persistence Tools
 */

public class StudentAward extends BasePojo implements java.io.Serializable {

	// Fields

	private long awardId;
        private String awardType;
	private String description;
	private String action;
	private double cashAward;
	private Audit audit;
	private Student student;
	

	// Constructors

	/** default constructor */
	public StudentAward() {
	}

	/** full constructor */
	public StudentAward(String awardType,String description,String action,
                             double cashAward,Audit audit, Student student) {
		this.awardType = awardType;
		this.description = description;
		this.action = action;
		this.cashAward = cashAward;
                this.audit = audit;
		this.student = student;

	}

	// Property accessors

	public long getAwardId() {
		return this.awardId;
	}

	public void setAwardId(long awardId) {
		this.awardId = awardId;
	}

	
	public String getAwardType() {
		return this.awardType;
	}

	public void setAwardType(String awardType) {
		this.awardType = awardType;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public double getCashAward() {
		return this.cashAward;
	}

	public void setCashAward(double cashAward) {
		this.cashAward = cashAward;
	}
        
        public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
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
		return getAwardId();
	}

}