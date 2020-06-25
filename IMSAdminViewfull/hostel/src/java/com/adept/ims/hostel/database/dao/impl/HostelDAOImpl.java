 package com.adept.ims.hostel.database.dao.impl;

import com.adept.ims.hostel.database.dao.HostelDAO;
import com.adept.ims.hostel.database.pojo.Hostel;
import java.util.List;
import java.util.Map;

public class HostelDAOImpl extends HostelModuleDAOImpl implements HostelDAO {

    @Override
    public Hostel get(long hostelId) {
        return (Hostel) super.get(hostelId);
    }

    @Override
    public List<Hostel> getAll() {
        return super.getAll();
    }

    @Override
    public List<Hostel> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    
   /* public List<Hostel> getById(long hostelId) {
        return super.getById(hostelId);
    }*/

    @Override
    public void remove(long hostelId) {
        super.remove(hostelId);
    }

    public void save(Hostel hostel) {
        super.save(hostel);
    }

    public void update(Hostel hostel) {
        super.update(hostel);
    }

    @Override
    public List getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }

    public List<Hostel> getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}