package com.adept.ims.student.database.dao.impl;

import java.util.List;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.student.database.dao.StudentDAO;
import com.adept.ims.student.database.pojo.Student;

/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class StudentDAOImpl extends StudentMDAOImpl implements StudentDAO {

    private static Log log = LogFactory.getLog(StudentDAOImpl.class);

    public StudentDAOImpl() {
        className = Student.class.getName();
    }

    public Student get(long studentId) {
        return (Student) super.get(studentId);
    }

    @Override
    public List<Student> getAll() {
        return super.getAll();
    }


    public void save(Student student) {
        super.save(student);
    }

    public void update(Student student) {
        super.update(student);
    }

    public List<Student> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Student> getById(long id) {
        return getByFilter("studentId", id);
    }

    public List<Student> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }

    private List<Student> getByFilter(String string, long id) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
