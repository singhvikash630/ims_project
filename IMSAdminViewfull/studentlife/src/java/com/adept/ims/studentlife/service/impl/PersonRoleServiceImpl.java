package com.adept.ims.authorization.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.authorization.database.dao.PersonRoleDAO;
import com.adept.ims.authorization.database.pojo.PersonRole;
import com.adept.ims.authorization.service.PersonRoleService;
import java.util.HashMap;
import java.util.Map;

public class PersonRoleServiceImpl implements PersonRoleService {

    private static Log log = LogFactory.getLog(PersonRoleServiceImpl.class);
    private PersonRoleDAO dao;

    public void setPersonRoleDAO(PersonRoleDAO dao) {
        this.dao = dao;
    }

    public List<PersonRole> getAll() {
        return dao.getAll();
    }

    public PersonRole get(long personId) {
        PersonRole personRole = dao.get(personId);

        if (personRole == null) {
            log.warn("PersonId '" + personId + "' not found in database.");
        }

        return personRole;
    }

    public PersonRole save(PersonRole personRole) {
        dao.save(personRole);

        return personRole;
    }

    public void remove(long personId) {
        if (dao.get(personId) != null) {
            dao.remove(personId);
        }
    }

    public void update(PersonRole personRole) {
        dao.update(personRole);
    }

    public List<PersonRole> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<PersonRole> getByOperator(PersonRole personRole, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();


        return dao.getByOperator(operator, queryMap);
}
}
