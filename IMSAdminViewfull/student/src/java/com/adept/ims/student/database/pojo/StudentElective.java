package com.adept.ims.student.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.course.database.pojo.Subject;

/**
 * StudentElective entity. @author MyEclipse Persistence Tools
 */

public class StudentElective extends BasePojo implements java.io.Serializable {

	// Fields

	private long electiveId;
	private Audit audit;
	private Subject subject;
	private Student student;

	// Constructors

	/** default constructor */
	public StudentElective() {
	}

	/** full constructor */
	public StudentElective(Audit audit, Subject subject, Student student) {
		this.audit = audit;
		this.subject = subject;
		this.student = student;
	}

	// Property accessors

	public long getElectiveId() {
		return this.electiveId;
	}

	public void setElectiveId(long electiveId) {
		this.electiveId = electiveId;
	}

	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
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
		return getElectiveId();
	}

}