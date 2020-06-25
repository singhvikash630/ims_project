package com.adept.ims.hostel.service.impl;

import java.util.Collection;
import java.util.List;


import com.adept.ims.hostel.database.dao.MessDAO;
import com.adept.ims.hostel.database.pojo.Mess;
import com.adept.ims.hostel.service.MessService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MessServiceImpl implements MessService {

    private static Log log = LogFactory.getLog(MessServiceImpl.class);
    private MessDAO dao;

    public void setMessDAO(MessDAO dao) {
        this.dao = dao;
    }

    public List<Mess> getAll() {
        return dao.getAll();
    }

    public Mess get(long messId) {
        Mess mess = dao.get(messId);

        if (mess == null) {
            log.warn("MessId '" + messId + "' not found in database.");
        }

        return mess;
    }

    public Mess save(Mess mess) {
        dao.save(mess);

        return mess;
    }

    public void remove(long messId) {
        if (dao.get(messId) != null) {
            dao.remove(messId);
        }
    }

    public List<Mess> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(Mess mess) {
        dao.update(mess);
    }

    public List<Mess> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public Collection<Mess> getByName(Object messName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Mess> getByOperator(Mess mess, String operator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

    
}
