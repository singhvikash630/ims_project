package com.adept.ims.curriculum.service;

import java.util.Collection;
import java.util.List;

import com.adept.ims.curriculum.database.pojo.Lecture;

public interface LectureService {
    public List<Lecture>  getAll();
    public Lecture get(long lectureId);

    public Collection<Lecture> getByName(long lectureId);
    public Lecture save(Lecture lecture);
    public void update(Lecture lecture);
    public void remove(long lectureId);
    public List<Lecture> getByName(String name);
    public List<Lecture> getByFilter(String filter,String value);
    public List<Lecture> getByOperator(Lecture lecture, String operator);
}