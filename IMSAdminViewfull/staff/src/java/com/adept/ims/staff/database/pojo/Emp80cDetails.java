package com.adept.ims.staff.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * Emp80cDetails entity. @author MyEclipse Persistence Tools
 */

public class Emp80cDetails extends BasePojo implements java.io.Serializable {

	// Fields

	private long emp80cId;
	private double pensionFund;
	private double ppf;
	private double insurancePremium;
	private double housingLoan;
	private double nsc;
	private double elss;
	private double infraBonds;
	private double postOffice;
	private double unitLinked;
	private double tuitionExp;
	private double misc;
        private Audit audit;
	// Constructors

	/** default constructor */
	public Emp80cDetails() {
	}

	/** full constructor */
	public Emp80cDetails(Audit audit, double pensionFund, double ppf,
			double insurancePremium, double housingLoan, double nsc,
			double elss, double infraBonds, double postOffice,
			double unitLinked, double tuitionExp, double misc) {
		this.audit = audit;
		this.pensionFund = pensionFund;
		this.ppf = ppf;
		this.insurancePremium = insurancePremium;
		this.housingLoan = housingLoan;
		this.nsc = nsc;
		this.elss = elss;
		this.infraBonds = infraBonds;
		this.postOffice = postOffice;
		this.unitLinked = unitLinked;
		this.tuitionExp = tuitionExp;
		this.misc = misc;
	}

	// Property accessors

	public long getEmp80cId() {
		return this.emp80cId;
	}

	public void setEmp80cId(long emp80cId) {
		this.emp80cId = emp80cId;
	}

	public double getPensionFund() {
		return this.pensionFund;
	}

	public void setPensionFund(double pensionFund) {
		this.pensionFund = pensionFund;
	}

	public double getPpf() {
		return this.ppf;
	}

	public void setPpf(double ppf) {
		this.ppf = ppf;
	}

	public double getInsurancePremium() {
		return this.insurancePremium;
	}

	public void setInsurancePremium(double insurancePremium) {
		this.insurancePremium = insurancePremium;
	}

	public double getHousingLoan() {
		return this.housingLoan;
	}

	public void setHousingLoan(double housingLoan) {
		this.housingLoan = housingLoan;
	}

	public double getNsc() {
		return this.nsc;
	}

	public void setNsc(double nsc) {
		this.nsc = nsc;
	}

	public double getElss() {
		return this.elss;
	}

	public void setElss(double elss) {
		this.elss = elss;
	}

	public double getInfraBonds() {
		return this.infraBonds;
	}

	public void setInfraBonds(double infraBonds) {
		this.infraBonds = infraBonds;
	}

	public double getPostOffice() {
		return this.postOffice;
	}

	public void setPostOffice(double postOffice) {
		this.postOffice = postOffice;
	}

	public double getUnitLinked() {
		return this.unitLinked;
	}

	public void setUnitLinked(double unitLinked) {
		this.unitLinked = unitLinked;
	}

	public double getTuitionExp() {
		return this.tuitionExp;
	}

	public void setTuitionExp(double tuitionExp) {
		this.tuitionExp = tuitionExp;
	}

	public double getMisc() {
		return this.misc;
	}

	public void setMisc(double misc) {
		this.misc = misc;
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
		return getEmp80cId();
	}

}