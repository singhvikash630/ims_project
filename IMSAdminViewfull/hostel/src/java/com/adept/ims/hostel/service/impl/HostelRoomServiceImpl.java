package com.adept.ims.hostel.service.impl;

import java.util.List;


import com.adept.ims.hostel.database.dao.HostelRoomDAO;
import com.adept.ims.hostel.database.pojo.HostelRoom;
import com.adept.ims.hostel.service.HostelRoomService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HostelRoomServiceImpl implements HostelRoomService {

    private static Log log = LogFactory.getLog(HostelRoomServiceImpl.class);
    private HostelRoomDAO dao;

    public void setHostelRoomDAO(HostelRoomDAO dao) {
        this.dao = dao;
    }

    public List<HostelRoom> getAll() {
        return dao.getAll();
    }

    public HostelRoom get(long hostelroomId) {
        HostelRoom hostelroom = dao.get(hostelroomId);

        if (hostelroom == null) {
            log.warn("HostelRoomId '" + hostelroomId + "' not found in database.");
        }

        return hostelroom;
    }

    public HostelRoom save(HostelRoom hostelroom) {
        dao.save(hostelroom);

        return hostelroom;
    }

    public void remove(long hostelroomId) {
        if (dao.get(hostelroomId) != null) {
            dao.remove(hostelroomId);
        }
    }

    public List<HostelRoom> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(HostelRoom hostelroom) {
        dao.update(hostelroom);
    }

    public List<HostelRoom> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<HostelRoom> getByOperator(HostelRoom hostelroom, String operator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   

}
