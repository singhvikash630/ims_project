package com.adept.ims.hostel.database.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.adept.ims.common.database.pojo.*;

/**
 * HostelRoom entity. @author MyEclipse Persistence Tools
 */

public class HostelRoom extends BasePojo implements java.io.Serializable {

	// Fields

	private long hostelRoomId;
	private HostelRoomType hostelRoomType;
	private long roomNumber;
	private long floor;
	private long capacity;
        private Hostel hostel;
        private Audit audit;
	private Set hostelOccupants = new HashSet(0);

	// Constructors

	/** default constructor */
	public HostelRoom() {
	}

	/** full constructor */
	public HostelRoom(HostelRoomType hostelRoomType, Audit audit,
			Hostel hostel, long roomNumber, long floor, long capacity,
			Set hostelOccupants) {
		this.hostelRoomType = hostelRoomType;
		this.audit = audit;
		this.hostel = hostel;
		this.roomNumber = roomNumber;
		this.floor = floor;
		this.capacity = capacity;
		this.hostelOccupants = hostelOccupants;
	}

	// Property accessors

	public long getHostelRoomId() {
		return this.hostelRoomId;
	}

	public void setHostelRoomId(long hostelRoomId) {
		this.hostelRoomId = hostelRoomId;
	}

	public HostelRoomType getHostelRoomType() {
		return this.hostelRoomType;
	}

	public void setHostelRoomType(HostelRoomType hostelRoomType) {
		this.hostelRoomType = hostelRoomType;
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
        public Hostel getHostel() {
		return this.hostel;
	}

	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
        public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}
	public Set getHostelOccupants() {
		return this.hostelOccupants;
	}

	public void setHostelOccupants(Set hostelOccupants) {
		this.hostelOccupants = hostelOccupants;
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
		return getHostelRoomId();
	}

}