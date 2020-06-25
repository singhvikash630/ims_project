package com.adept.ims.hostel.service;

import java.util.List;

import com.adept.ims.hostel.database.pojo.MessFeePayment;

public interface MessFeePaymentService {
    public List<MessFeePayment> getAll();
    public MessFeePayment get(long MessFeePaymentId);
    public MessFeePayment save(MessFeePayment messfeepayment);
    public void update(MessFeePayment messfeepayment);
    public void remove(long messfeepaymentId);
    public List<MessFeePayment> getByName(String name);
    public List<MessFeePayment> getByFilter(String filter,String value);
    public List<MessFeePayment> getByOperator(MessFeePayment messfeepayment, String operator);
}