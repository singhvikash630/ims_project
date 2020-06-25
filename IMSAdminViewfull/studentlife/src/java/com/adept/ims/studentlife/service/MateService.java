package com.adept.ims.studentlife.service;

import java.util.List;

import com.adept.ims.studentlife.database.pojo.Mate;

public interface MateService {
    public List<Mate> getAll();
    public Mate get(long studentId);
    //public Mate save(Mate mate);
    //public void update(Mate mate);
    //public void remove(long studentId);
    //public String getByName(String name);
    public List<Mate> getByFilter(String filter,String value);
    public List<Mate> getByOperator(Mate mate, String operator);


}
