package com.adept.ims.hostel.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * MessType entity. @author MyEclipse Persistence Tools
 */

public class MessType extends BasePojo implements java.io.Serializable {

	// Fields

	private long messTypeId;
	private String type;
	private double amount;
        private Audit audit;
	// Constructors

	/** default constructor */
	public MessType() {
	}

	/** full constructor */
	public MessType(Audit audit, String type, double amount) {
		this.audit = audit;
		this.type = type;
		this.amount = amount;
	}

	// Property accessors

	public long getMessTypeId() {
		return this.messTypeId;
	}

	public void setMessTypeId(long messTypeId) {
		this.messTypeId = messTypeId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
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
		return getMessTypeId();
	}

}