package com.adept.ims.student.service;

import java.util.List;

import com.adept.ims.student.database.pojo.Student;

public interface StudentService {
    public List<Student> getAll();
    public Student get(long studentId);
    public List<Student> getById(String basicSearchValue);
    public Student save(Student student);
    public void update(Student student);
    public void remove(long studentId);
    public List<Student> getById(long Id);
    public List<Student> getByFilter(String filter,String value);
    public List<Student> getByOperator(Student student, String operator);
}