package com.adept.ims.hostel.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;

/**
 * HostelFeeReminder entity. @author MyEclipse Persistence Tools
 */
public class HostelFeeReminder extends BasePojo implements java.io.Serializable {

    // Fields
    private long reminderId;
    private Date dueDate;
    private String status;
    private Hostel hostel;
    private Audit audit;
    // Constructors

    /** default constructor */
    public HostelFeeReminder() {
    }

    /** full constructor */
    public HostelFeeReminder(Audit audit, Hostel hostel, Date dueDate,
            String status) {
        this.audit = audit;
        this.hostel = hostel;
        this.dueDate = dueDate;
        this.status = status;
    }

    // Property accessors
    public long getReminderId() {
        return this.reminderId;
    }

    public void setReminderId(long reminderId) {
        this.reminderId = reminderId;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Hostel getHostel() {
        return this.hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
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
        return getReminderId();
    }
}