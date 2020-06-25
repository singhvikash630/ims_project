package com.adept.ims.institute.database.pojo;

import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.common.database.pojo.BasePojo;

import java.io.Serializable;



/**
 * Room entity. @author MyEclipse Persistence Tools
 */

public class Room extends BasePojo implements java.io.Serializable {

	// Fields

	private long roomId;
    private long floor;
	private boolean status;
	private Audit audit;
	private Building building;
	

	// Constructors

	/** default constructor */
	public Room() {
	}

	/** full constructor */
	public Room(long floor, boolean status,Audit audit, Building building) {
		
		this.floor = floor;
		this.status = status;
        this.audit = audit;
		this.building = building;
	}

	// Property accessors

	public long getRoomId() {
		return this.roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}


	public long getFloor() {
		return this.floor;
	}

	public void setFloor(long floor) {
		this.floor = floor;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}


	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Building getBuilding() {
		return this.building;
	}

	public void setBuilding(Building building) {
		this.building = building;
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
		return getRoomId();
	}

}