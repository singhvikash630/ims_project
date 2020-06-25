package com.adept.ims.authorization.database.dao;

import java.util.List;

import com.adept.ims.authorization.database.pojo.Service;
import java.util.Map;

public interface ServiceDAO extends AuthorizationDAO {

    public Service get(long serviceId);

    public void save(Service service);

    public void update(Service service);

    public void remove(long serviceId);

    public List<Service> getAll();

    public List<Service> getByName(String name);

    public List<Service> getByFilter(String filter, String value);

    public List<Service> getByOperator(String operator, Map<String, String> queryMap);
}
