package com.adept.ims.hostel.database.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.adept.ims.common.database.pojo.*;

/**
 * Mess entity. @author MyEclipse Persistence Tools
 */

public class Mess extends BasePojo implements java.io.Serializable {

	// Fields

	private long messId;
	private long roomNumber;
	private long floor;
	private long capacity;
        private MessType messType;
	private Hostel hostel;
        private Audit audit;
	private Set messOccupants = new HashSet(0);
	
	// Constructors

	/** default constructor */
	public Mess() {
	}

	/** full constructor */
	public Mess(Audit audit, MessType messType, Hostel hostel, long roomNumber,
			long floor, long capacity, Set messOccupants) {
		this.audit = audit;
		this.messType = messType;
		this.hostel = hostel;
		this.roomNumber = roomNumber;
		this.floor = floor;
		this.capacity = capacity;
		this.messOccupants = messOccupants;
		
	}

	// Property accessors

	public long getMessId() {
		return this.messId;
	}

	public void setMessId(long messId) {
		this.messId = messId;
	}
	public long getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(long roomNumber) {
		this.roomNumber = roomNumber;
	}

	public long getFloor() {
		return this.floor;
	}

	public void setFloor(long floor) {
		this.floor = floor;
	}

	public long getCapacity() {
		return this.capacity;
	}

	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}
        public MessType getMessType() {
		return this.messType;
	}

	public void setMessType(MessType messType) {
		this.messType = messType;
	}

	public Hostel getHostel() {
		return this.hostel;
	}

	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}

	public Set getMessOccupants() {
		return this.messOccupants;
	}

	public void setMessOccupants(Set messOccupants) {
		this.messOccupants = messOccupants;
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
		return getMessId();
	}


}