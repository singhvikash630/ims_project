package com.adept.ims.course.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * Subject entity. @author MyEclipse Persistence Tools
 */

public class Subject extends BasePojo implements java.io.Serializable {

	// Fields

	private long subjectId;
	private long subjectCode;
	private String type;
	private String subjectName;
	private long vacancy;
	private double minPercentage;
	private CourseYear courseYear;
	private Audit audit;

	// Constructors

	/** default constructor */
	public Subject() {
	}

	/** minimal constructor */
	public Subject(long subjectId, String subjectName) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}

	/** full constructor */
	public Subject(long subjectId, CourseYear courseYear, Audit audit,
			long subjectCode, String type, String subjectName, long vacancy,
			double minPercentage) {
		this.subjectId = subjectId;
		this.courseYear = courseYear;
		this.audit = audit;
		this.subjectCode = subjectCode;
		this.type = type;
		this.subjectName = subjectName;
		this.vacancy = vacancy;
		this.minPercentage = minPercentage;
	}

	// Property accessors

	public long getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	

	public long getSubjectCode() {
		return this.subjectCode;
	}

	public void setSubjectCode(long subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public long getVacancy() {
		return this.vacancy;
	}

	public void setVacancy(long vacancy) {
		this.vacancy = vacancy;
	}

	public double getMinPercentage() {
		return this.minPercentage;
	}

	public void setMinPercentage(double minPercentage) {
		this.minPercentage = minPercentage;
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
		return getSubjectId();
	}

}