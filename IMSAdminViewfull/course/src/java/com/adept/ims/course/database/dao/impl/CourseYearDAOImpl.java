package com.adept.ims.course.database.dao.impl;

import com.adept.ims.course.database.dao.CourseYearDAO;
import com.adept.ims.course.database.dao.DisciplineDAO;
import com.adept.ims.course.database.dao.SectionDAO;
import com.adept.ims.course.database.dao.SubjectDAO;
import com.adept.ims.course.database.dao.impl.CourseMDAOImpl;
import com.adept.ims.course.database.pojo.CourseYear;
import com.adept.ims.course.database.pojo.Discipline;
import com.adept.ims.course.database.pojo.Section;
import com.adept.ims.course.database.pojo.Subject;
import java.util.List;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class CourseYearDAOImpl extends CourseMDAOImpl implements CourseYearDAO {

    private static Log log = LogFactory.getLog(CourseYearDAOImpl.class);

    public CourseYearDAOImpl() {
        className = CourseYear.class.getName();
    }

    public CourseYear get(long courseYearId) {
        return (CourseYear) super.get(courseYearId);
    }

    public List<CourseYear> getAll() {
        return super.getAll();
    }


    public void save(CourseYear courseYear) {
        super.save(courseYear);
    }

    public void update(CourseYear courseYear) {
        super.update(courseYear);
    }

    public List<CourseYear> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<CourseYear> getByName(String name) {
        return getByFilter("year", name);
    }

    public List<CourseYear> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
}
