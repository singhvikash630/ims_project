package com.adept.ims.hostel.service.impl;

import java.util.List;


import com.adept.ims.hostel.database.dao.HostelRoomTypeDAO;
import com.adept.ims.hostel.database.pojo.HostelRoomType;
import com.adept.ims.hostel.service.HostelRoomTypeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class HostelRoomTypeServiceImpl implements HostelRoomTypeService {

    private static Log log = LogFactory.getLog(HostelRoomTypeServiceImpl.class);
    private HostelRoomTypeDAO dao;

    public void setHostelRoomTypeDAO(HostelRoomTypeDAO dao) {
        this.dao = dao;
    }

    public List<HostelRoomType> getAll() {
        return dao.getAll();
    }

    public HostelRoomType get(long hostelroomtypeId) {
        HostelRoomType hostelroomtype = dao.get(hostelroomtypeId);

        if (hostelroomtype == null) {
            log.warn("HostelRoomTypeId '" + hostelroomtypeId + "' not found in database.");
        }

        return hostelroomtype;
    }

    public HostelRoomType save(HostelRoomType hostelroomtype) {
        dao.save(hostelroomtype);

        return hostelroomtype;
    }

    public void remove(long hostelroomtypeId) {
        if (dao.get(hostelroomtypeId) != null) {
            dao.remove(hostelroomtypeId);
        }
    }

    public List<HostelRoomType> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(HostelRoomType hostelroomtype) {
        dao.update(hostelroomtype);
    }

    public List<HostelRoomType> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<HostelRoomType> getByOperator(HostelRoomType hostelroomtype, String operator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

}
