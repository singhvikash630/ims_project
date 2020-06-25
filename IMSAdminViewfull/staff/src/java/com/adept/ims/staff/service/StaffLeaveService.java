package com.adept.ims.staff.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.staff.database.pojo.Leaves;

public interface StaffLeaveService {
    public List<Leaves> getAll();
    public Leaves get(long leaveId);
    public Leaves save(Leaves leaves);
    public void update(Leaves leaves);
    public void remove(long leavesId);
    public List<Leaves> getByName(String name);
    public List<Leaves> getByFilter(String filter,String value);
    public List<Leaves> getByOperator(Leaves leaves, String operator);
}