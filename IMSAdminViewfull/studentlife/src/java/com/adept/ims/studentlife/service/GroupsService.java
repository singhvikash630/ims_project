package com.adept.ims.authorization.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.authorization.database.pojo.GroupService;

public interface GroupsService {
    public List<GroupService> getAll();
    public GroupService get(long groupServiceId);
    public GroupService save(GroupService groupService);
    public void update(GroupService groupService);
    public void remove(long groupServiceId);
    public List<GroupService> getByName(String Id);
    public List<GroupService> getByFilter(String filter,String value);
    public List<GroupService> getByOperator(GroupService groupService, String operator);
}