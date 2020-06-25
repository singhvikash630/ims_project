/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.staff.service;

/**
 *
 * @author Srikanth
 */
import java.util.Collection;
import java.util.List;

import com.adept.ims.staff.database.pojo.ExStaff;

public interface ExStaffService {
    
    public List<ExStaff> getAll();
    public ExStaff get(long exStaffId);
    public ExStaff save(ExStaff exStaff);
    public void update(ExStaff exStaff);
    public void remove(long trustId);
    public List<ExStaff> getByName(String name);
    public List<ExStaff> getByFilter(String filter,String value);
    public List<ExStaff> getByOperator(ExStaff exStaff, String operator);
}

