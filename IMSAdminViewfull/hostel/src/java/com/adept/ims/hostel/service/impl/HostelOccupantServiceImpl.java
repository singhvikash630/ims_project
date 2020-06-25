package com.adept.ims.hostel.service.impl;

import java.util.List;


import com.adept.ims.hostel.database.dao.HostelOccupantDAO;
import com.adept.ims.hostel.database.pojo.HostelOccupant;
import com.adept.ims.hostel.service.HostelOccupantService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HostelOccupantServiceImpl implements HostelOccupantService {

    private static Log log = LogFactory.getLog(HostelOccupantServiceImpl.class);
    private HostelOccupantDAO hostelOccupantDAO;

    public void setHostelOccupantDAO(HostelOccupantDAO hostelOccupantDAO) {
        this.hostelOccupantDAO = hostelOccupantDAO;
    }

    public List<HostelOccupant> getAll() {
        return hostelOccupantDAO.getAll();
    }

    public HostelOccupant get(long hosteloccupantId) {
        HostelOccupant hosteloccupant = hostelOccupantDAO.get(hosteloccupantId);

        if (hosteloccupant == null) {
            log.warn("HostelOccupantId '" + hosteloccupantId + "' not found in database.");
        }

        return hosteloccupant;
    }

    public HostelOccupant save(HostelOccupant hosteloccupant) {
        hostelOccupantDAO.save(hosteloccupant);

        return hosteloccupant;
    }

    public void remove(long hosteloccupantId) {
        if (hostelOccupantDAO.get(hosteloccupantId) != null) {
            hostelOccupantDAO.remove(hosteloccupantId);
        }
    }

    public List<HostelOccupant> getByName(String name) {
        return hostelOccupantDAO.getByName(name);
    }

    public void update(HostelOccupant hosteloccupant) {
        hostelOccupantDAO.update(hosteloccupant);
    }

    public List<HostelOccupant> getByFilter(String filter, String value) {
        return hostelOccupantDAO.getByFilter(filter, value);
    }

    public List<HostelOccupant> getByOperator(HostelOccupant hosteloccupant, String operator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
