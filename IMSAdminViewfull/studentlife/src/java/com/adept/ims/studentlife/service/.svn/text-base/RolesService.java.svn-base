package com.adept.ims.authorization.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.authorization.database.pojo.RoleService;

public interface RolesService {
    public List<RoleService> getAll();
    public RoleService get(long roleServiceId);
    public RoleService save(RoleService roleService);
    public void update(RoleService roleService);
    public void remove(long roleServiceId);
    //public String getByName(String name);
    public List<RoleService> getByFilter(String filter,String value);
    public List<RoleService> getByOperator(RoleService roleService, String operator);
}