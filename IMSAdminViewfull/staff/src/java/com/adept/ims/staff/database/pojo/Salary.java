package com.adept.ims.staff.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * Salary entity. @author MyEclipse Persistence Tools
 */

public class Salary extends BasePojo implements java.io.Serializable {

	// Fields

	private long salaryId;
	private double basic;
	private double pf;
	private double gratuity;
	private String panNo;
	private String pfAccountNo;
        private SalaryFlaxible salaryFlaxible;
	private ItDeclaration itDeclaration;
	private Staff staff;
        private Audit audit;
	// Constructors

	/** default constructor */
	public Salary() {
	}

	/** full constructor */
	public Salary(Audit audit, SalaryFlaxible salaryFlaxible,
			ItDeclaration itDeclaration, Staff staff, double basic, double pf,
			double gratuity, String panNo, String pfAccountNo) {
		this.audit = audit;
		this.salaryFlaxible = salaryFlaxible;
		this.itDeclaration = itDeclaration;
		this.staff = staff;
		this.basic = basic;
		this.pf = pf;
		this.gratuity = gratuity;
		this.panNo = panNo;
		this.pfAccountNo = pfAccountNo;
	}

	// Property accessors

	public long getSalaryId() {
		return this.salaryId;
	}

	public void setSalaryId(long salaryId) {
		this.salaryId = salaryId;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public double getBasic() {
		return this.basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getPf() {
		return this.pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getGratuity() {
		return this.gratuity;
	}

	public void setGratuity(double gratuity) {
		this.gratuity = gratuity;
	}

	public String getPanNo() {
		return this.panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getPfAccountNo() {
		return this.pfAccountNo;
	}

	public void setPfAccountNo(String pfAccountNo) {
		this.pfAccountNo = pfAccountNo;
	}
        public SalaryFlaxible getSalaryFlaxible() {
		return this.salaryFlaxible;
	}

	public void setSalaryFlaxible(SalaryFlaxible salaryFlaxible) {
		this.salaryFlaxible = salaryFlaxible;
	}

	public ItDeclaration getItDeclaration() {
		return this.itDeclaration;
	}

	public void setItDeclaration(ItDeclaration itDeclaration) {
		this.itDeclaration = itDeclaration;
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
		return getSalaryId();
	}

}