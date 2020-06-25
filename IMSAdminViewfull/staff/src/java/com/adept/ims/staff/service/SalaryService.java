/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.staff.service;

/**
 *
 * @author Srikanth
 */
import java.util.List;
import com.adept.ims.staff.database.pojo.Salary;

public interface  SalaryService {
    
    public List<Salary> getAll();
    public Salary get(long SalaryId);
    public Salary save(Salary Salary);
    public void update(Salary Salary);
    public void remove(long trustId);
    public List<Salary> getByName(String name);
    public List<Salary> getByFilter(String filter,String value);
    public List<Salary> getByOperator(Salary Salary, String operator);
}


