package com.adept.ims.curriculum.service;

import com.adept.ims.student.database.pojo.Student;
import java.util.Collection;
import java.util.List;

import com.adept.ims.curriculum.database.pojo.FeeExemption;

public interface FeeExemptionService {
    public List<FeeExemption> getAll();
    public FeeExemption get(long feeExemptionId);

    public Collection<FeeExemption> getByName(Student student);
    public FeeExemption save(FeeExemption feeExemption);
    public void update(FeeExemption feeExemption);
    public void remove(long feeExemptionId);
    public List<FeeExemption> getByName(String name);
    public List<FeeExemption> getByFilter(String filter,String value);
    public List<FeeExemption> getByOperator(FeeExemption feeExemption, String operator);
}