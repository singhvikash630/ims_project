/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.staff.service;

/**
 *
 * @author Srikanth
 */
import com.adept.ims.staff.database.pojo.Staff;
import java.util.List;

public interface StaffService {
    
    public List getAll();
    public Staff get(long staffId);
    public Staff save(Staff staff);
    public void update(Staff staff);
    public void remove(long staffId);
    public List getByName(String name);
    public List getByFilter(String filter,String value);
    public List getByOperator(Staff staff, String operator);

}
