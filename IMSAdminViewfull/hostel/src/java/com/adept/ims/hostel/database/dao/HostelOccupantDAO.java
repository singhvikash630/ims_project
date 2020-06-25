
package com.adept.ims.hostel.database.dao;

import com.adept.ims.hostel.database.pojo.HostelOccupant;
import java.util.List;

public interface HostelOccupantDAO extends HostelModuleDAO  {

    public HostelOccupant get(long hosteloccupantId);

    public List<HostelOccupant> getAll();

    public List<HostelOccupant> getByFilter(String filter, String value);

   // public List<HostelOccupant> getById(long id);

    public List<HostelOccupant> getByName(String name);

    public void remove(long hosteloccupantId);

    public void save(HostelOccupant hosteloccupant);

    public void update(HostelOccupant hosteloccupant);

}
