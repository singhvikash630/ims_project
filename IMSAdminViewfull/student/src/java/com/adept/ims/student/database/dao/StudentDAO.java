package com.adept.ims.student.database.dao;

import java.util.List;

import com.adept.ims.student.database.pojo.Student;
import java.util.Map;

public interface StudentDAO extends StudentMDAO {

    public Student get(long studentId);

    public void save(Student student);

    public void update(Student student);

    public void remove(long studentId);

    public List<Student> getAll();

    public List<Student> getById(long id);

    public List<Student> getByFilter(String filter, String value);

    public List<Student> getByOperator(String operator, Map<String, String> queryMap);
}
