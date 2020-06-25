package com.adept.ims.authorization.database.dao.impl;

import java.util.List;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.authorization.database.dao.RoleDAO;
import com.adept.ims.authorization.database.pojo.Role;

/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class RoleDAOImpl extends AuthorizationDAOImpl implements RoleDAO {

    private static Log log = LogFactory.getLog(RoleDAOImpl.class);

    public RoleDAOImpl() {
        className = Role.class.getName();
    }

    public Role get(long roleId) {
        return (Role) super.get(roleId);
    }

    public List<Role> getAll() {
        return super.getAll();
    }


    public void save(Role role) {
        super.save(role);
    }

    public void update(Role role) {
        super.update(role);
    }

    public List<Role> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Role> getByName(String name) {
        return getByFilter("roleName", name);
    }

    public List<Role> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
}
