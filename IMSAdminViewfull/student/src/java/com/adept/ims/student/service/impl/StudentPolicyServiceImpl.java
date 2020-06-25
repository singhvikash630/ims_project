package com.adept.ims.student.service.impl;

import java.util.Collection;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.student.database.dao.StudentPolicyDAO;
import com.adept.ims.student.database.pojo.StudentPolicy;
import com.adept.ims.student.service.StudentPolicyService;
import java.util.HashMap;
import java.util.Map;

public class StudentPolicyServiceImpl implements StudentPolicyService {

    private static Log log = LogFactory.getLog(StudentPolicyServiceImpl.class);
    private StudentPolicyDAO dao;


    public void setStudentPolicyDAO(StudentPolicyDAO dao) {
        this.dao = dao;
    }

    public List<StudentPolicy> getAll() {
        return dao.getAll();
    }

    public StudentPolicy get(long studentPolicyId) {
        StudentPolicy studentPolicy = dao.get(studentPolicyId);

        if (studentPolicy == null) {
            log.warn("StudentPolicyId '" + studentPolicyId + "' not found in database.");
        }

        return studentPolicy;
    }

    public StudentPolicy save(StudentPolicy studentPolicy) {
        dao.save(studentPolicy);

        return studentPolicy;
    }

    public void remove(long studentPolicyId) {
        if (dao.get(studentPolicyId) != null) {
            dao.remove(studentPolicyId);
        }
    }


    public void update(StudentPolicy studentPolicy) {
        dao.update(studentPolicy);
    }

    public List<StudentPolicy> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<StudentPolicy> getByOperator(StudentPolicy studentPolicy, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

     /*   if (!"".equals(studentpolicy.getStudentPolicyName().trim())) {
            queryMap.put("studentpolicyName", studentpolicy.getStudentPolicyName());
        }
        if (!"".equals(studentpolicy.getAddress().trim())) {
            queryMap.put("address" , studentpolicy.getAddress());
        }*/

        return dao.getByOperator(operator, queryMap);

    }

    public Collection<StudentPolicy> getById(long studentPolicyId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<StudentPolicy> getById(String basicSearchValue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

 

