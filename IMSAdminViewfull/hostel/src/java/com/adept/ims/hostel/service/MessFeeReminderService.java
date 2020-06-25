package com.adept.ims.hostel.service;

import java.util.List;

import com.adept.ims.hostel.database.pojo.MessFeeReminder;

public interface MessFeeReminderService {
    public List<MessFeeReminder> getAll();
    public MessFeeReminder get(long MessFeeReminderId);
    public MessFeeReminder save(MessFeeReminder messfeereminder);
    public void update(MessFeeReminder messfeereminder);
    public void remove(long messfeereminderId);
    public List<MessFeeReminder> getByName(String name);
    public List<MessFeeReminder> getByFilter(String filter,String value);
    public List<MessFeeReminder> getByOperator(MessFeeReminder messfeereminder, String operator);
}