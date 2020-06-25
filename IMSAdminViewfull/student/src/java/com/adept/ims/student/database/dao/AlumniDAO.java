package com.adept.ims.student.database.dao;

import java.util.List;

import com.adept.ims.student.database.pojo.Alumni;
import java.util.Map;

public interface AlumniDAO extends StudentMDAO {

    public Alumni get(long alumniId);

    public List<Alumni> getById(long id);

    public void save(Alumni Alumni);

    public void update(Alumni Alumni);

    public void remove(long alumniId);

    public List<Alumni> getAll();

    public List<Alumni> getByFilter(String filter, String value);

    public List<Alumni> getByOperator(String operator, Map<String, String> queryMap);
}
