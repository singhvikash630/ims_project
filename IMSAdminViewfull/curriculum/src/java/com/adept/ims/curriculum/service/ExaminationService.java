package com.adept.ims.curriculum.service;

import com.adept.ims.common.database.pojo.Audit;
import java.util.Collection;
import java.util.List;

import com.adept.ims.curriculum.database.pojo.Examination;

public interface ExaminationService {
    public List<Examination> getAll();
    public Examination get(long examId);

    public Collection<Examination> getByName(Audit audit);
    public Examination save(Examination examination);
    public void update(Examination examination);
    public void remove(long examId);
    public List<Examination> getByName(String name);
    public List<Examination> getByFilter(String filter,String value);
    public List<Examination> getByOperator(Examination examination, String operator);
}