package com.adept.ims.authorization.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.authorization.database.pojo.GroupMaster;

public interface GroupMasterService {
    public List<GroupMaster> getAll();
    public GroupMaster get(long groupId);
    public GroupMaster save(GroupMaster groupMaster);
    public void update(GroupMaster groupMaster);
    public void remove(long groupId);
    public List<GroupMaster> getByName(String name);
    public List<GroupMaster> getByFilter(String filter,String value);
    public List<GroupMaster> getByOperator(GroupMaster groupMaster, String operator);
}