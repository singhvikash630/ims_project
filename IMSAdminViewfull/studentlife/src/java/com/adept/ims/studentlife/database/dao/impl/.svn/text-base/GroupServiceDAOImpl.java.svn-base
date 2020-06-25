package com.adept.ims.authorization.database.dao.impl;

import java.util.List;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.authorization.database.dao.GroupServiceDAO;
import com.adept.ims.authorization.database.pojo.GroupService;

/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class GroupServiceDAOImpl extends AuthorizationDAOImpl implements GroupServiceDAO {

    private static Log log = LogFactory.getLog(GroupServiceDAOImpl.class);

    public GroupServiceDAOImpl() {
        className = GroupService.class.getName();
    }

    public GroupService get(long groupServiceId) {
        return (GroupService) super.get(groupServiceId);
    }

    public List<GroupService> getAll() {
        return super.getAll();
    }


    public void save(GroupService groupService) {
        super.save(groupService);
    }

    public void update(GroupService groupService) {
        super.update(groupService);
    }

    public List<GroupService> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<GroupService> getByName(String id) {
        return getByFilter("serviceId", id);
    }

    public List<GroupService> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
}
