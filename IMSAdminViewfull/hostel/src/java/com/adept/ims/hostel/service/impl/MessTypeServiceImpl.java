package com.adept.ims.hostel.service.impl;

import java.util.List;


import com.adept.ims.hostel.database.dao.MessTypeDAO;
import com.adept.ims.hostel.database.pojo.MessType;
import com.adept.ims.hostel.service.MessTypeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MessTypeServiceImpl implements MessTypeService {

    private static Log log = LogFactory.getLog(MessTypeServiceImpl.class);
    private MessTypeDAO dao;

    public void setMessTypeDAO(MessTypeDAO dao) {
        this.dao = dao;
    }

    public List<MessType> getAll() {
        return dao.getAll();
    }

    public MessType get(long messtypeId) {
        MessType messtype = dao.get(messtypeId);

        if (messtype == null) {
            log.warn("MessTypeId '" + messtypeId + "' not found in database.");
        }

        return messtype;
    }

    public MessType save(MessType messtype) {
        dao.save(messtype);

        return messtype;
    }

    public void remove(long messtypeId) {
        if (dao.get(messtypeId) != null) {
            dao.remove(messtypeId);
        }
    }

    public List<MessType> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(MessType messtype) {
        dao.update(messtype);
    }

    public List<MessType> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<MessType> getByOperator(MessType messtype, String operator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   

}
