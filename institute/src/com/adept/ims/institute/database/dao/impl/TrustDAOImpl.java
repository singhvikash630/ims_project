package com.adept.ims.institute.database.dao.impl;

import com.adept.ims.institute.database.dao.TrustDAO;
import com.adept.ims.institute.database.pojo.Trust;

import java.util.List;
import java.util.Map;

/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class TrustDAOImpl extends InstituteModuleDAOImpl implements TrustDAO {

    public TrustDAOImpl() {
        className = Trust.class.getName();
    }

    public Trust get(long trustId) {
        return (Trust) super.get(trustId);
    }

    public List<Trust> getAll() {
        return super.getAll();
    }

    public void save(Trust trust) {
        super.save(trust);
    }

    public void update(Trust trust) {
        super.update(trust);
    }

    public List<Trust> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Trust> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
}
