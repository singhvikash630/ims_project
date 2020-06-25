package com.adept.ims.student.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * StudentScholarship entity. @author MyEclipse Persistence Tools
 */

public class StudentScholarship extends BasePojo implements java.io.Serializable {

	// Fields

	private long studSchoId;
	private Audit audit;
	private Scholarship scholarship;
	private Student student;

	// Constructors

	/** default constructor */
	public StudentScholarship() {
	}

	/** full constructor */
	public StudentScholarship(Audit audit,Scholarship scholarship,Student student) {
		this.audit = audit;
		this.scholarship = scholarship;
		this.student = student;
	}

	// Property accessors

	public long getStudSchoId() {
		return this.studSchoId;
	}

	public void setStudSchoId(long studSchoId) {
		this.studSchoId = studSchoId;
	}

	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Scholarship getScholarship() {
		return this.scholarship;
	}

	public void setScholarship(Scholarship scholarship) {
		this.scholarship = scholarship;
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
		return getStudSchoId();
	}

}