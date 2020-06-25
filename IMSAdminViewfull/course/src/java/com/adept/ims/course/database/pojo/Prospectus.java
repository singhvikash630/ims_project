package com.adept.ims.course.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * Prospectus entity. @author MyEclipse Persistence Tools
 */

public class Prospectus extends BasePojo implements java.io.Serializable {

	// Fields

	private long prospectusId;
	private Audit audit;
	private Course course;
	private double fee;

	// Constructors

	/** default constructor */
	public Prospectus() {
	}

	/** full constructor */
	public Prospectus(Audit audit, Course course, double fee) {
		this.audit = audit;
		this.course = course;
		this.fee = fee;
	}

	// Property accessors

	public long getProspectusId() {
		return this.prospectusId;
	}

	public void setProspectusId(long prospectusId) {
		this.prospectusId = prospectusId;
	}

	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getFee() {
		return this.fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
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
		return getProspectusId();
	}

}