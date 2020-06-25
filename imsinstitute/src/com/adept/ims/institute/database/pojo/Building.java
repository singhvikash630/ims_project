package com.adept.ims.institute.database.pojo;


import com.adept.ims.common.database.pojo.BasePojo;
import com.adept.ims.common.database.pojo.Audit;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



/**
 * Building entity. @author MyEclipse Persistence Tools
 */

public class Building extends BasePojo implements java.io.Serializable {

	// Fields

	private long buildingId;
	private String buildingName;
	private String buildingPlace;
	private Audit audit;
	private Set rooms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Building() {
	}

	/** full constructor */
	public Building( String buildingName, String buildingPlace,
			Audit audit,Set rooms) {
		
		this.buildingName = buildingName;
		this.buildingPlace = buildingPlace;
        this.audit = audit;
		this.rooms = rooms;
	}

	// Property accessors

	public long getBuildingId() {
		return this.buildingId;
	}

	public void setBuildingId(long buildingId) {
		this.buildingId = buildingId;
	}

	

	public String getBuildingName() {
		return this.buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getBuildingPlace() {
		return this.buildingPlace;
	}

	public void setBuildingPlace(String buildingPlace) {
		this.buildingPlace = buildingPlace;
	}
	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}
	public Set getRooms() {
		return this.rooms;
	}

	public void setRooms(Set rooms) {
		this.rooms = rooms;
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
		return getBuildingId();
	}

}