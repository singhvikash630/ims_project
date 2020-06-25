package com.adept.ims.course.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * Section entity. @author MyEclipse Persistence Tools
 */

public class Section extends BasePojo implements java.io.Serializable {

	// Fields

	private long sectionId;
	private CourseYear courseYear;
	private Audit audit;
	private String sectionName;

	// Constructors

	/** default constructor */
	public Section() {
	}

	/** full constructor */
	public Section(CourseYear courseYear, Audit audit, String sectionName) {
		this.courseYear = courseYear;
		this.audit = audit;
		this.sectionName = sectionName;
	}

	// Property accessors

	public long getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(long sectionId) {
		this.sectionId = sectionId;
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

	public String getSectionName() {
		return this.sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
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
		return getSectionId();
	}

}