package com.adept.ims.hostel.service.impl;

import java.util.List;


import com.adept.ims.hostel.database.dao.MessOccupantDAO;
import com.adept.ims.hostel.database.pojo.MessOccupant;
import com.adept.ims.hostel.service.MessOccupantService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MessOccupantServiceImpl implements MessOccupantService {

    private static Log log = LogFactory.getLog(MessOccupantServiceImpl.class);
    private MessOccupantDAO dao;

    public void setMessOccupantDAO(MessOccupantDAO dao) {
        this.dao = dao;
    }

    public List<MessOccupant> getAll() {
        return dao.getAll();
    }

    public MessOccupant get(long messoccupantId) {
        MessOccupant messoccupant = dao.get(messoccupantId);

        if (messoccupant == null) {
            log.warn("MessOccupantId '" + messoccupantId + "' not found in database.");
        }

        return messoccupant;
    }

    public MessOccupant save(MessOccupant messoccupant) {
        dao.save(messoccupant);

        return messoccupant;
    }

    public void remove(long messoccupantId) {
        if (dao.get(messoccupantId) != null) {
            dao.remove(messoccupantId);
        }
    }

    public List<MessOccupant> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(MessOccupant messoccupant) {
        dao.update(messoccupant);
    }

    public List<MessOccupant> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<MessOccupant> getByOperator(MessOccupant messoccupant, String operator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

  
}
