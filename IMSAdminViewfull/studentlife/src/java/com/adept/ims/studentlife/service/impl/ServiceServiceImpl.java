package com.adept.ims.authorization.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.authorization.database.dao.ServiceDAO;
import com.adept.ims.authorization.database.pojo.Service;
import com.adept.ims.authorization.service.ServiceService;
import java.util.HashMap;
import java.util.Map;

public class ServiceServiceImpl implements ServiceService {

    private static Log log = LogFactory.getLog(ServiceServiceImpl.class);
    private ServiceDAO dao;

    public void setServiceDAO(ServiceDAO dao) {
        this.dao = dao;
    }

    public List<Service> getAll() {
        return dao.getAll();
    }

    public Service get(long serviceId) {
        Service service = dao.get(serviceId);

        if (service == null) {
            log.warn("ServiceId '" + serviceId + "' not found in database.");
        }

        return service;
    }

    public Service save(Service service) {
        dao.save(service);

        return service;
    }

    public void remove(long serviceId) {
        if (dao.get(serviceId) != null) {
            dao.remove(serviceId);
        }
    }

    public List<Service> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(Service service) {
        dao.update(service);
    }

    public List<Service> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Service> getByOperator(Service service, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        if (!"".equals(service.getServiceName().trim())) {
            queryMap.put("serviceName", service.getServiceName());
        }
        if (!"".equals(service.getDescription().trim())) {
            queryMap.put("description" , service.getDescription());
        }               
        return dao.getByOperator(operator, queryMap);
        
    }

}
