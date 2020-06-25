/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.staff.database.dao.impl;

import java.util.List;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.staff.database.dao.LeaveDAO;
import com.adept.ims.staff.database.pojo.Leaves;

/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class StaffLeaveDAOImpl extends StaffManagementDAOImpl implements LeaveDAO {

    private static Log log = LogFactory.getLog(StaffLeaveDAOImpl.class);

    public StaffLeaveDAOImpl() {
        className = Leaves.class.getName();
    }

    @Override
    public Leaves get(long leaveId) {
        return (Leaves) super.get(leaveId);
    }

    @Override
    public List<Leaves> getAll() {
        return super.getAll();
    }


    public void save(Leaves leaves) {
        super.save(leaves);
    }

    public void update(Leaves leaves) {
        super.update(leaves);
    }

    @Override
    public List<Leaves> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Leaves> getByName(String name) {
        return getByFilter("LeaveName", name);
    }

    @Override
    public List<Leaves> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
    
    @Override
     public void remove(long LeaveId){
     
         super.remove(LeaveId);
     }

   
    @Override
    public boolean isNew() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
     
}

