/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.service.impl;

import com.adept.ims.institute.database.dao.InstituteDAO;
import com.adept.ims.institute.database.pojo.Institute;
import com.adept.ims.institute.service.InstituteService;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 *
 * @author Viswanath
 */
public class InstituteServiceImpl implements InstituteService {

    private static Log log = LogFactory.getLog(InstituteServiceImpl.class);
    private InstituteDAO dao;

    public void setInstituteDAO(InstituteDAO dao) {
        this.dao = dao;
    }

    public List<Institute> getAll() {
        return dao.getAll();
    }

    public Institute get(long instituteId) {
        Institute institute = dao.get(instituteId);

        if (institute == null) {
            log.warn("InstitueId " + instituteId + " not found.");
        }

        return institute;
    }

    public Institute save(Institute institute) {
        dao.save(institute);
        return institute;
    }

    public void remove(long instituteId) {
        dao.remove(instituteId);        
    }

    public void update(Institute institute) {
        dao.update(institute);
    }

    public List<Institute> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Institute> getByOperator(Institute institute, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        if (institute.getTrust().getTrustId() != 0) {
            queryMap.put("trusId", String.valueOf(institute.getTrust().getTrustId()));
        }
        if (institute.getInstituteMaster().getInstituteMasterId() != 0) {
            queryMap.put("instituteMasterId", String.valueOf(institute.getInstituteMaster().getInstituteMasterId()));
        }
        if (!"".equals(institute.getStatus().trim())) {
            queryMap.put("status", institute.getStatus().trim());
        }

        return dao.getByOperator(operator, queryMap);

    }

    public Institute getByPrimaryKey(long primaryKeyId) {
        return get(primaryKeyId);
    }

}
