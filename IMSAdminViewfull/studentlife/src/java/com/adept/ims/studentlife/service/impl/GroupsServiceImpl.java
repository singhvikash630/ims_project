package com.adept.ims.authorization.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.authorization.database.dao.GroupServiceDAO;
import com.adept.ims.authorization.database.pojo.GroupService;
import com.adept.ims.authorization.service.GroupsService;
import java.util.HashMap;
import java.util.Map;

public class GroupsServiceImpl implements GroupsService {

    private static Log log = LogFactory.getLog(GroupsServiceImpl.class);
    private GroupServiceDAO dao;

    public void setGroupServiceDAO(GroupServiceDAO dao) {
        this.dao = dao;
    }

    public List<GroupService> getAll() {
        return dao.getAll();
    }

    public GroupService get(long groupId) {
        GroupService groupService = dao.get(groupId);

        if (groupService == null) {
            log.warn("GroupId '" + groupId + "' not found in database.");
        }

        return groupService;
    }

    public GroupService save(GroupService groupService) {
        dao.save(groupService);

        return groupService;
    }

    public void remove(long groupId) {
        if (dao.get(groupId) != null) {
            dao.remove(groupId);
        }
    }

    public List<GroupService> getByName(String id) {
        return dao.getByName(id);
    }

    public void update(GroupService groupService) {
        dao.update(groupService);
    }

    public List<GroupService> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<GroupService> getByOperator(GroupService groupService, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        if (!"".equals(groupService.getId())) {
            queryMap.put("serviceId", Long.toString(groupService.getId()));
        }
        
        return dao.getByOperator(operator, queryMap);

    }

}
