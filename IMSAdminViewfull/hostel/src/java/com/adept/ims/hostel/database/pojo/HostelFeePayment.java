package com.adept.ims.hostel.database.pojo;

import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.common.database.pojo.BasePojo;

import java.io.Serializable;
import java.util.Date;



/**
 * HostelFeePayment entity. @author MyEclipse Persistence Tools
 */
public class HostelFeePayment extends BasePojo implements java.io.Serializable {

    // Fields
    private long feePaymentId;
    private Date dateh;
    private String year;
    private double amount;
    private HostelOccupant hostelOccupant;
    private Audit audit;
    // Constructors

    /** default constructor */
    public HostelFeePayment() {
    }

    /** full constructor */
    public HostelFeePayment(Audit audit, HostelOccupant hostelOccupant,
            Date dateh, String year, double amount) {
        this.audit = audit;
        this.hostelOccupant = hostelOccupant;
        this.dateh = dateh;
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

    public Date getDateh() {
        return this.dateh;
    }

    public void setDateh(Date dateh) {
        this.dateh = dateh;
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

    public HostelOccupant getHostelOccupant() {
        return this.hostelOccupant;
    }

    public void setHostelOccupant(HostelOccupant hostelOccupant) {
        this.hostelOccupant = hostelOccupant;
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