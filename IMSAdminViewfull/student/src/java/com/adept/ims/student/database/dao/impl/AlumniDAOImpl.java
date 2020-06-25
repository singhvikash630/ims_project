package com.adept.ims.student.database.dao.impl;

import java.util.List;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.student.database.dao.AlumniDAO;
import com.adept.ims.student.database.pojo.Alumni;

/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class AlumniDAOImpl extends StudentMDAOImpl implements AlumniDAO {

    private static Log log = LogFactory.getLog(AlumniDAOImpl.class);

    public AlumniDAOImpl() {
        className = Alumni.class.getName();
    }

    @Override
    public Alumni get(long alumniId) {
        return (Alumni) super.get(alumniId);
    }

    public List<Alumni> getAll() {
        return super.getAll();
    }


    public void save(Alumni Alumni) {
        super.save(Alumni);
    }

    public void update(Alumni Alumni) {
        super.update(Alumni);
    }

    public List<Alumni> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Alumni> getById(long id) {
        return getByFilter("alumniId", id);
    }

    public List<Alumni> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }

    private List<Alumni> getByFilter(String string, long id) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public List<Alumni> getById(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
