package com.adept.ims.staff.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.staff.database.pojo.Payslip;

public interface PayslipService 
{
    public List<Payslip> getAll();
    public Payslip get(long payslipId);
    public Payslip save(Payslip payslip);
    public void update(Payslip payslip);
    public void remove(long payslipId);
    public List<Payslip> getByName(String name);
    public List<Payslip> getByFilter(String filter,String value);
    public List<Payslip> getByOperator(Payslip payslip, String operator);
}