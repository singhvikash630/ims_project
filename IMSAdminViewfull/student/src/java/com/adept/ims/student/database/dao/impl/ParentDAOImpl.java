package com.adept.ims.student.database.dao.impl;

import java.util.List;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.student.database.dao.ParentDAO;
import com.adept.ims.student.database.pojo.Parent;

/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class ParentDAOImpl extends StudentMDAOImpl implements ParentDAO {

    private static Log log = LogFactory.getLog(ParentDAOImpl.class);

    public ParentDAOImpl() {
        className = Parent.class.getName();
    }

    @Override
    public Parent get(long parentId) {
        return (Parent) super.get(parentId);
    }

    @Override
    public List<Parent> getAll() {
        return super.getAll();
    }


    public void save(Parent parent) {
        super.save(parent);
    }

    public void update(Parent parent) {
        super.update(parent);
    }

    @Override
    public List<Parent> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    
    public List<Parent> getById(long id) {
        return getByFilter("parentId", id);
    }

    @Override
    public List<Parent> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }

    private List<Parent> getByFilter(String string, long id) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    
}
