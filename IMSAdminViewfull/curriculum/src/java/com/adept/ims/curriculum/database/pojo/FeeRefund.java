package com.adept.ims.curriculum.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.course.database.pojo.CourseFee;
import com.adept.ims.student.database.pojo.Student;

/**
 * FeeRefund entity. @author MyEclipse Persistence Tools
 */

public class FeeRefund extends BasePojo implements java.io.Serializable {

	// Fields

	private long feeRefundId;
	private double amount;
        private Audit audit;
	private CourseFee courseFee;
	private Student student;
	private PaymentMode paymentMode;
	
	// Constructors

	/** default constructor */
	public FeeRefund() {
	}

	/** minimal constructor */
	public FeeRefund(long feeRefundId) {
		this.feeRefundId = feeRefundId;
	}

	/** full constructor */
	public FeeRefund(long feeRefundId, Audit audit, CourseFee courseFee,
			Student student, PaymentMode paymentMode, double amount) {
		this.feeRefundId = feeRefundId;
		this.amount = amount;
                this.audit = audit;
		this.courseFee = courseFee;
		this.student = student;
		this.paymentMode = paymentMode;
			}

	// Property accessors

	public long getFeeRefundId() {
		return this.feeRefundId;
	}

	public void setFeeRefundId(long feeRefundId) {
		this.feeRefundId = feeRefundId;
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

	public CourseFee getCourseFee() {
		return this.courseFee;
	}

	public void setCourseFee(CourseFee courseFee) {
		this.courseFee = courseFee;
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
		return getFeeRefundId();
	}

}