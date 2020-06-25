
package com.adept.ims.hostel.database.dao;

import com.adept.ims.hostel.database.pojo.MessOccupant;
import java.util.List;

public interface MessOccupantDAO extends HostelModuleDAO {

    public MessOccupant get(long messoccupantId);

    public List<MessOccupant> getAll();

    public List<MessOccupant> getByFilter(String filter, String value);

    public List<MessOccupant> getByName(String name);

    public void remove(long messoccupantId);

    public void save(MessOccupant messoccupant);

    public void update(MessOccupant messoccupant);

}
