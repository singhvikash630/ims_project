
package com.adept.ims.hostel.database.dao;

import com.adept.ims.hostel.database.pojo.HostelRoomType;
import java.util.List;

public interface HostelRoomTypeDAO extends HostelModuleDAO  {

    public HostelRoomType get(long hostelroomtypeId);

    public List<HostelRoomType> getAll();

    public List<HostelRoomType> getByFilter(String filter, String value);

    public List<HostelRoomType> getByName(String name);

    public void remove(long hostelroomtypeId);

    public void save(HostelRoomType hostelroomtype);

    public void update(HostelRoomType hostelroomtype);

}
