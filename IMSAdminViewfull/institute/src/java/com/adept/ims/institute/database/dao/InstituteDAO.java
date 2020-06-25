/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.database.dao;

import com.adept.ims.institute.database.pojo.Institute;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Viswanath
 */
public interface InstituteDAO extends InstituteModuleDAO {

    public Institute get(long instituteId);

    public void save(Institute institute);

    public void update(Institute institute);

    public void remove(long trustId);

    public List<Institute> getAll();

    public List<Institute> getByFilter(String filter, String value);

    public List<Institute> getByOperator(String operator, Map<String, String> queryMap);
}
