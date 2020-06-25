package com.adept.ims.student.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.student.database.dao.AlumniDAO;
import com.adept.ims.student.database.pojo.Alumni;
import com.adept.ims.student.service.AlumniService;
import java.util.HashMap;
import java.util.Map;

public class AlumniServiceImpl implements AlumniService {

    private static Log log = LogFactory.getLog(AlumniServiceImpl.class);
    private AlumniDAO dao;

    public void setAlumniDAO(AlumniDAO dao) {
        this.dao = dao;
    }

    public List<Alumni> getAll() {
        return dao.getAll();
    }

    public Alumni get(long alumniId) {
        Alumni Alumni = dao.get(alumniId);

        if (Alumni == null) {
            log.warn("AlumniId '" + alumniId + "' not found in database.");
        }

        return Alumni;
    }

    public Alumni save(Alumni Alumni) {
        dao.save(Alumni);

        return Alumni;
    }

    public void remove(long alumniId) {
        if (dao.get(alumniId) != null) {
            dao.remove(alumniId);
        }
    }

    public List<Alumni> getById(long id) {
        return dao.getById(id);
    }

    public void update(Alumni Alumni) {
        dao.update(Alumni);
    }

    public List<Alumni> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Alumni> getByOperator(Alumni Alumni, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

         /*if (!"".equals(Alumni.getAudit().trim())) {
        queryMap.put("audit", Alumni.getAudit());
        }
        if (!"".equals(Alumni.getAddress().trim())) {
        queryMap.put("address" , Alumni.getAddress());
        }*/


        return dao.getByOperator(operator, queryMap);

    }

    public List<Alumni> getById(String basicSearchValue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}



