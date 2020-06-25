/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.staff.database.dao;

import java.util.List;
import java.util.Map;
import com.adept.ims.staff.database.pojo.Leaves;
        

public interface LeaveDAO extends StaffManagementDAO
{
    public Leaves get(long leaveId);

    public void save(Leaves leave);

    public void update(Leaves leave);

    public void remove(long leaveId);

    public List<Leaves> getAll();

    public List<Leaves> getByName(String name);

    public List<Leaves> getByFilter(String filter, String value);

    public List<Leaves> getByOperator(String operator, Map<String, String> queryMap);
    

}
