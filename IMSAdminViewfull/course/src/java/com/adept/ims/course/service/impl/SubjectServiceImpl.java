/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.course.service.impl;

import com.adept.ims.course.database.dao.SubjectDAO;
import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.course.service.SubjectService;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

public class SubjectServiceImpl implements SubjectService {

    private static Log log = LogFactory.getLog(SubjectServiceImpl.class);
    private SubjectDAO dao;

    public void setSubjectDAO(SubjectDAO dao) {
        this.dao = dao;
    }

    public List<Subject> getAll() {
        return dao.getAll();
    }

    public Subject get(long subjectId) {
        Subject subject = dao.get(subjectId);

        if (subject == null) {
            log.warn("SubjectId '" + subjectId + "' not found in database.");
        }

        return subject;
    }

    public Subject save(Subject subject) {
        dao.save(subject);

        return subject;
    }

    public void remove(long subjectId) {
        if (dao.get(subjectId) != null) {
            dao.remove(subjectId);
        }
    }

    public List<Subject> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(Subject subject) {
        dao.update(subject);
    }

    public List<Subject> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Subject> getByOperator(Subject subject, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        if (!"".equals(subject.getSubjectName().trim())) {
            queryMap.put("subjectName", subject.getSubjectName());
        }
        

        return dao.getByOperator(operator, queryMap);

    }

}
