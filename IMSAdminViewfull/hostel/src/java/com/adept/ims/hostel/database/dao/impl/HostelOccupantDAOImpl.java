
package com.adept.ims.hostel.database.dao.impl;

import com.adept.ims.hostel.database.dao.HostelOccupantDAO;
import com.adept.ims.hostel.database.pojo.HostelOccupant;
import java.util.List;

public class HostelOccupantDAOImpl extends HostelModuleDAOImpl implements HostelOccupantDAO {

    @Override
    public HostelOccupant get(long hosteloccupantId) {
        return (HostelOccupant) super.get(hosteloccupantId);
    }

    
    public void save(HostelOccupant hosteloccupant) {
        super.save(hosteloccupant);
    }

    public void update(HostelOccupant hosteloccupant) {
        super.update(hosteloccupant);
    }

    public List<HostelOccupant> getById(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<HostelOccupant> getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
