package com.adept.ims.hostel.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;

/**
 * HostelOccupant entity. @author MyEclipse Persistence Tools
 */

public class HostelOccupant extends BasePojo implements java.io.Serializable {

	// Fields

	private long hostelOccupantId;
	private Date joniningDate;
        private HostelRoom hostelRoom;
	private Person person;
        private Audit audit;
	// Constructors

	/** default constructor */
	public HostelOccupant() {
	}

	/** full constructor */
	public HostelOccupant(Audit audit, HostelRoom hostelRoom, Person person,
			Date joniningDate) {
		this.audit = audit;
		this.hostelRoom = hostelRoom;
		this.person = person;
		this.joniningDate = joniningDate;
	}

	// Property accessors

	public long getHostelOccupantId() {
		return this.hostelOccupantId;
	}

	public void setHostelOccupantId(long hostelOccupantId) {
		this.hostelOccupantId = hostelOccupantId;
	}
	public Date getJoniningDate() {
		return this.joniningDate;
	}

	public void setJoniningDate(Date joniningDate) {
		this.joniningDate = joniningDate;
	}
        public HostelRoom getHostelRoom() {
		return this.hostelRoom;
	}

	public void setHostelRoom(HostelRoom hostelRoom) {
		this.hostelRoom = hostelRoom;
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
		return getHostelOccupantId();
	}

}