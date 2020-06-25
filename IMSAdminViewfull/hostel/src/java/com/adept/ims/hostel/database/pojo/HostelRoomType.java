package com.adept.ims.hostel.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * HostelRoomType entity. @author MyEclipse Persistence Tools
 */

public class HostelRoomType extends BasePojo implements java.io.Serializable {

	// Fields

	private long roomTypeId;
	private String type;
	private double roomFee;
        private Audit audit;
	// Constructors

	/** default constructor */
	public HostelRoomType() {
	}

	/** full constructor */
	public HostelRoomType(Audit audit, String type, double roomFee) {
		this.audit = audit;
		this.type = type;
		this.roomFee = roomFee;
	}

	// Property accessors

	public long getRoomTypeId() {
		return this.roomTypeId;
	}

	public void setRoomTypeId(long roomTypeId) {
		this.roomTypeId = roomTypeId;
	}


	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getRoomFee() {
		return this.roomFee;
	}

	public void setRoomFee(double roomFee) {
		this.roomFee = roomFee;
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
		return getRoomTypeId();
	}

}