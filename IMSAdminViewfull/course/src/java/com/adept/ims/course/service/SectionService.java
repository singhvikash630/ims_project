/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.course.service;

import com.adept.ims.course.database.pojo.Section;

import java.util.Collection;
import java.util.List;


public interface SectionService {
    public List<Section> getAll();
    public Section get(long sectionId);
    public Section save(Section section);
    public void update(Section section);
    public void remove(long sectionId);
    public List<Section> getByName(String sectionName);
    public List<Section> getByFilter(String filter,String value);
    public List<Section> getByOperator(Section section, String operator);
}