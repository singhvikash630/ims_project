
package com.adept.ims.hostel.database.dao;

import com.adept.ims.hostel.database.pojo.MessType;
import java.util.List;

public interface MessTypeDAO extends HostelModuleDAO {

    public MessType get(long messtypeId);

    public List<MessType> getAll();

    public List<MessType> getByFilter(String filter, String value);

    public List<MessType> getByName(String name);

    public void remove(long messtypeId);

    public void save(MessType messtype);

    public void update(MessType messtype);

}
