package com.adept.ims.authorization.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.authorization.database.dao.RoleServiceDAO;
import com.adept.ims.authorization.database.pojo.RoleService;
import com.adept.ims.authorization.service.RolesService;
import java.util.HashMap;
import java.util.Map;

public class RolesServiceImpl implements RolesService {

    private static Log log = LogFactory.getLog(RolesServiceImpl.class);
    private RoleServiceDAO dao;

    public void setRoleServiceDAO(RoleServiceDAO dao) {
        this.dao = dao;
    }

    public List<RoleService> getAll() {
        return dao.getAll();
    }

    public RoleService get(long roleServiceId) {
        RoleService roleService = dao.get(roleServiceId);

        if (roleService == null) {
            log.warn("RoleServiceId '" + roleServiceId + "' not found in database.");
        }

        return roleService;
    }

    public RoleService save(RoleService roleService) {
        dao.save(roleService);

        return roleService;
    }

    public void remove(long roleServiceId) {
        if (dao.get(roleServiceId) != null) {
            dao.remove(roleServiceId);
        }
    }    

    public void update(RoleService roleService) {
        dao.update(roleService);
    }

    public List<RoleService> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<RoleService> getByOperator(RoleService roleService, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();


        return dao.getByOperator(operator, queryMap);
}
}
