package com.adept.ims.staff.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.staff.database.dao.LeaveDAO;
import com.adept.ims.staff.database.pojo.Leaves;
import com.adept.ims.staff.service.StaffLeaveService;
import java.util.HashMap;
import java.util.Map;

public class StaffLeaveServiceImpl implements StaffLeaveService {

    private static Log log = LogFactory.getLog(StaffLeaveServiceImpl.class);
    private LeaveDAO dao;

    public void setTrustDAO(LeaveDAO dao) {
        this.dao = dao;
    }

    public List<Leaves> getAll() {
        return dao.getAll();
    }

    public Leaves get(long leaveId) {
        Leaves leaves = dao.get(leaveId);

        if (leaves == null) {
            log.warn("TrustId '" + leaveId + "' not found in database.");
        }

        return leaves;
    }

    public Leaves save(Leaves leaves) {
        dao.save(leaves);

        return leaves;
    }

    public void remove(long leaveId) {
        if (dao.get(leaveId) != null) {
            dao.remove(leaveId);
        }
    }

    public List<Leaves> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(Leaves leaves) {
        dao.update(leaves);
    }

    public List<Leaves> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Leaves> getByOperator(Leaves leaves, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();
        
        return dao.getByOperator(operator, queryMap);
        
    }
    
}
