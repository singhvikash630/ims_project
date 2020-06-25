package com.adept.ims.curriculum.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.curriculum.database.pojo.Assignment;

public interface AssignmentService {
    public List<Assignment> getAll();
    public Assignment get(long assignId);
    public Assignment save(Assignment assignment);
    public void update(Assignment assignment);
    public void remove(long assignId);
    public List<Assignment> getByName(String name);
   
    public List<Assignment> getByFilter(String filter,String value);
    public List<Assignment> getByOperator(Assignment assignment, String operator);
}