package com.adept.ims.institute.database.pojo;

import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.common.database.pojo.BasePojo;

import java.io.Serializable;

/**
 * Designation entity. @author MyEclipse Persistence Tools
 */

public class Designation extends BasePojo implements java.io.Serializable {

	// Fields

	private long designationId;
	private String name;
	private double minSalary;
	private double maxSalary;
    private Audit audit;
    private Institute institute;

	// Constructors

	/** default constructor */
	public Designation() {
	    institute = new Institute();
    }


	/** full constructor */
	public Designation( String name, double minSalary,
			double maxSalary,Audit audit,Institute institute) {
		
		this.name = name;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
        this.audit = audit;
        this.institute=institute;
	}

	// Property accessors

	public long getDesignationId() {
		return this.designationId;
	}

	public void setDesignationId(long designationId) {
		this.designationId = designationId;
	}

	

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMinSalary() {
		return this.minSalary;
	}

	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	public double getMaxSalary() {
		return this.maxSalary;
	}

	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

    public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
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
     */	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		// TODO Auto-generated method stub
		return getDesignationId();
	}

}