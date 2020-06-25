package com.adept.ims.student.database.dao;

import java.util.List;

import com.adept.ims.student.database.pojo.StudentPolicy;
import java.util.Map;

public interface StudentPolicyDAO extends StudentMDAO {

    public StudentPolicy get(long studentpolicyId);

    public List<StudentPolicy> getById(long id);
    
       public void save(StudentPolicy studentpolicy);

    public void update(StudentPolicy studentpolicy);

    public void remove(long studentId);

    public List<StudentPolicy> getAll();

    public List<StudentPolicy> getByFilter(String filter, String value);

    public List<StudentPolicy> getByOperator(String operator, Map<String, String> queryMap);
}
