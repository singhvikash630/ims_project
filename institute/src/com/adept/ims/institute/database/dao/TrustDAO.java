package com.adept.ims.institute.database.dao;

import java.util.List;

import com.adept.ims.institute.database.pojo.Trust;

import java.util.Map;

public interface TrustDAO extends InstituteModuleDAO {

    public Trust get(long trustId);

    public void save(Trust trust);

    public void update(Trust trust);

    public void remove(long trustId);

    public List<Trust> getAll();

    public List<Trust> getByFilter(String filter, String value);

    public List<Trust> getByOperator(String operator, Map<String, String> queryMap);
}
