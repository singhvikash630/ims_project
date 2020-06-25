package com.adept.ims.staff.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * LeaveMaster entity. @author MyEclipse Persistence Tools
 */

public class LeaveMaster extends BasePojo implements java.io.Serializable {

	// Fields

	private long leaveMasterId;
	private String year;
	private long paidLeave;
	private long sickLeave;
        private Staff staff;
        private Audit audit;
	// Constructors

	/** default constructor */
	public LeaveMaster() {
	}

	/** full constructor */
	public LeaveMaster(Audit audit, Staff staff, String year, long paidLeave,
			long sickLeave) {
		this.audit = audit;
		this.staff = staff;
		this.year = year;
		this.paidLeave = paidLeave;
		this.sickLeave = sickLeave;
	}

	// Property accessors

	public long getLeaveMasterId() {
		return this.leaveMasterId;
	}

	public void setLeaveMasterId(long leaveMasterId) {
		this.leaveMasterId = leaveMasterId;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public long getPaidLeave() {
		return this.paidLeave;
	}

	public void setPaidLeave(long paidLeave) {
		this.paidLeave = paidLeave;
	}

	public long getSickLeave() {
		return this.sickLeave;
	}

	public void setSickLeave(long sickLeave) {
		this.sickLeave = sickLeave;
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
		return getLeaveMasterId();
	}

}