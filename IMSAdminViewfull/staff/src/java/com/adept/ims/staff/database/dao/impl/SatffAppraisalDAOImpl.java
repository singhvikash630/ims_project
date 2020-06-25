/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.staff.database.dao.impl;

import java.util.List;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.staff.database.dao.AppraisalDAO;
import com.adept.ims.staff.database.pojo.Appraisal;

/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class SatffAppraisalDAOImpl extends StaffManagementDAOImpl implements AppraisalDAO {

    private static Log log = LogFactory.getLog(SatffAppraisalDAOImpl.class);

    public SatffAppraisalDAOImpl() {
        className = Appraisal.class.getName();
    }

    @Override
    public Appraisal get(long appraisalId) {
        return (Appraisal) super.get(appraisalId);
    }

    @Override
    public List<Appraisal> getAll() {
        return super.getAll();
    }


    public void save(Appraisal appraisal) {
        super.save(appraisal);
    }

    public void update(Appraisal appraisal) {
        super.update(appraisal);
    }

    @Override
    public List<Appraisal> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Appraisal> getByName(String name) {
        return getByFilter("trustName", name);
    }

    @Override
    public List<Appraisal> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
    
    @Override
     public void remove(long appraisalId){
     
         super.remove(appraisalId);
     }

   
    @Override
    public boolean isNew() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
     
}


