package com.adept.ims.authorization.database.dao.impl;

import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.adept.ims.authorization.database.dao.GroupMasterDAO;
import com.adept.ims.authorization.database.pojo.GroupMaster;

/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class GroupMasterDAOImpl extends AuthorizationDAOImpl implements GroupMasterDAO {

    private static Log log = LogFactory.getLog(GroupMasterDAOImpl.class);

    public GroupMasterDAOImpl() {
        className = GroupMaster.class.getName();
    }

   
    public GroupMaster get(long groupId) {
        return (GroupMaster) super.get(groupId);        
    }

    public List<GroupMaster> getAll() {
        return super.getAll();
    }


    public void save(GroupMaster groupMaster) {
        super.save(groupMaster);
    }

    public void update(GroupMaster groupMaster) {
        super.update(groupMaster);
    }

    public List<GroupMaster> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<GroupMaster> getByName(String name) {
        return getByFilter("groupName", name);
    }

    public List<GroupMaster> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
}
