package com.adept.ims.student.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.student.database.pojo.StudentPolicy;

public interface StudentPolicyService {
    public List<StudentPolicy> getAll();
    public StudentPolicy get(long studentpolicyId);

    public Collection<StudentPolicy> getById(long studentPolicyId);

    public List<StudentPolicy> getById(String basicSearchValue);
    public StudentPolicy save(StudentPolicy studentpolicy);
    public void update(StudentPolicy studentpolicy);
    public void remove(long studentpolicyId);
    
    public List<StudentPolicy> getByFilter(String filter,String value);
    public List<StudentPolicy> getByOperator(StudentPolicy studentpolicy, String operator);
}