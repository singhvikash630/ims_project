package com.adept.ims.authorization.database.dao;

import java.util.List;

import com.adept.ims.authorization.database.pojo.GroupMaster;
import java.util.Map;

public interface GroupMasterDAO extends AuthorizationDAO {

    public GroupMaster get(long groupId);

    public void save(GroupMaster groupMaster);

    public void update(GroupMaster groupMaster);

    public void remove(long groupId);
    public List<GroupMaster> getAll();

    public List<GroupMaster> getByName(String name);

    public List<GroupMaster> getByFilter(String filter, String value);

    public List<GroupMaster> getByOperator(String operator, Map<String, String> queryMap);
}
