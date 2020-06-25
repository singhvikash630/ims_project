package com.adept.ims.staff.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;

/**
 * ExStaff entity. @author MyEclipse Persistence Tools
 */

public class ExStaff extends BasePojo implements java.io.Serializable {

	// Fields

	private long exStaffId;
	private Date leavingDate;
	private String reasonToLeave;
        private StaffMember staffMember;
        private Audit audit;
	// Constructors

	/** default constructor */
	public ExStaff() {
	}

	/** full constructor */
	public ExStaff(Audit audit, StaffMember staffMember, Date leavingDate,
			String reasonToLeave) {
		this.audit = audit;
		this.staffMember = staffMember;
		this.leavingDate = leavingDate;
		this.reasonToLeave = reasonToLeave;
	}

	// Property accessors

	public long getExStaffId() {
		return this.exStaffId;
	}

	public void setExStaffId(long exStaffId) {
		this.exStaffId = exStaffId;
	}
	public Date getLeavingDate() {
		return this.leavingDate;
	}

	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}

	public String getReasonToLeave() {
		return this.reasonToLeave;
	}

	public void setReasonToLeave(String reasonToLeave) {
		this.reasonToLeave = reasonToLeave;
	}
        public StaffMember getStaffMember() {
		return this.staffMember;
	}

	public void setStaffMember(StaffMember staffMember) {
		this.staffMember = staffMember;
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
		return getExStaffId();
	}

}