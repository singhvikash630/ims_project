package com.adept.ims.student.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.student.database.dao.StudentDAO;
import com.adept.ims.student.database.pojo.Student;
import com.adept.ims.student.service.StudentService;
import java.util.HashMap;
import java.util.Map;

public class StudentServiceImpl implements StudentService {

    private static Log log = LogFactory.getLog(StudentServiceImpl.class);
    private StudentDAO dao;

    public void setStudentDAO(StudentDAO dao) {
        this.dao = dao;
    }

    public List<Student> getAll() {
        return dao.getAll();
    }

    public Student get(long studentId) {
        Student student = dao.get(studentId);

        if (student == null) {
            log.warn("StudentId '" + studentId + "' not found in database.");
        }

        return student;
    }

    public Student save(Student student) {
        dao.save(student);

        return student;
    }

    public void remove(long studentId) {
        if (dao.get(studentId) != null) {
            dao.remove(studentId);
        }
    }

    public List<Student> getById(long id) {
        return dao.getById(id);
    }

    public void update(Student student) {
        dao.update(student);
    }

    public List<Student> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Student> getByOperator(Student student, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

       if (!"".equals(student.getPerson().getAbstractPerson().getFname().trim())) {
            queryMap.put("fname", student.getPerson().getAbstractPerson().getFname());
        }
        
        
        return dao.getByOperator(operator, queryMap);
        
    }

    public List<Student> getById(String basicSearchValue) {
        return null;
    }

    
}
