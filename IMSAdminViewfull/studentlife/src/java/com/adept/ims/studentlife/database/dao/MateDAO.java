package com.adept.ims.studentlife.database.dao;

import java.util.List;

import com.adept.ims.studentlife.database.pojo.Mate;
import java.util.Map;

public interface MateDAO extends StudentlifeDAO {

    public mate get(long studentId);

    //public void save(PersonRole personRole);

    //public void update(PersonRole personRole);

    //public void remove(long personId);

    public List<Mate> getAll();

    //public List<RoleService> getByName(String name);

    public List<Mate> getByFilter(String filter, String value);

    public List<Mate> getByOperator(String operator, Map<String, String> queryMap);
}
