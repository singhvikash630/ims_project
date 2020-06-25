package com.adept.ims.institute.service.impl;

import com.adept.ims.institute.database.dao.TrustDAO;
import com.adept.ims.institute.database.pojo.Trust;
import com.adept.ims.institute.service.TrustService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class TrustServiceImpl implements TrustService {

    private static Log log = LogFactory.getLog(TrustServiceImpl.class);
    private TrustDAO dao;

    public void setTrustDAO(TrustDAO dao) {
        this.dao = dao;
    }

    public List<Trust> getAll() {
        return dao.getAll();
    }

    public Trust get(long trustId) {
        Trust trust = dao.get(trustId);

        if (trust == null) {
            log.warn("TrustId '" + trustId + "' not found in database.");
        }

        return trust;
    }

    public Trust getByPrimaryKey(long trustId) {
        return get(trustId);
    }

    public Trust save(Trust trust) {
        dao.save(trust);

        return trust;
    }

    public void remove(long trustId) {
        if (dao.get(trustId) != null) {
            dao.remove(trustId);
        }
    }

    public List<Trust> getByName(String name) {
        return dao.getByFilter("trustName", name);
    }

    public void update(Trust trust) {
        dao.update(trust);
    }

    public List<Trust> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Trust> getByOperator(Trust trust, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        if (!"".equals(trust.getTrustName().trim())) {
            queryMap.put("trustName", trust.getTrustName());
        }
        if (!"".equals(trust.getAddress().getCity().trim())) {
            queryMap.put("address.city", trust.getAddress().getCity());
        }


        return dao.getByOperator(operator, queryMap);

    }
}
