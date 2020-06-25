package com.adept.ims.curriculum.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.curriculum.database.pojo.Attendance;

public interface AttendanceService {
    public List<Attendance> getAll();
    public Attendance get(long attendanceId);
    public Attendance save(Attendance attendance);
    public void update(Attendance attendance);
    public void remove(long attendanceId);
    public List<Attendance> getByName(String name);
    
    public List<Attendance> getByFilter(String filter,String value);
    public List<Attendance> getByOperator(Attendance attendance, String operator);
}