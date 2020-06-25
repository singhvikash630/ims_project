/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.service.impl;


import com.adept.ims.institute.database.dao.DepartmentDAO;
import com.adept.ims.institute.service.DepartmentService;
import com.adept.ims.institute.database.pojo.Department;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 *
 * @author Viswanath
 */
public class DepartmentServiceImpl implements DepartmentService {

    private static Log log = LogFactory.getLog(DepartmentServiceImpl.class);
    private DepartmentDAO dao;

    public void setDepartmentDAO(DepartmentDAO dao) {
        this.dao = dao;
    }

    public List<Department> getAll() {
        return dao.getAll();
    }

    public Department get(long departmentId) {
        Department department = dao.get(departmentId);
        if (department == null) {
            log.warn("DepartmentId '" + departmentId + "'not found in database.");
        }
        return department;
    }

    public void save(Department department) {
        dao.save(department);
    }

    public void remove(long departmentId) {
        if (dao.get(departmentId) != null) {
            dao.remove(departmentId);
        }
    }
 
    public void update(Department department) {
        dao.update(department);
    }

    public List<Department> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Department> getByOperator(Department department, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        if (!"".equals(department.getName().trim())) {
            queryMap.put("name", department.getName());
        }
        if (!"".equals(department.getDescription().trim())) {
            queryMap.put("description", department.getDescription());
        }
        return dao.getByOperator(operator, queryMap);
    }

    public List<Department> getByName(String name) {
        return dao.getByFilter("name", name);
    }
}
