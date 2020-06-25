/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.authorization.database.dao;

import java.util.List;

import com.adept.ims.authorization.database.pojo.Role;
import java.util.Map;

public interface RoleDAO extends AuthorizationDAO {

    public Role get(long roleId);

    public void save(Role role);

    public void update(Role role);

    public void remove(long roleId);

    public List<Role> getAll();

    public List<Role> getByName(String name);

    public List<Role> getByFilter(String filter, String value);

    public List<Role> getByOperator(String operator, Map<String, String> queryMap);
}
