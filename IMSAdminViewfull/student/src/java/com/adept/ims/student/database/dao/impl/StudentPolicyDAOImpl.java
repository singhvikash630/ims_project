package com.adept.ims.student.database.dao.impl;

import java.util.List;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.student.database.dao.StudentPolicyDAO;
import com.adept.ims.student.database.pojo.StudentPolicy;

/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class StudentPolicyDAOImpl extends StudentMDAOImpl implements StudentPolicyDAO {

    private static Log log = LogFactory.getLog(StudentPolicyDAOImpl.class);

    public StudentPolicyDAOImpl() {
        className = StudentPolicy.class.getName();
    }

    public StudentPolicy get(long studentPolicyId) {
        return (StudentPolicy) super.get(studentPolicyId);
    }

    public List<StudentPolicy> getAll() {
        return super.getAll();
    }


    public void save(StudentPolicy studentPolicy) {
        super.save(studentPolicy);
    }

    public void update(StudentPolicy studentPolicy) {
        super.update(studentPolicy);
    }

    @Override
    public List<StudentPolicy> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }
    
    @Override
    public List<StudentPolicy> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }

    public List<StudentPolicy> getById(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
