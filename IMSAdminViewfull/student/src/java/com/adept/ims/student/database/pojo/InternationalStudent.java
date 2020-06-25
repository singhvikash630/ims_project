package com.adept.ims.student.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;

/**
 * InternationalStudent entity. @author MyEclipse Persistence Tools
 */

public class InternationalStudent extends BasePojo implements java.io.Serializable {

	// Fields

	private long intStudId;
	private String visaType;
	private Date visaExpiaryDate;
	private Student student; 
        private Audit audit;

	// Constructors

	/** default constructor */
	public InternationalStudent() {
	}

	/** full constructor */
	public InternationalStudent(String visaType,Date visaExpiaryDate,Student student,Audit audit) {
		this.visaType = visaType;
		this.visaExpiaryDate = visaExpiaryDate;
		this.student = student;
                this.audit = audit;  
	  
	}

	// Property accessors

	public long getIntStudId() {
		return this.intStudId;
	}

	public void setIntStudId(long intStudId) {
		this.intStudId = intStudId;
	}
        public String getVisaType() {
		return this.visaType;
	}

	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}

	public Date getVisaExpiaryDate() {
		return this.visaExpiaryDate;
	}

	public void setVisaExpiaryDate(Date visaExpiaryDate) {
		this.visaExpiaryDate = visaExpiaryDate;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
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

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		// TODO Auto-generated method stub
		return getIntStudId();
	}

}