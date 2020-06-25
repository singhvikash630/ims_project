package com.adept.ims.curriculum.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.curriculum.database.pojo.FeePayment;
import com.adept.ims.student.database.pojo.Student;

public interface FeePaymentService {
    public List<FeePayment> getAll();
    public FeePayment get(long feePaymentId);
    public Collection <FeePayment> get(Student student);

    public Collection<FeePayment> getByName(Student student);
    public FeePayment save(FeePayment feePayment);
    public void update(FeePayment feePayment);
    public void remove(long feePaymentId);
    public List<FeePayment> getByName(String name);
    public List<FeePayment> getByFilter(String filter,String value);
    public List<FeePayment> getByOperator(FeePayment feePayment, String operator);
}