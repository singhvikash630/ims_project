package com.adept.ims.authorization.service;

import java.util.List;

import com.adept.ims.authorization.database.pojo.PersonRole;

public interface PersonRoleService {
    public List<PersonRole> getAll();
    public PersonRole get(long personId);
    public PersonRole save(PersonRole personRole);
    public void update(PersonRole personRole);
    public void remove(long personId);
    //public String getByName(String name);
    public List<PersonRole> getByFilter(String filter,String value);
    public List<PersonRole> getByOperator(PersonRole personRole, String operator);
}