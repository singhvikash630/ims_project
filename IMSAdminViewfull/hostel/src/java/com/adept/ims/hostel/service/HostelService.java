package com.adept.ims.hostel.service;

import java.util.List;

import com.adept.ims.hostel.database.pojo.Hostel;

public interface HostelService {
    public List<Hostel> getAll();
    public Hostel get(long HostelId);
    public Hostel save(Hostel hostel);
    public void update(Hostel hostel);
    public void remove(long hostelId);
    public List<Hostel> getById(long hostelId);
    public List<Hostel> getByFilter(String filter,String value);
    public List<Hostel> getByOperator(Hostel hostel, String operator);
}