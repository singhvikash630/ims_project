
package com.adept.ims.hostel.database.dao.impl;

import com.adept.ims.hostel.database.dao.HostelRoomTypeDAO;
import com.adept.ims.hostel.database.pojo.HostelRoomType;
import java.util.List;

public class HostelRoomTypeDAOImpl extends HostelModuleDAOImpl implements HostelRoomTypeDAO {

    @Override
    public HostelRoomType get(long hostelroomtypeId) {
        return (HostelRoomType) super.get(hostelroomtypeId);
    }

    public List<HostelRoomType> getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void save(HostelRoomType hostelroomtype) {
        super.save(hostelroomtype);
    }

    public void update(HostelRoomType hostelroomtype) {
        super.update(hostelroomtype);
    }

}
