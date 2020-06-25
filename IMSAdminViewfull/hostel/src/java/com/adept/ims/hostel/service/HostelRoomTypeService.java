package com.adept.ims.hostel.service;

import java.util.List;

import com.adept.ims.hostel.database.pojo.HostelRoomType;

public interface HostelRoomTypeService {
    public List<HostelRoomType> getAll();
    public HostelRoomType get(long HostelRoomTypeId);
    public HostelRoomType save(HostelRoomType hostelroomtype);
    public void update(HostelRoomType hostelroomtype);
    public void remove(long hostelroomtypeId);
    public List<HostelRoomType> getByName(String name);
    public List<HostelRoomType> getByFilter(String filter,String value);
    public List<HostelRoomType> getByOperator(HostelRoomType hostelroomtype, String operator);
}