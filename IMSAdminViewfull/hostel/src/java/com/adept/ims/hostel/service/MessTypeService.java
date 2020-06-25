package com.adept.ims.hostel.service;

import java.util.List;

import com.adept.ims.hostel.database.pojo.MessType;

public interface MessTypeService {
    public List<MessType> getAll();
    public MessType get(long MessTypeId);
    public MessType save(MessType messtype);
    public void update(MessType messtype);
    public void remove(long messtypeId);
    public List<MessType> getByName(String name);
    public List<MessType> getByFilter(String filter,String value);
    public List<MessType> getByOperator(MessType messtype, String operator);
}