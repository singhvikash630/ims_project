package com.adept.ims.hostel.service;

import java.util.List;

import com.adept.ims.hostel.database.pojo.MessOccupant;

public interface MessOccupantService {
    public List<MessOccupant> getAll();
    public MessOccupant get(long MessOccupantId);
    public MessOccupant save(MessOccupant messoccupant);
    public void update(MessOccupant messoccupant);
    public void remove(long messoccupantId);
    public List<MessOccupant> getByName(String name);
    public List<MessOccupant> getByFilter(String filter,String value);
    public List<MessOccupant> getByOperator(MessOccupant messoccupant, String operator);
}