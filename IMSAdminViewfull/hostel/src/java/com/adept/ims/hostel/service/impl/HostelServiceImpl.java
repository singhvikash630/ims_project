package com.adept.ims.hostel.service.impl;

import java.util.List;

import com.adept.ims.hostel.database.dao.HostelDAO;
import com.adept.ims.hostel.database.pojo.Hostel;
import com.adept.ims.hostel.service.HostelService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.HashMap;
import java.util.Map;

public class HostelServiceImpl implements HostelService {

    private static Log log = LogFactory.getLog(HostelServiceImpl.class);
    private HostelDAO dao;

    public void setHostelDAO(HostelDAO dao) {
        this.dao = dao;
    }

    public List<Hostel> getAll() {
        return dao.getAll();
    }

    public Hostel get(long hostelId) {
        Hostel hostel = dao.get(hostelId);

        if (hostel == null) {
            log.warn("HostelId '" + hostelId + "' not found in database.");
        }

        return hostel;
    }

    public Hostel save(Hostel hostel) {
        dao.save(hostel);

        return hostel;
    }

    public void remove(long hostelId) {
        if (dao.get(hostelId) != null) {
            dao.remove(hostelId);
        }
    }

    public List<Hostel> getByName(String name) {
    return dao.getByName(name);
    }

    public void update(Hostel hostel) {
        dao.update(hostel);
    }

    public List<Hostel> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Hostel> getByOperator(Hostel hostel, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

     /*   if (!"".equals(hostel.getHostelId().trim())) {
            queryMap.put("hostelId", hostel.getHostelId());
        }*/

        return dao.getByOperator(operator, queryMap);
    }

    public List<Hostel> getById(long hostelId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


  

}