package com.adept.ims.authorization.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.authorization.database.dao.RoleDAO;
import com.adept.ims.authorization.database.pojo.Role;
import com.adept.ims.authorization.service.RoleService;
import java.util.HashMap;
import java.util.Map;

public class RoleServiceImpl implements RoleService {

    private static Log log = LogFactory.getLog(RoleServiceImpl.class);
    private RoleDAO dao;

    public void setRoleDAO(RoleDAO dao) {
        this.dao = dao;
    }

    public List<Role> getAll() {
        return dao.getAll();
    }

    public Role get(long roleId) {
        Role role = dao.get(roleId);

        if (role == null) {
            log.warn("RoleId '" + roleId + "' not found in database.");
        }

        return role;
    }

    public Role save(Role role) {
        dao.save(role);

        return role;
    }

    public void remove(long roleId) {
        if (dao.get(roleId) != null) {
            dao.remove(roleId);
        }
    }

    public List<Role> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(Role role) {
        dao.update(role);
    }

    public List<Role> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Role> getByOperator(Role role, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        if (!"".equals(role.getRoleName().trim())) {
            queryMap.put("roleName", role.getRoleName());
        }
        if (!"".equals(role.getDescription().trim())) {
            queryMap.put("description" , role.getDescription());
        }
        return dao.getByOperator(operator, queryMap);

    }

}
