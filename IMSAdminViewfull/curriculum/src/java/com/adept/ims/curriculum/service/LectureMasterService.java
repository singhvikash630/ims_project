package com.adept.ims.curriculum.service;

import com.adept.ims.staff.database.pojo.Staff;
import java.util.Collection;
import java.util.List;

import com.adept.ims.curriculum.database.pojo.LectureMaster;

public interface LectureMasterService {
    public List<LectureMaster> getAll();
    public LectureMaster get(long LectureMasId);

    public Collection<LectureMaster> getByName(Staff staff);
    public LectureMaster save(LectureMaster lectureMaster);
    public void update(LectureMaster lectureMaster);
    public void remove(long lectureMasterId);
    public List<LectureMaster> getByName(String name);
    public List<LectureMaster> getByFilter(String filter,String value);
    public List<LectureMaster> getByOperator(LectureMaster lectureMaster, String operator);
}