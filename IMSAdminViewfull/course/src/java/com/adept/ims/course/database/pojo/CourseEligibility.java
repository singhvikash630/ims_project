package com.adept.ims.course.database.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.adept.ims.common.database.pojo.*;

/**
 * CourseEligibility entity. @author MyEclipse Persistence Tools
 */

public class CourseEligibility extends BasePojo implements java.io.Serializable {

	// Fields

	private long eligibilityId;
	private String description;
	private Audit audit;
	private Set courses = new HashSet(0);

	// Constructors

	/** default constructor */
	public CourseEligibility() {
	}

	/** full constructor */
	public CourseEligibility(Audit audit, String description, Set courses) {
		this.audit = audit;
		this.description = description;
		this.courses = courses;
	}

	// Property accessors

	public long getEligibilityId() {
		return this.eligibilityId;
	}

	public void setEligibilityId(long eligibilityId) {
		this.eligibilityId = eligibilityId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	
	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
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
		return getEligibilityId();
	}

}