package com.adept.ims.staff.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * SalaryFlaxible entity. @author MyEclipse Persistence Tools
 */

public class SalaryFlaxible extends BasePojo  implements java.io.Serializable {

	// Fields

	private long flaxibleId;
	private double hra;
	private double ca;
	private double foodCoupons;
	private double sa;
	private double lta;
	private double ma;
        private Audit audit;
	// Constructors

	/** default constructor */
	public SalaryFlaxible() {
	}

	/** full constructor */
	public SalaryFlaxible(Audit audit, double hra, double ca,
			double foodCoupons, double sa, double lta, double ma) {
		this.audit = audit;
		this.hra = hra;
		this.ca = ca;
		this.foodCoupons = foodCoupons;
		this.sa = sa;
		this.lta = lta;
		this.ma = ma;
	}

	// Property accessors

	public long getFlaxibleId() {
		return this.flaxibleId;
	}

	public void setFlaxibleId(long flaxibleId) {
		this.flaxibleId = flaxibleId;
	}

	public double getHra() {
		return this.hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getCa() {
		return this.ca;
	}

	public void setCa(double ca) {
		this.ca = ca;
	}

	public double getFoodCoupons() {
		return this.foodCoupons;
	}

	public void setFoodCoupons(double foodCoupons) {
		this.foodCoupons = foodCoupons;
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
		return getFlaxibleId();
	}

}