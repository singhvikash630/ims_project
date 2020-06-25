package com.adept.ims.curriculum.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.student.database.pojo.Student;

/**
 * FeeMiscPayment entity. @author MyEclipse Persistence Tools
 */

public class FeeMiscPayment extends BasePojo implements java.io.Serializable {

	// Fields

	private long feeMiscPaymentId;
	private String description;
	private double amount;
        private Audit audit;
	private Student student;
	private PaymentMode paymentMode;
	
	// Constructors

	/** default constructor */
	public FeeMiscPayment() {
	}

	/** minimal constructor */
	public FeeMiscPayment(long feeMiscPaymentId) {
		this.feeMiscPaymentId = feeMiscPaymentId;
	}

	/** full constructor */
	public FeeMiscPayment(long feeMiscPaymentId,String description,double amount,Audit audit,Student student,
			PaymentMode paymentMode) {
		this.feeMiscPaymentId = feeMiscPaymentId;
                this.description = description;
		this.amount = amount;
		this.audit = audit;
		this.student = student;
		this.paymentMode = paymentMode;
		}

	// Property accessors

	public long getFeeMiscPaymentId() {
		return this.feeMiscPaymentId;
	}

	public void setFeeMiscPaymentId(long feeMiscPaymentId) {
		this.feeMiscPaymentId = feeMiscPaymentId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

        public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public PaymentMode getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
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
		return getFeeMiscPaymentId();
	}

}