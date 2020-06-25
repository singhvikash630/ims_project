/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.course.service.impl;

import com.adept.ims.course.database.dao.CourseYearDAO;
import com.adept.ims.course.database.dao.DisciplineDAO;
import com.adept.ims.course.database.dao.SectionDAO;

import com.adept.ims.course.database.pojo.CourseYear;
import com.adept.ims.course.database.pojo.Discipline;
import com.adept.ims.course.database.pojo.Section;
import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.course.service.CourseYearService;
import com.adept.ims.course.service.DisciplineService;
import com.adept.ims.course.service.SectionService;
import com.adept.ims.course.service.SubjectService;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

public class CourseYearServiceImpl implements CourseYearService {

    private static Log log = LogFactory.getLog(CourseYearServiceImpl.class);
    private CourseYearDAO dao;

    public void setCourseYearDAO(CourseYearDAO dao) {
        this.dao = dao;
    }

    public List<CourseYear> getAll() {
        return dao.getAll();
    }

    public CourseYear get(long courseYearId) {
        CourseYear courseYear = dao.get(courseYearId);

        if (courseYear == null) {
            log.warn("courseYearId '" + courseYearId + "' not found in database.");
        }

        return courseYear;
    }

    public CourseYear save(CourseYear courseYear) {
        dao.save(courseYear);

        return courseYear;
    }

    public void remove(long courseYearId) {
        if (dao.get(courseYearId) != null) {
            dao.remove(courseYearId);
        }
    }

    public List<CourseYear> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(CourseYear courseYear) {
        dao.update(courseYear);
    }

    public List<CourseYear> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<CourseYear> getByOperator(CourseYear courseYear, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        if (!"".equals(courseYear.getYear().trim())) {
            queryMap.put("year", courseYear.getYear());
        }


        return dao.getByOperator(operator, queryMap);

    }

}
