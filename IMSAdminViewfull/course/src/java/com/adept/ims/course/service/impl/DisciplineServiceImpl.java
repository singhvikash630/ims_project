/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.course.service.impl;

import com.adept.ims.course.database.dao.DisciplineDAO;
import com.adept.ims.course.database.dao.SectionDAO;

import com.adept.ims.course.database.pojo.Discipline;
import com.adept.ims.course.database.pojo.Section;
import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.course.service.DisciplineService;
import com.adept.ims.course.service.SectionService;
import com.adept.ims.course.service.SubjectService;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

public class DisciplineServiceImpl implements DisciplineService {

    private static Log log = LogFactory.getLog(DisciplineServiceImpl.class);
    private DisciplineDAO dao;

    public void setDisciplineDAO(DisciplineDAO dao) {
        this.dao = dao;
    }

    public List<Discipline> getAll() {
        return dao.getAll();
    }

    public Discipline get(long disciplineId) {
        Discipline discipline = dao.get(disciplineId);

        if (discipline == null) {
            log.warn("disciplineId '" + disciplineId + "' not found in database.");
        }

        return discipline;
    }

    public Discipline save(Discipline discipline) {
        dao.save(discipline);

        return discipline;
    }

    public void remove(long disciplineId) {
        if (dao.get(disciplineId) != null) {
            dao.remove(disciplineId);
        }
    }

    public List<Discipline> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(Discipline discipline) {
        dao.update(discipline);
    }

    public List<Discipline> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Discipline> getByOperator(Discipline discipline, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        if (!"".equals(discipline.getDisciplineName().trim())) {
            queryMap.put("disciplineName", discipline.getDisciplineName());
        }


        return dao.getByOperator(operator, queryMap);

    }

}
