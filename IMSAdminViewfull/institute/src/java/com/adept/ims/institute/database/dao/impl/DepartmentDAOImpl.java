/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.database.dao.impl;

import com.adept.ims.institute.database.dao.DepartmentDAO;
import com.adept.ims.institute.database.pojo.Department;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Viswanath
 */
public class DepartmentDAOImpl extends InstituteModuleDAOImpl implements DepartmentDAO {

    public DepartmentDAOImpl() {
        className = Department.class.getName();
    }

    public Department get(long departmentId) {
        return (Department) super.get(departmentId);
    }

    public List<Department> getAll() {
        return super.getAll();
    }

    public void save(Department department) {
        super.save(department);
    }

    public void update(Department department) {
        super.update(department);
    }

    @Override
    public List<Department> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Department> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
}
