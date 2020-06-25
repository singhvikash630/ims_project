
package com.adept.ims.hostel.database.dao;

import com.adept.ims.hostel.database.pojo.Mess;
import java.util.List;

public interface MessDAO extends HostelModuleDAO  {

    public Mess get(long messId);

    public List<Mess> getAll();

    public List<Mess> getByFilter(String filter, String value);

    public List<Mess> getByName(String name);

    public void remove(long messId);

    public void save(Mess mess);

    public void update(Mess mess);

}
