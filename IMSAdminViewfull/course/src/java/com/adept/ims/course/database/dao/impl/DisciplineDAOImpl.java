package com.adept.ims.course.database.dao.impl;

import com.adept.ims.course.database.dao.DisciplineDAO;
import com.adept.ims.course.database.dao.SectionDAO;
import com.adept.ims.course.database.dao.SubjectDAO;
import com.adept.ims.course.database.dao.impl.CourseMDAOImpl;
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
public class DisciplineDAOImpl extends CourseMDAOImpl implements DisciplineDAO {

    private static Log log = LogFactory.getLog(DisciplineDAOImpl.class);

    public DisciplineDAOImpl() {
        className = Discipline.class.getName();
    }

    public Discipline get(long disciplineId) {
        return (Discipline) super.get(disciplineId);
    }

    public List<Discipline> getAll() {
        return super.getAll();
    }


    public void save(Discipline discipline) {
        super.save(discipline);
    }

    public void update(Discipline discipline) {
        super.update(discipline);
    }

    public List<Discipline> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Discipline> getByName(String name) {
        return getByFilter("disciplineName", name);
    }

    public List<Discipline> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
}
