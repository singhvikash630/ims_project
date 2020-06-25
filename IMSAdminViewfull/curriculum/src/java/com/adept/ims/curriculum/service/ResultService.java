package com.adept.ims.curriculum.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.curriculum.database.pojo.Result;
import com.adept.ims.student.database.pojo.Student;
import org.springframework.validation.BindingResult;

public interface ResultService {
    public List<Result> getAll();
    public Result get(long resultId);
     public Collection<Result> getByName(Student student);
    //public void save(BindingResult result);
    public Result save(Result result);
    public void update(Result result);
    public void remove(long resultId);
    public List<Result> getByName(String name);
    public List<Result> getByFilter(String filter,String value);
    public List<Result> getByOperator(Result result, String operator);
}