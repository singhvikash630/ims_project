/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.authorization.database.dao;

import java.util.List;

import com.adept.ims.authorization.database.pojo.PersonRole;
import java.util.Map;

public interface PersonRoleDAO extends AuthorizationDAO {

    public PersonRole get(long personId);

    public void save(PersonRole personRole);

    public void update(PersonRole personRole);

    public void remove(long personId);

    public List<PersonRole> getAll();

    //public List<RoleService> getByName(String name);

    public List<PersonRole> getByFilter(String filter, String value);

    public List<PersonRole> getByOperator(String operator, Map<String, String> queryMap);
}
