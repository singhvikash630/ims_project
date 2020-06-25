package com.adept.ims.student.database.dao;

import java.util.List;

import com.adept.ims.student.database.pojo.Parent;
import java.util.Map;

public interface ParentDAO extends StudentMDAO {

    public Parent get(long parentId);

    public void save(Parent parent);

    public void update(Parent parent);

    public void remove(long parentId);

    public List<Parent> getAll();

    public List<Parent> getById(long id);

    public List<Parent> getByFilter(String filter, String value);

    public List<Parent> getByOperator(String operator, Map<String, String> queryMap);
}
