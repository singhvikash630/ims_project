/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.database.dao;

import com.adept.ims.institute.database.pojo.Department;

import java.util.List;
import java.util.Map;

public interface DepartmentDAO extends InstituteModuleDAO {

    public Department get(long departmentId);

    public void save(Department department);

    public void update(Department department);

    public void remove(long departmentId);

    public List<Department> getAll();

    public List<Department> getByFilter(String filter, String value);

    public List<Department> getByOperator(String operator, Map<String, String> queryMap);
}

