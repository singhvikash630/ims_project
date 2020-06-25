
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.service;

import com.adept.ims.institute.database.pojo.Department;

import java.util.List;

/**
 *
 * @author Viswanath
 */
public interface DepartmentService {

    public Department get(long departmentId);

    public void save(Department department);

    public void update(Department department);

    public void remove(long departmentId);

    public List<Department> getAll();

    public List<Department> getByName(String name);

    public List<Department> getByFilter(String filter, String value);

    public List<Department> getByOperator(Department department, String operator);
}
