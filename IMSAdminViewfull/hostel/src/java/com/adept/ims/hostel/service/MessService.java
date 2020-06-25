package com.adept.ims.hostel.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.hostel.database.pojo.Mess;

public interface MessService {
    public List<Mess> getAll();
    public Mess get(long MessId);

    public Collection<Mess> getByName(Object messName);
    public Mess save(Mess mess);
    public void update(Mess mess);
    public void remove(long messId);
    public List<Mess> getByName(String name);
    public List<Mess> getByFilter(String filter,String value);
    public List<Mess> getByOperator(Mess mess, String operator);
}