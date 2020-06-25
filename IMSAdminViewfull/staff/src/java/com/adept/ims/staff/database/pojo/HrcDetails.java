package com.adept.ims.staff.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * HrcDetails entity. @author MyEclipse Persistence Tools
 */

public class HrcDetails extends BasePojo implements java.io.Serializable {

	// Fields

	private long hrcId;
	private double april;
	private double may;
	private double june;
	private double july;
	private double august;
	private double september;
	private double november;
	private double december;
	private double january;
	private double february;
	private double march;
	private double october;
        private Audit audit;
	// Constructors

	/** default constructor */
	public HrcDetails() {
	}

	/** full constructor */
	public HrcDetails(Audit audit, double april, double may, double june,
			double july, double august, double september, double november,
			double december, double january, double february, double march,
			double october) {
		this.audit = audit;
		this.april = april;
		this.may = may;
		this.june = june;
		this.july = july;
		this.august = august;
		this.september = september;
		this.november = november;
		this.december = december;
		this.january = january;
		this.february = february;
		this.march = march;
		this.october = october;
	}

	// Property accessors

	public long getHrcId() {
		return this.hrcId;
	}

	public void setHrcId(long hrcId) {
		this.hrcId = hrcId;
	}

	public double getApril() {
		return this.april;
	}

	public void setApril(double april) {
		this.april = april;
	}

	public double getMay() {
		return this.may;
	}

	public void setMay(double may) {
		this.may = may;
	}

	public double getJune() {
		return this.june;
	}

	public void setJune(double june) {
		this.june = june;
	}

	public double getJuly() {
		return this.july;
	}

	public void setJuly(double july) {
		this.july = july;
	}

	public double getAugust() {
		return this.august;
	}

	public void setAugust(double august) {
		this.august = august;
	}

	public double getSeptember() {
		return this.september;
	}

	public void setSeptember(double september) {
		this.september = september;
	}

	public double getNovember() {
		return this.november;
	}

	public void setNovember(double november) {
		this.november = november;
	}

	public double getDecember() {
		return this.december;
	}

	public void setDecember(double december) {
		this.december = december;
	}

	public double getJanuary() {
		return this.january;
	}

	public void setJanuary(double january) {
		this.january = january;
	}

	public double getFebruary() {
		return this.february;
	}

	public void setFebruary(double february) {
		this.february = february;
	}

	public double getMarch() {
		return this.march;
	}

	public void setMarch(double march) {
		this.march = march;
	}

	public double getOctober() {
		return this.october;
	}

	public void setOctober(double october) {
		this.october = october;
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
		return getHrcId();
	}

}