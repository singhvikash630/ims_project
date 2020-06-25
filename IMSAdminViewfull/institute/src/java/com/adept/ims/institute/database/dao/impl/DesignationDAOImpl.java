/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.database.dao.impl;

import com.adept.ims.institute.database.dao.DesignationDAO;
import com.adept.ims.institute.database.pojo.Designation;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Viswanath
 */
public class DesignationDAOImpl extends InstituteModuleDAOImpl implements DesignationDAO {

    public DesignationDAOImpl() {
        className = Designation.class.getName();
    }

    public Designation get(long designationId) {
        return (Designation) super.get(designationId);
    }

    public List<Designation> getAll() {
        return super.getAll();
    }

    public void save(Designation designation) {
        super.save(designation);
    }

    public void update(Designation designation) {
        super.update(designation);
    }

    @Override
    public List<Designation> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Designation> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
}
