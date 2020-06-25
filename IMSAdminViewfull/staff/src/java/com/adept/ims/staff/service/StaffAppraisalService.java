package com.adept.ims.staff.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.staff.database.pojo.Appraisal;

public interface StaffAppraisalService {
    public List<Appraisal> getAll();
    public Appraisal get(long appraisalId);
    public Appraisal save(Appraisal appraisal);
    public void update(Appraisal appraisal);
    public void remove(long appraisalId);
    public List<Appraisal> getByName(String name);
    public List<Appraisal> getByFilter(String filter,String value);
    public List<Appraisal> getByOperator(Appraisal appraisal, String operator);
}