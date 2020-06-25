package com.adept.ims.authorization.database.dao.impl;

import java.util.List;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.authorization.database.dao.ServiceDAO;
import com.adept.ims.authorization.database.pojo.Service;

/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class ServiceDAOImpl extends AuthorizationDAOImpl implements ServiceDAO {

    private static Log log = LogFactory.getLog(ServiceDAOImpl.class);

    public ServiceDAOImpl() {
        className = Service.class.getName();
    }

    public Service get(long serviceId) {
        return (Service) super.get(serviceId);
    }

    public List<Service> getAll() {
        return super.getAll();
    }


    public void save(Service service) {
        super.save(service);
    }

    public void update(Service service) {
        super.update(service);
    }

    public List<Service> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Service> getByName(String name) {
        return getByFilter("serviceName", name);
    }

    public List<Service> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
}
