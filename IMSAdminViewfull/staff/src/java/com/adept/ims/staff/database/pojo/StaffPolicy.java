package com.adept.ims.staff.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * StaffPolicy entity. @author MyEclipse Persistence Tools
 */

public class StaffPolicy extends BasePojo implements java.io.Serializable {

	// Fields

	private long staffPolicyId;
	private Policy policy;
        private Audit audit;
	// Constructors

	/** default constructor */
	public StaffPolicy() {
	}

	/** full constructor */
	public StaffPolicy(Audit audit, Policy policy) {
		this.audit = audit;
		this.policy = policy;
	}

	// Property accessors

	public long getStaffPolicyId() {
		return this.staffPolicyId;
	}

	public void setStaffPolicyId(long staffPolicyId) {
		this.staffPolicyId = staffPolicyId;
	}

	public Policy getPolicy() {
		return this.policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
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
		return getStaffPolicyId();
	}

}