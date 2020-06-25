package com.adept.ims.staff.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.staff.database.dao.PayslipDAO;
import com.adept.ims.staff.database.pojo.Payslip;
import com.adept.ims.staff.service.PayslipService;
import java.util.HashMap;
import java.util.Map;

public class PayslipServiceImpl implements PayslipService {

    private static Log log = LogFactory.getLog(PayslipServiceImpl.class);
    private PayslipDAO dao;

    public void setPayslipDAO(PayslipDAO dao) {
        this.dao = dao;
    }

    public List<Payslip> getAll() {
        return dao.getAll();
    }

    public Payslip get(long PayslipId) {
        Payslip payslip = dao.get(PayslipId);

        if (payslip == null) {
            log.warn("PayslipId '" + PayslipId + "' not found in database.");
        }

        return payslip;
    }

    public Payslip save(Payslip payslip) {
        dao.save(payslip);

        return payslip;
    }

    public void remove(long PayslipId) {
        if (dao.get(PayslipId) != null) {
            dao.remove(PayslipId);
        }
    }

    public List<Payslip> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(Payslip payslip) {
        dao.update(payslip);
    }

    public List<Payslip> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Payslip> getByOperator(Payslip payslip, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

         
        return dao.getByOperator(operator, queryMap);
        
    }
    
}
