package com.adept.ims.course.service;


import com.adept.ims.course.database.pojo.CourseYear;
import java.util.Collection;
import java.util.List;


public interface CourseYearService {
    public List<CourseYear> getAll();
    public CourseYear get(long courseYearId);
    public CourseYear save(CourseYear courseYear);
    public void update(CourseYear courseYear);
    public void remove(long courseYearId);
    public List<CourseYear> getByName(String year);
    public List<CourseYear> getByFilter(String filter,String value);
    public List<CourseYear> getByOperator(CourseYear courseYear, String operator);
}