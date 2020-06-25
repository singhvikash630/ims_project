package com.adept.ims.staff.database.dao.impl;

import java.util.List;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.staff.database.dao.PayslipDAO;
import com.adept.ims.staff.database.pojo.Payslip;

/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class PayslipDAOImpl extends StaffManagementDAOImpl implements PayslipDAO {

    private static Log log = LogFactory.getLog(PayslipDAOImpl.class);

    public PayslipDAOImpl() {
        className = Payslip.class.getName();
    }

    @Override
    public Payslip get(long payslipId) {
        return (Payslip) super.get(payslipId);
    }

    @Override
    public List<Payslip> getAll() {
        return super.getAll();
    }


    public void save(Payslip payslip) {
        super.save(payslip);
    }

    public void update(Payslip payslip) {
        super.update(payslip);
    }

    @Override
    public List<Payslip> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Payslip> getByName(String name) {
        return getByFilter("trustName", name);
    }

    @Override
    public List<Payslip> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
    
    @Override
     public void remove(long payslipId){
     
         super.remove(payslipId);
     }

   
    @Override
    public boolean isNew() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
     
}

