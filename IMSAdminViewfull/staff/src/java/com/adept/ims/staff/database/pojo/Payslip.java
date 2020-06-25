package com.adept.ims.staff.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;

/**
 * Payslip entity. @author MyEclipse Persistence Tools
 */

public class Payslip extends BasePojo implements java.io.Serializable {

	// Fields

	private long payslipId;
	private PaymentMode paymentMode;
	private Date dates;
	private String month;
	private long attendance;
	private long totalAttendance;
	private double bonus;
	private double grossSal;
	private double professionTax;
	private double pf;
	private double it;
	private double netSal;
        private Staff staff;
        private Audit audit;
	// Constructors

	/** default constructor */
	public Payslip() {
	}

	/** full constructor */
	public Payslip(Audit audit, Staff staff, PaymentMode paymentMode,
			Date dates, String month, long attendance, long totalAttendance,
			double bonus, double grossSal, double professionTax, double pf,
			double it, double netSal) {
		this.audit = audit;
		this.staff = staff;
		this.paymentMode = paymentMode;
		this.dates = dates;
		this.month = month;
		this.attendance = attendance;
		this.totalAttendance = totalAttendance;
		this.bonus = bonus;
		this.grossSal = grossSal;
		this.professionTax = professionTax;
		this.pf = pf;
		this.it = it;
		this.netSal = netSal;
	}

	// Property accessors

	public long getPayslipId() {
		return this.payslipId;
	}

	public void setPayslipId(long payslipId) {
		this.payslipId = payslipId;
	}
	public PaymentMode getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Date getDates() {
		return this.dates;
	}

	public void setDates(Date dates) {
		this.dates = dates;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public long getAttendance() {
		return this.attendance;
	}

	public void setAttendance(long attendance) {
		this.attendance = attendance;
	}

	public long getTotalAttendance() {
		return this.totalAttendance;
	}

	public void setTotalAttendance(long totalAttendance) {
		this.totalAttendance = totalAttendance;
	}

	public double getBonus() {
		return this.bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getGrossSal() {
		return this.grossSal;
	}

	public void setGrossSal(double grossSal) {
		this.grossSal = grossSal;
	}

	public double getProfessionTax() {
		return this.professionTax;
	}

	public void setProfessionTax(double professionTax) {
		this.professionTax = professionTax;
	}

	public double getPf() {
		return this.pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getIt() {
		return this.it;
	}

	public void setIt(double it) {
		this.it = it;
	}

	public double getNetSal() {
		return this.netSal;
	}

	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}
        public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
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
		return getPayslipId();
	}

}