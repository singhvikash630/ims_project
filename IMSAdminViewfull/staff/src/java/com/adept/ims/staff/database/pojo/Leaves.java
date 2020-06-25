package com.adept.ims.staff.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;

/**
 * Leaves entity. @author MyEclipse Persistence Tools
 */

public class Leaves extends BasePojo implements java.io.Serializable {

	// Fields

	private long leaveId;
	private String type;
	private long days;
	private Date appliedDate;
	private Date startDate;
	private Date endDate;
	private String description;
	private String status;
        private Staff staff;
        private Audit audit;
	// Constructors

	/** default constructor */
	public Leaves() {
	}

	/** full constructor */
	public Leaves(Audit audit, Staff staff, String type, long days,
			Date appliedDate, Date startDate, Date endDate, String description,
			String status) {
		this.audit = audit;
		this.staff = staff;
		this.type = type;
		this.days = days;
		this.appliedDate = appliedDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
		this.status = status;
	}

	// Property accessors

	public long getLeaveId() {
		return this.leaveId;
	}

	public void setLeaveId(long leaveId) {
		this.leaveId = leaveId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getDays() {
		return this.days;
	}

	public void setDays(long days) {
		this.days = days;
	}

	public Date getAppliedDate() {
		return this.appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		return getLeaveId();
	}

}