package com.adept.ims.course.database.dao;

import com.adept.ims.course.database.pojo.Subject;
import java.util.List;


import java.util.Map;

public interface SubjectDAO extends CourseMDAO {

    public Subject get(long subjectId);

    public void save(Subject subject);

    public void update(Subject subject);

    public void remove(long subjectId);

    public List<Subject> getAll();

    public List<Subject> getByName(String subjectName);

    public List<Subject> getByFilter(String filter, String value);

    public List<Subject> getByOperator(String operator, Map<String, String> queryMap);
}
