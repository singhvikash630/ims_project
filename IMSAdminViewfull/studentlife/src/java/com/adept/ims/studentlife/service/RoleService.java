package com.adept.ims.authorization.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.authorization.database.pojo.Role;

public interface RoleService {
    public List<Role> getAll();
    public Role get(long roleId);
    public Role save(Role role);
    public void update(Role role);
    public void remove(long roleId);
    public List<Role> getByName(String name);
    public List<Role> getByFilter(String filter,String value);
    public List<Role> getByOperator(Role role, String operator);
}