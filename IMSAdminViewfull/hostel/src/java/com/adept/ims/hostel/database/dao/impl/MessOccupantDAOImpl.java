
package com.adept.ims.hostel.database.dao.impl;

import com.adept.ims.hostel.database.dao.MessOccupantDAO;
import com.adept.ims.hostel.database.pojo.MessOccupant;
import java.util.List;

public class MessOccupantDAOImpl extends HostelModuleDAOImpl implements MessOccupantDAO {

    @Override
    public MessOccupant get(long messoccupantId) {
        return (MessOccupant) super.get(messoccupantId);
    }

    public List<MessOccupant> getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void save(MessOccupant messoccupant) {
        super.save(messoccupant);
    }

    public void update(MessOccupant messoccupant) {
        super.update(messoccupant);
    }

}
