/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.database.dao.impl;

import com.adept.ims.institute.database.dao.InstituteDAO;
import com.adept.ims.institute.database.pojo.Institute;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Viswanath
 */
public class InstituteDAOImpl implements InstituteDAO {

    public InstituteDAOImpl() {
        String classname = Institute.class.getName();
    }

    public Institute get(long instituteId) {
        return super.get(instituteId);
    }

    public List<Institute> getAll() {
        return super.getAll();
    }

    public void save(Institute institute) {
        super.save(institute);
    }

    public void update(Institute institute) {
        super.update(institute);
    }

    public List<Institute> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Institute> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }

	public void remove(long trustId) {
		// TODO Auto-generated method stub
		
	}
}
