/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.database.dao;

import com.adept.ims.institute.database.pojo.Designation;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Viswanath
 */
public interface DesignationDAO extends InstituteModuleDAO {

    public Designation get(long designationId);

    public void save(Designation designation);

    public void update(Designation designation);

    public void remove(long designationId);

    public List<Designation> getAll();

    public List<Designation> getByFilter(String filter, String value);

    public List<Designation> getByOperator(String operator, Map<String, String> queryMap);
}

