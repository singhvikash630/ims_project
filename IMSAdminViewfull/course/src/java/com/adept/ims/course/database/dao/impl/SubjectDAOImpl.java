package com.adept.ims.course.database.dao.impl;

import com.adept.ims.course.database.dao.SubjectDAO;
import com.adept.ims.course.database.dao.impl.CourseMDAOImpl;
import com.adept.ims.course.database.pojo.Subject;
import java.util.List;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class SubjectDAOImpl extends CourseMDAOImpl implements SubjectDAO {

    private static Log log = LogFactory.getLog(SubjectDAOImpl.class);

    public SubjectDAOImpl() {
        className = Subject.class.getName();
    }

    public Subject get(long subjectId) {
        return (Subject) super.get(subjectId);
    }

    public List<Subject> getAll() {
        return super.getAll();
    }


    public void save(Subject subject) {
        super.save(subject);
    }

    public void update(Subject subject) {
        super.update(subject);
    }

    public List<Subject> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Subject> getByName(String name) {
        return getByFilter("subjectName", name);
    }

    public List<Subject> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
}
