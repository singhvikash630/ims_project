/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.course.service.impl;

import com.adept.ims.course.database.dao.SectionDAO;

import com.adept.ims.course.database.pojo.Section;
import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.course.service.SectionService;
import com.adept.ims.course.service.SubjectService;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

public class SectionServiceImpl implements SectionService {

    private static Log log = LogFactory.getLog(SectionServiceImpl.class);
    private SectionDAO dao;

    public void setSectionDAO(SectionDAO dao) {
        this.dao = dao;
    }

    public List<Section> getAll() {
        return dao.getAll();
    }

    public Section get(long sectionId) {
        Section section = dao.get(sectionId);

        if (section == null) {
            log.warn("SectionId '" + sectionId + "' not found in database.");
        }

        return section;
    }

    public Section save(Section section) {
        dao.save(section);

        return section;
    }

    public void remove(long sectionId) {
        if (dao.get(sectionId) != null) {
            dao.remove(sectionId);
        }
    }

    public List<Section> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(Section section) {
        dao.update(section);
    }

    public List<Section> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Section> getByOperator(Section section, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        if (!"".equals(section.getSectionName().trim())) {
            queryMap.put("subjectName", section.getSectionName());
        }


        return dao.getByOperator(operator, queryMap);

    }

}
