package com.adept.ims.authorization.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.authorization.database.dao.GroupMasterDAO;
import com.adept.ims.authorization.database.pojo.GroupMaster;
import com.adept.ims.authorization.service.GroupMasterService;
import java.util.HashMap;
import java.util.Map;

public class GroupMasterServiceImpl implements GroupMasterService {

    private static Log log = LogFactory.getLog(GroupMasterServiceImpl.class);
    private GroupMasterDAO dao;

    public void setGroupMasterDAO(GroupMasterDAO dao) {
        this.dao = dao;
    }

    public List<GroupMaster> getAll() {
        return dao.getAll();
    }

    public GroupMaster get(long groupId) {
        GroupMaster groupMaster= dao.get(groupId);

        if (groupMaster == null) {
            log.warn("GroupId '" + groupId + "' not found in database.");
        }

        return groupMaster;
    }

    public GroupMaster save(GroupMaster groupMaster) {
        dao.save(groupMaster);

        return groupMaster;
    }

    public void remove(long groupId) {
        if (dao.get(groupId) != null) {
            dao.remove(groupId);
        }
    }

    public List<GroupMaster> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(GroupMaster groupMaster) {
        dao.update(groupMaster);
    }

    public List<GroupMaster> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<GroupMaster> getByOperator(GroupMaster groupMaster, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        if (!"".equals(groupMaster.getGroupName().trim())) {
            queryMap.put("groupName", groupMaster.getGroupName());
        }
        if (!"".equals(groupMaster.getDescription().trim())) {
            queryMap.put("description" , groupMaster.getDescription());
        }

        return dao.getByOperator(operator, queryMap);

    }

}
