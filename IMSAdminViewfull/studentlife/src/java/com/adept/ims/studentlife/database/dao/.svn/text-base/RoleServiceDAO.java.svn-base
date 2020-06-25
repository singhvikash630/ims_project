/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.authorization.database.dao;

import java.util.List;

import com.adept.ims.authorization.database.pojo.RoleService;
import java.util.Map;

public interface RoleServiceDAO extends AuthorizationDAO {

    public RoleService get(long roleServiceId);

    public void save(RoleService roleService);

    public void update(RoleService roleService);

    public void remove(long roleServiceId);

    public List<RoleService> getAll();

    //public List<RoleService> getByName(String name);

    public List<RoleService> getByFilter(String filter, String value);

    public List<RoleService> getByOperator(String operator, Map<String, String> queryMap);
}
