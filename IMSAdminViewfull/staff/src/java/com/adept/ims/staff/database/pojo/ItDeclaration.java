package com.adept.ims.staff.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * ItDeclaration entity. @author MyEclipse Persistence Tools
 */

public class ItDeclaration extends BasePojo implements java.io.Serializable {

	// Fields

	private long itId;
	private double sa;
	private double lta;
	private double ma;
        private HrcDetails hrcDetails;
	private Emp80cDetails emp80cDetails;
	private MiscItDetails miscItDetails;
        private Audit audit;
	// Constructors

	/** default constructor */
	public ItDeclaration() {
	}

	/** full constructor */
	public ItDeclaration(Audit audit, HrcDetails hrcDetails,
			Emp80cDetails emp80cDetails, MiscItDetails miscItDetails,
			double sa, double lta, double ma) {
		this.audit = audit;
		this.hrcDetails = hrcDetails;
		this.emp80cDetails = emp80cDetails;
		this.miscItDetails = miscItDetails;
		this.sa = sa;
		this.lta = lta;
		this.ma = ma;
	}

	// Property accessors

	public long getItId() {
		return this.itId;
	}

	public void setItId(long itId) {
		this.itId = itId;
	}

	public MiscItDetails getMiscItDetails() {
		return this.miscItDetails;
	}

	public void setMiscItDetails(MiscItDetails miscItDetails) {
		this.miscItDetails = miscItDetails;
	}

	public double getSa() {
		return this.sa;
	}

	public void setSa(double sa) {
		this.sa = sa;
	}

	public double getLta() {
		return this.lta;
	}

	public void setLta(double lta) {
		this.lta = lta;
	}

	public double getMa() {
		return this.ma;
	}

	public void setMa(double ma) {
		this.ma = ma;
	}
        public HrcDetails getHrcDetails() {
		return this.hrcDetails;
	}

	public void setHrcDetails(HrcDetails hrcDetails) {
		this.hrcDetails = hrcDetails;
	}

	public Emp80cDetails getEmp80cDetails() {
		return this.emp80cDetails;
	}

	public void setEmp80cDetails(Emp80cDetails emp80cDetails) {
		this.emp80cDetails = emp80cDetails;
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
     */@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		// TODO Auto-generated method stub
		return getItId();
	}

}