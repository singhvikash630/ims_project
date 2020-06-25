/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.staff.database.dao;

import java.util.List;
import java.util.Map;
import com.adept.ims.staff.database.pojo.Payslip;


public interface PayslipDAO extends StaffManagementDAO 
{
    public Payslip get(long payslipId);

    public void save(Payslip payslip);

    public void update(Payslip payslip);

    public void remove(long payslipId);

    public List<Payslip> getAll();

    public List<Payslip> getByName(String name);

    public List<Payslip> getByFilter(String filter, String value);

    public List<Payslip> getByOperator(String operator, Map<String, String> queryMap);

}
