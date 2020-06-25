package com.adept.ims.hostel.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.hostel.database.pojo.HostelFeeReminder;

public interface HostelFeeReminderService {
    public List<HostelFeeReminder> getAll();
    public HostelFeeReminder get(long HostelFeeReminderId);

    
    public HostelFeeReminder save(HostelFeeReminder hostelfeereminder);
    public void update(HostelFeeReminder hostelfeereminder);
    public void remove(long hostelfeereminderId);
    public List<HostelFeeReminder> getById(long hostelFeePaymentId);
    public List<HostelFeeReminder> getByFilter(String filter,String value);
    public List<HostelFeeReminder> getByOperator(HostelFeeReminder hostelfeereminder, String operator);
}