package com.adept.ims.course.service;

import com.adept.ims.course.database.pojo.Discipline;
import com.adept.ims.course.database.pojo.Section;

import java.util.Collection;
import java.util.List;


public interface DisciplineService {
    public List<Discipline> getAll();
    public Discipline get(long disciplineId);
    public Discipline save(Discipline discipline);
    public void update(Discipline discipline);
    public void remove(long disciplineId);
    public List<Discipline> getByName(String disciplineName);
    public List<Discipline> getByFilter(String filter,String value);
    public List<Discipline> getByOperator(Discipline discipline, String operator);
}