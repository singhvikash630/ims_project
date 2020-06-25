package com.adept.ims.hostel.database.dao.impl;

import com.adept.ims.hostel.database.dao.MessTypeDAO;
import com.adept.ims.hostel.database.pojo.MessType;
import java.util.List;

public class MessTypeDAOImpl extends HostelModuleDAOImpl implements MessTypeDAO {

    @Override
    public MessType get(long messtypeId) {
        return (MessType) super.get(messtypeId);
    }

    public List<MessType> getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void save(MessType messtype) {
        super.save(messtype);
    }

    public void update(MessType messtype) {
        super.update(messtype);
    }
}
