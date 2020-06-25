package com.adept.ims.hostel.service;

import java.util.List;

import com.adept.ims.hostel.database.pojo.HostelOccupant;

public interface HostelOccupantService {
    public List<HostelOccupant> getAll();
    public HostelOccupant get(long HostelOccupantId);
    public HostelOccupant save(HostelOccupant hosteloccupant);
    public void update(HostelOccupant hosteloccupant);
    public void remove(long hosteloccupantId);
    public List<HostelOccupant> getByName(String name);
    public List<HostelOccupant> getByFilter(String filter,String value);
    public List<HostelOccupant> getByOperator(HostelOccupant hosteloccupant, String operator);
}