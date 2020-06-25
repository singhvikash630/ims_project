/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.institute.service.impl;


import com.adept.ims.institute.database.dao.DesignationDAO;
import com.adept.ims.institute.service.DesignationService;
import com.adept.ims.institute.database.pojo.Designation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author Viswanath
 */
public class DesignationServiceImpl implements DesignationService{
     private static Log log = LogFactory.getLog(DesignationServiceImpl.class);
    private DesignationDAO dao;

    public void setDesignationDAO(DesignationDAO dao) {
        this.dao = dao;
    }

    public List<Designation> getAll() {
        return dao.getAll();
    }

    public Designation get(long designationId) {
        Designation designation = dao.get(designationId);

        if (designation== null) {
            log.warn("DesignationId '" + designationId + "'not found in database.");
        }

        return designation;
    }

    public void save(Designation designation) {
        dao.save(designation);


    }

    public void remove(long designationId) {
        if (dao.get(designationId) != null) {
            dao.remove(designationId);
        }
    }

    public List<Designation> getByName(String name) {
        return dao.getByFilter("name", name);
    }

    public void update(Designation department) {
        dao.update(department);
    }

    public List<Designation> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Designation> getByOperator(Designation designation, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        if (!"".equals(designation.getName().trim())) {
            queryMap.put("name",designation.getName());
        }       

        return dao.getByOperator(operator, queryMap);
    }

    public List<Designation> getByOperator(String operator, Map<String, String> queryMap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
