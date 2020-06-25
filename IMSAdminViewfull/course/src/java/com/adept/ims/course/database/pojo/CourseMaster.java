package com.adept.ims.course.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * CourseMaster entity. @author MyEclipse Persistence Tools
 */

public class CourseMaster extends BasePojo implements java.io.Serializable {

	// Fields

	private long courseMasterId;
	private Discipline discipline;
	private Audit audit;
	private String courseName;
	private String majors;

	// Constructors

	/** default constructor */
	public CourseMaster() {
	}

	/** full constructor */
	public CourseMaster(Discipline discipline, Audit audit, String courseName,
			String majors) {
		this.discipline = discipline;
		this.audit = audit;
		this.courseName = courseName;
		this.majors = majors;
	}

	// Property accessors

	public long getCourseMasterId() {
		return this.courseMasterId;
	}

	public void setCourseMasterId(long courseMasterId) {
		this.courseMasterId = courseMasterId;
	}

	public Discipline getDiscipline() {
		return this.discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getMajors() {
		return this.majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
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
		return getCourseMasterId();
	}

}