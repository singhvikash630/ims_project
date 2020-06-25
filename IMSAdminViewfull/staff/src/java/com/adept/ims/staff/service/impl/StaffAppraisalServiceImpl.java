package com.adept.ims.staff.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.staff.database.dao.AppraisalDAO;
import com.adept.ims.staff.database.pojo.Appraisal;
import com.adept.ims.staff.service.StaffAppraisalService;
import java.util.HashMap;
import java.util.Map;

public class StaffAppraisalServiceImpl implements StaffAppraisalService {

    private static Log log = LogFactory.getLog(StaffAppraisalServiceImpl.class);
    private AppraisalDAO dao;

    public void setAppraisalDAO(AppraisalDAO dao) {
        this.dao = dao;
    }

    public List<Appraisal> getAll() {
        return dao.getAll();
    }

    public Appraisal get(long appraisalId) {
        Appraisal appraisal = dao.get(appraisalId);

        if (appraisal == null) {
            log.warn("TrustId '" + appraisalId + "' not found in database.");
        }

        return appraisal;
    }

    public Appraisal save(Appraisal appraisal) {
        dao.save(appraisal);

        return appraisal;
    }

    public void remove(long appraisalId) {
        if (dao.get(appraisalId) != null) {
            dao.remove(appraisalId);
        }
    }

    public List<Appraisal> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(Appraisal appraisal) {
        dao.update(appraisal);
    }

    public List<Appraisal> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Appraisal> getByOperator(Appraisal appraisal, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

       
        return dao.getByOperator(operator, queryMap);
        
    }
    
}
