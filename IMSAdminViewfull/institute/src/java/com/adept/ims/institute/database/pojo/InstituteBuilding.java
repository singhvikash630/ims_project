package com.adept.ims.institute.database.pojo;

import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.common.database.pojo.BasePojo;

import java.io.Serializable;



/**
 * Institute entity. @author MyEclipse Persistence Tools
 */

public class InstituteBuilding extends BasePojo implements java.io.Serializable {

	// Fields

	private long instituteBuildingId;
    private String status;
	private Audit audit;
	private Institute institute;
	private Building building;
	


	// Constructors

	/** default constructor */
	public InstituteBuilding() {
	}

	/** full constructor */
	public InstituteBuilding(String status,Audit audit, Institute institute, Building building
			) {
        this.status = status;
		this.audit = audit;
		this.institute = institute;
		this.building = building;
		
	}

	// Property accessors

	public long getInstituteBuildingId() {
		return this.instituteBuildingId;
	}

	public void setInstituteBuildingId(long instituteBuildingId) {
		this.instituteBuildingId = instituteBuildingId;
	}

    public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Institute getInstitute() {
		return this.institute;
	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
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
		return getInstituteBuildingId();
	}

}