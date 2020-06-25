/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adept.ims.course.service;

import com.adept.ims.course.database.pojo.Subject;
import java.util.Collection;
import java.util.List;


public interface SubjectService {
    public List<Subject> getAll();
    public Subject get(long subjectId);
    public Subject save(Subject subject);
    public void update(Subject subject);
    public void remove(long subjectId);
    public List<Subject> getByName(String subjectName);
    public List<Subject> getByFilter(String filter,String value);
    public List<Subject> getByOperator(Subject subject, String operator);
}