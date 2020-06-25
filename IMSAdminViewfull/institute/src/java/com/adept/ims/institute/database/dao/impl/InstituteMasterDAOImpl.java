/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.database.dao.impl;

import com.adept.ims.institute.database.dao.InstituteMasterDAO;
import com.adept.ims.institute.database.pojo.InstituteMaster;

import java.util.List;
import java.util.Map;


/**
 *
 * @author Viswanath
 */
public class InstituteMasterDAOImpl extends InstituteModuleDAOImpl implements InstituteMasterDAO {

    public InstituteMasterDAOImpl() {
        className = InstituteMaster.class.getName();
    }

    public InstituteMaster get(long instituteMasterId) {
        return (InstituteMaster) super.get(instituteMasterId);
    }

    public List<InstituteMaster> getAll() {
        return super.getAll();
    }

    public void save(InstituteMaster institute) {
        super.save(institute);
    }

    public void update(InstituteMaster institute) {
        super.update(institute);
    }

    @Override
    public List<InstituteMaster> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<InstituteMaster> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
}
