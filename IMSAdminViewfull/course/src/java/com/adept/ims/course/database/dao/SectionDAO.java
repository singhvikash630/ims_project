package com.adept.ims.course.database.dao;

import com.adept.ims.course.database.pojo.Section;
import java.util.List;


import java.util.Map;

public interface SectionDAO extends CourseMDAO {

    public Section get(long sectiontId);

    public void save(Section section);

    public void update(Section section);

    public void remove(long sectionId);

    public List<Section> getAll();

    public List<Section> getByName(String sectionName);

    public List<Section> getByFilter(String filter, String value);

    public List<Section> getByOperator(String operator, Map<String, String> queryMap);
}
