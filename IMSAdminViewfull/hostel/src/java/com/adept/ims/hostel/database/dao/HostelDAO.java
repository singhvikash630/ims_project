package com.adept.ims.hostel.database.dao;

import com.adept.ims.hostel.database.pojo.Hostel;
import java.util.List;

public interface HostelDAO extends HostelModuleDAO {

    public Hostel get(long hostelId);

    public List<Hostel> getAll();

    public List<Hostel> getByFilter(String filter, String value);

    public List<Hostel> getByName(String name);

    public void remove(long hostelId);

    public void save(Hostel hostel);

    public void update(Hostel hostel);
}