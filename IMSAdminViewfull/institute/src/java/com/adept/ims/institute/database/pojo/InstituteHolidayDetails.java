package com.adept.ims.institute.database.pojo;

import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.common.database.pojo.BasePojo;

import java.io.Serializable;



/**
 * InstituteHolidayDetails entity. @author MyEclipse Persistence Tools
 */

public class InstituteHolidayDetails extends BasePojo implements java.io.Serializable {

	// Fields

	private long holidayInstituteId;
    private String place;
	private Audit audit;
	private Institute institute;
	

	// Constructors

	/** default constructor */
	public InstituteHolidayDetails() {
	}

	/** full constructor */
	public InstituteHolidayDetails(String place,Audit audit, Institute institute) {
		this.place = place;
        this.audit = audit;
		this.institute = institute;
		
	}

	// Property accessors

	public long getHolidayInstituteId() {
		return this.holidayInstituteId;
	}

	public void setHolidayInstituteId(long holidayInstituteId) {
		this.holidayInstituteId = holidayInstituteId;
	}

    public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
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

	

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		// TODO Auto-generated method stub
		return getHolidayInstituteId();
	}

}