package com.adept.ims.course.database.dao;

import com.adept.ims.course.database.pojo.CourseYear;

import java.util.List;


import java.util.Map;

public interface CourseYearDAO extends CourseMDAO {

    public CourseYear get(long courseYearId);

    public void save(CourseYear courseYear);

    public void update(CourseYear courseYear);

    public void remove(long courseYearId);

    public List<CourseYear> getAll();

    public List<CourseYear> getByName(String year);

    public List<CourseYear> getByFilter(String filter, String value);

    public List<CourseYear> getByOperator(String operator, Map<String, String> queryMap);
}
