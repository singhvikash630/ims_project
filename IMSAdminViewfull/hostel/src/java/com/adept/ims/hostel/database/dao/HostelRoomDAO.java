
package com.adept.ims.hostel.database.dao;

import java.util.List;

import com.adept.ims.hostel.database.pojo.HostelRoom;

public interface HostelRoomDAO extends HostelModuleDAO  {

    public HostelRoom get(long hostelroomId);

    public List<HostelRoom> getAll();

    public List<HostelRoom> getByFilter(String filter, String value);

    public List<HostelRoom> getByName(String name);

    public void remove(long hostelroomId);

    public void save(HostelRoom hostelroom);

    public void update(HostelRoom hostelroom);

}
