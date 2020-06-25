package com.adept.ims.hostel.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.hostel.database.pojo.HostelFeePayment;

public interface HostelFeePaymentService {
    public List<HostelFeePayment> getAll();
    public HostelFeePayment get(long HostelFeePaymentId);

    
    public HostelFeePayment save(HostelFeePayment hostelfeepayment);
    public void update(HostelFeePayment hostelfeepayment);
    public void remove(long hostelfeepaymentId);
    public List<HostelFeePayment> getById(long hostelFeePaymentId);
    public List<HostelFeePayment> getByFilter(String filter,String value);
    public List<HostelFeePayment> getByOperator(HostelFeePayment hostelfeepayment, String operator);
}