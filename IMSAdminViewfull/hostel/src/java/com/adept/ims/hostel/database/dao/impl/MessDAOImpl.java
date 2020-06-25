
package com.adept.ims.hostel.database.dao.impl;

import com.adept.ims.hostel.database.dao.MessDAO;
import com.adept.ims.hostel.database.pojo.Mess;
import java.util.List;

public class MessDAOImpl extends HostelModuleDAOImpl implements MessDAO {

    @Override
    public Mess get(long messId) {
        return (Mess) super.get(messId);
    }

    public List<Mess> getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void save(Mess mess) {
        super.save(mess);
    }

    public void update(Mess mess) {
        super.update(mess);
    }

}
