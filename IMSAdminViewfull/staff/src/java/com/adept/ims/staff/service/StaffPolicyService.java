/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.staff.service;

/**
 *
 * @author Srikanth
 */
import com.adept.ims.staff.database.pojo.StaffPolicy;
import java.util.List;
    
    public interface StaffPolicyService {
        
    public List<StaffPolicy> getAll();
    public StaffPolicy get(long staffId);
    public StaffPolicy save(StaffPolicy staffPolicy);
    public void update(StaffPolicy staffPolicy);
    public void remove(long staffPolicyId);
    public List<StaffPolicy> getByName(String name);
    public List<StaffPolicy> getByFilter(String filter,String value);
    public List<StaffPolicy> getByOperator(StaffPolicy staffPolicy, String operator);
}

