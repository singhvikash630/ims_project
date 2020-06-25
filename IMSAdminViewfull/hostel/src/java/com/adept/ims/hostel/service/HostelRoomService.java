package com.adept.ims.hostel.service;

import java.util.List;

import com.adept.ims.hostel.database.pojo.HostelRoom;

public interface HostelRoomService {
    public List<HostelRoom> getAll();
    public HostelRoom get(long HostelRoomId);
    public HostelRoom save(HostelRoom hostelroom);
    public void update(HostelRoom hostelroom);
    public void remove(long hostelroomId);
    public List<HostelRoom> getByName(String name);
    public List<HostelRoom> getByFilter(String filter,String value);
    public List<HostelRoom> getByOperator(HostelRoom hostelroom, String operator);
}