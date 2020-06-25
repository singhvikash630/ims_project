package com.adept.ims.course.database.dao;

import com.adept.ims.course.database.pojo.Discipline;
import com.adept.ims.course.database.pojo.Section;
import java.util.List;


import java.util.Map;

public interface DisciplineDAO extends CourseMDAO {

    public Discipline get(long disciplineId);

    public void save(Discipline discipline);

    public void update(Discipline discipline);

    public void remove(long disciplineId);

    public List<Discipline> getAll();

    public List<Discipline> getByName(String disciplineName);

    public List<Discipline> getByFilter(String filter, String value);

    public List<Discipline> getByOperator(String operator, Map<String, String> queryMap);
}
