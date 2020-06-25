package com.adept.ims.staff.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * Appraisal entity. @author MyEclipse Persistence Tools
 */

public class Appraisal extends BasePojo implements java.io.Serializable {

	// Fields

	private long appraisalId;
	private String year;
	private String details;
	private String review;
	private String rank;
	private double hike;
        private Staff staff;
        private Audit audit;
	// Constructors

	/** default constructor */
	public Appraisal() {
	}

	/** full constructor */
	public Appraisal(Audit audit, Staff staff, String year, String details,
			String review, String rank, double hike) {
		this.audit = audit;
		this.staff = staff;
		this.year = year;
		this.details = details;
		this.review = review;
		this.rank = rank;
		this.hike = hike;
	}

	// Property accessors

	public long getAppraisalId() {
		return this.appraisalId;
	}

	public void setAppraisalId(long appraisalId) {
		this.appraisalId = appraisalId;
	}
	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getReview() {
		return this.review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public double getHike() {
		return this.hike;
	}

	public void setHike(double hike) {
		this.hike = hike;
	} 
        public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
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
	 /**
     * Compare with other object
     * @param o
     * @return -1 if current object is less then other object
               0  if current object is equal to other object
               1  if current object is greater then other objct
     */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		// TODO Auto-generated method stub
		return getAppraisalId();
	}

}