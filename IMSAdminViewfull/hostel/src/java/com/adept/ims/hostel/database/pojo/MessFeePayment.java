package com.adept.ims.hostel.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;

/**
 * MessFeePayment entity. @author MyEclipse Persistence Tools
 */

public class MessFeePayment extends BasePojo implements java.io.Serializable {

	// Fields

	private long feePaymentId;
	private Date datem;
	private String year;
	private double amount;
        private MessOccupant messOccupant;
        private Audit audit;
	// Constructors

	/** default constructor */
	public MessFeePayment() {
	}

	/** full constructor */
	public MessFeePayment(Audit audit, MessOccupant messOccupant, Date datem,
			String year, double amount) {
		this.audit = audit;
		this.messOccupant = messOccupant;
		this.datem = datem;
		this.year = year;
		this.amount = amount;
	}

	// Property accessors

	public long getFeePaymentId() {
		return this.feePaymentId;
	}

	public void setFeePaymentId(long feePaymentId) {
		this.feePaymentId = feePaymentId;
	}

	public Date getDatem() {
		return this.datem;
	}

	public void setDatem(Date datem) {
		this.datem = datem;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
        public MessOccupant getMessOccupant() {
		return this.messOccupant;
	}

	public void setMessOccupant(MessOccupant messOccupant) {
		this.messOccupant = messOccupant;
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
		return getFeePaymentId();
	}

}