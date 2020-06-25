package com.adept.ims.hostel.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;

/**
 * MessOccupant entity. @author MyEclipse Persistence Tools
 */

public class MessOccupant extends BasePojo implements java.io.Serializable {

	// Fields

	private long messOccupantId;
	private Date joniningDate;
        private Mess mess;
	private Person person;
        private Audit audit;
	// Constructors

	/** default constructor */
	public MessOccupant() {
	}

	/** full constructor */
	public MessOccupant(Audit audit, Mess mess, Person person, Date joniningDate) {
		this.audit = audit;
		this.mess = mess;
		this.person = person;
		this.joniningDate = joniningDate;
	}

	// Property accessors

	public long getMessOccupantId() {
		return this.messOccupantId;
	}

	public void setMessOccupantId(long messOccupantId) {
		this.messOccupantId = messOccupantId;
	}

	public Date getJoniningDate() {
		return this.joniningDate;
	}

	public void setJoniningDate(Date joniningDate) {
		this.joniningDate = joniningDate;
	}
        public Mess getMess() {
		return this.mess;
	}

	public void setMess(Mess mess) {
		this.mess = mess;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
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
		return getMessOccupantId();
	}

}