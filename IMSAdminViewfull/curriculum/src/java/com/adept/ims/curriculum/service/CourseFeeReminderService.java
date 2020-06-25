package com.adept.ims.curriculum.service;

import com.adept.ims.course.database.pojo.CourseFee;
import java.util.Collection;
import java.util.List;

import com.adept.ims.curriculum.database.pojo.CourseFeeReminder;

public interface CourseFeeReminderService {
    public List<CourseFeeReminder> getAll();
    public CourseFeeReminder get(long reminderId);

    public Collection<CourseFeeReminder> getByName(CourseFee courseFee);
    public CourseFeeReminder save(CourseFeeReminder coursefeereminder);
    public void update(CourseFeeReminder coursefeereminder);
    public void remove(long reminderId);
    public List<CourseFeeReminder> getByName(String name);
    
    public List<CourseFeeReminder> getByFilter(String filter,String value);
    public List<CourseFeeReminder> getByOperator(CourseFeeReminder coursefeereminder, String operator);
}