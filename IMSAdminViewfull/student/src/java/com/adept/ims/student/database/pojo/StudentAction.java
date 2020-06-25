package com.adept.ims.student.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * StudentAction entity. @author MyEclipse Persistence Tools
 */

public class StudentAction extends BasePojo implements java.io.Serializable {

	// Fields

	private long actionId;
	private String actionType;
	private String description;
	private String action;
        private double fine;
	private Audit audit;
	private Student student;
	

	// Constructors

	/** default constructor */
	public StudentAction() {
	}

	/** full constructor */
	public StudentAction(String actionType,String description,String action,double fine,Audit audit,Student student) {
		this.actionType = actionType;
		this.description = description;
		this.action = action;
                this.fine = fine;
                this.audit = audit;
                this.student = student; 
		  
		
	}

	// Property accessors

	public long getActionId() {
		return this.actionId;
	}

	public void setActionId(long actionId) {
		this.actionId = actionId;
	}

	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
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

	public double getFine() {
		return this.fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
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
		return getActionId();
	}

}