package com.adept.ims.student.service;

import java.util.List;

import com.adept.ims.student.database.pojo.Parent;

public interface ParentService {
    public List<Parent> getAll();
    public Parent get(long parentId);

    public List<Parent> getById(String basicSearchValue);
    public Parent save(Parent parent);
    public void update(Parent parent);
    public void remove(long parentId);
    public List<Parent> getById(long id);
    public List<Parent> getByFilter(String filter,String value);
    public List<Parent> getByOperator(Parent parent, String operator);
}