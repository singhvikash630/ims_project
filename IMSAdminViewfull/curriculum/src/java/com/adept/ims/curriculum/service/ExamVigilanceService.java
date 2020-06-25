package com.adept.ims.curriculum.service;

import com.adept.ims.curriculum.database.pojo.Examination;
import java.util.Collection;
import java.util.List;

import com.adept.ims.curriculum.database.pojo.ExamVigilance;

public interface ExamVigilanceService {
    public List<ExamVigilance> getAll();
    public ExamVigilance get(long examVigilId);

    public Collection<ExamVigilance> getByName(Examination examination);
    public ExamVigilance save(ExamVigilance examvigilance);
    public void update(ExamVigilance examvigilance);
    public void remove(long examVigilId);
    public List<ExamVigilance> getByName(String name);
    public List<ExamVigilance> getByFilter(String filter,String value);
    public List<ExamVigilance> getByOperator(ExamVigilance examvigilance, String operator);
}