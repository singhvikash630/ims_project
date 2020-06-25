package com.adept.ims.authorization.database.dao;

import java.util.List;

import com.adept.ims.authorization.database.pojo.GroupService;
import java.util.Map;

public interface GroupServiceDAO extends AuthorizationDAO {

    public GroupService get(long groupServiceId);

    public void save(GroupService groupService);

    public void update(GroupService groupService);

    public void remove(long groupServiceId);

    public List<GroupService> getAll();

    public List<GroupService> getByName(String id);

    public List<GroupService> getByFilter(String filter, String value);

    public List<GroupService> getByOperator(String operator, Map<String, String> queryMap);
}
