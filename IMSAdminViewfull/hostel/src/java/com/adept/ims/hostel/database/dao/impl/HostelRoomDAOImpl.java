
package com.adept.ims.hostel.database.dao.impl;

import com.adept.ims.hostel.database.dao.HostelRoomDAO;
import com.adept.ims.hostel.database.pojo.HostelRoom;
import java.util.List;

public class HostelRoomDAOImpl extends HostelModuleDAOImpl implements HostelRoomDAO {

    @Override
    public HostelRoom get(long hostelroomId) {
        return (HostelRoom) super.get(hostelroomId);
    }

    public List<HostelRoom> getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void save(HostelRoom hostelroom) {
        super.save(hostelroom);
    }

    public void update(HostelRoom hostelroom) {
        super.update(hostelroom);
    }

}
