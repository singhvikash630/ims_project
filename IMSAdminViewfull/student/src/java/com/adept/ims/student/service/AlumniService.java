package com.adept.ims.student.service;

import java.util.List;

import com.adept.ims.student.database.pojo.Alumni;

public interface AlumniService {
    public List<Alumni> getAll();
    public Alumni get(long alumniId);

    public List<Alumni> getById(String basicSearchValue);
    public Alumni save(Alumni Alumni);
    public void update(Alumni Alumni);
    public void remove(long alumniId);
    public List<Alumni> getById(long id);
    public List<Alumni> getByFilter(String filter,String value);
    public List<Alumni> getByOperator(Alumni Alumni, String operator);
}