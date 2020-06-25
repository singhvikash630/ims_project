package com.adept.ims.authorization.service;

import java.util.List;
import com.adept.ims.authorization.database.pojo.Service;

public interface ServiceService {
    public List<Service> getAll();
    public Service get(long serviceId);
    public Service save(Service service);
    public void update(Service service);
    public void remove(long serviceId);
    public List<Service> getByName(String name);
    public List<Service> getByFilter(String filter,String value);
    public List<Service> getByOperator(Service service, String operator);
}