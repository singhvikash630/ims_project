package com.adept.ims.course.database.dao.impl;

import com.adept.ims.course.database.dao.SectionDAO;
import com.adept.ims.course.database.dao.SubjectDAO;
import com.adept.ims.course.database.dao.impl.CourseMDAOImpl;
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
public class SectionDAOImpl extends CourseMDAOImpl implements SectionDAO {

    private static Log log = LogFactory.getLog(SectionDAOImpl.class);

    public SectionDAOImpl() {
        className = Section.class.getName();
    }

    public Section get(long sectionId) {
        return (Section) super.get(sectionId);
    }

    public List<Section> getAll() {
        return super.getAll();
    }


    public void save(Section section) {
        super.save(section);
    }

    public void update(Section section) {
        super.update(section);
    }

    public List<Section> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Section> getByName(String name) {
        return getByFilter("sectionName", name);
    }

    public List<Section> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
}
