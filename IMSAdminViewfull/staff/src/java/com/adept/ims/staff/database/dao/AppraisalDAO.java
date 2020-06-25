/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.staff.database.dao;

import java.util.List;
import java.util.Map;
import com.adept.ims.staff.database.pojo.Appraisal;


public interface  AppraisalDAO extends StaffManagementDAO 
{
    public Appraisal get(long appraisalId);

    public void save(Appraisal appraisal);

    public void update(Appraisal appraisal);

    public void remove(long appraisalId);

    public List<Appraisal> getAll();

    public List<Appraisal> getByName(String name);
    
    public List<Appraisal> getByFilter(String filter, String value);

    public List<Appraisal> getByOperator(String operator, Map<String, String> queryMap);

}



