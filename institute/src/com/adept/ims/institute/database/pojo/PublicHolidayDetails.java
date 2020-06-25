package com.adept.ims.institute.database.pojo;

import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.common.database.pojo.BasePojo;

import java.io.Serializable;
import java.util.Date;



/**
 * PublicHolidayDetails entity. @author MyEclipse Persistence Tools
 */

public class PublicHolidayDetails extends BasePojo implements java.io.Serializable {

	// Fields

	private long holidayId;
	private String holidayName;
	private Date dateh;
    private Audit audit;

	// Constructors

	/** default constructor */
	public PublicHolidayDetails() {
	}

	/** full constructor */
	public PublicHolidayDetails( String holidayName, Date dateh,Audit audit) {
		
		this.holidayName = holidayName;
		this.dateh = dateh;
        this.audit = audit;
	}

	// Property accessors

	public long getHolidayId() {
		return this.holidayId;
	}

	public void setHolidayId(long holidayId) {
		this.holidayId = holidayId;
	}

	

	public String getHolidayName() {
		return this.holidayName;
	}

	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}

	public Date getDateh() {
		return this.dateh;
	}

	public void setDateh(Date dateh) {
		this.dateh = dateh;
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

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		// TODO Auto-generated method stub
		return getHolidayId();
	}

}