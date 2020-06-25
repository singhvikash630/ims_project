package com.adept.ims.student.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.student.database.dao.ParentDAO;
import com.adept.ims.student.database.pojo.Parent;
import com.adept.ims.student.service.ParentService;
import java.util.HashMap;
import java.util.Map;



public class ParentServiceImpl implements ParentService {

    private static Log log = LogFactory.getLog(ParentServiceImpl.class);
    private ParentDAO dao;

    public void setParentDAO(ParentDAO dao) {
        this.dao = dao;
    }

    public List<Parent> getAll() {
        return dao.getAll();
    }

    public Parent get(long parentId) {
        Parent parent = dao.get(parentId);

        if (parent == null) {
            log.warn("ParentId '" + parentId + "' not found in database.");
        }

        return parent;
    }

    public Parent save(Parent parent) {
        dao.save(parent);

        return parent;
    }

    public void remove(long parentId) {
        if (dao.get(parentId) != null) {
            dao.remove(parentId);
        }
    }

    
    public List<Parent>getId(long id) {
        return dao.getById(id);
    }

    public void update(Parent parent) {
        dao.update(parent);
    }

    public List<Parent> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Parent> getByOperator(Parent parent, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

      /*  if (!"".equals(parent.getParentName().trim())) {
            queryMap.put("parentId", parent.getParentId());
        }
        if (!"".equals(parent.getAddress().trim())) {
            queryMap.put("address" , parent.getAddress());
        }*/


        return dao.getByOperator(operator, queryMap);

    }

    public List<Parent> getById(String basicSearchValue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Parent> getById(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
