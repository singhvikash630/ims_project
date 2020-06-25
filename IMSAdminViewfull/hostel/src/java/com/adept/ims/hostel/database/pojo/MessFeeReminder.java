package com.adept.ims.hostel.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;

/**
 * MessFeeReminder entity. @author MyEclipse Persistence Tools
 */

public class MessFeeReminder extends BasePojo implements java.io.Serializable {

	// Fields

	private long reminderId;
	private Audit audit;
	private Mess mess;
	private Date dueDate;
	private String status;

	// Constructors

	/** default constructor */
	public MessFeeReminder() {
	}

	/** full constructor */
	public MessFeeReminder(Audit audit, Mess mess, Date dueDate, String status) {
		this.audit = audit;
		this.mess = mess;
		this.dueDate = dueDate;
		this.status = status;
	}

	// Property accessors

	public long getReminderId() {
		return this.reminderId;
	}

	public void setReminderId(long reminderId) {
		this.reminderId = reminderId;
	}

	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Mess getMess() {
		return this.mess;
	}

	public void setMess(Mess mess) {
		this.mess = mess;
	}

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		return getReminderId();
	}

}