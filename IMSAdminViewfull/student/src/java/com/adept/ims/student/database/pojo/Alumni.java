package com.adept.ims.student.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.course.database.pojo.*;
import com.adept.ims.institute.database.pojo.*;

/**
 * Alumni entity. @author MyEclipse Persistence Tools
 */
public class Alumni extends BasePojo implements java.io.Serializable {

    // Fields
    private long alumniId;
    private Date leavingDate;
    private Audit audit;
    private Course course;
    private Parent parent;
    private Institute institute;
    private Person person;
    private CourseMaster courseMaster;


    // Constructors
    /** default constructor */
    public Alumni() {
    }

    /** full constructor */
    public Alumni(Date leavingDate, Audit audit, Course course, Parent parent,
            Institute institute, Person person, CourseMaster courseMaster) {
        this.leavingDate = leavingDate;
        this.audit = audit;
        this.course = course;
        this.parent = parent;
        this.institute = institute;
        this.person = person;
        this.courseMaster = courseMaster;

    }

    // Property accessors
    public long getAlumniId() {
        return this.alumniId;
    }

    public void setAlumniId(long alumniId) {
        this.alumniId = alumniId;
    }

    public Date getLeavingDate() {
        return this.leavingDate;
    }

    public void setLeavingDate(Date leavingDate) {
        this.leavingDate = leavingDate;
    }

    public Audit getAudit() {
        return this.audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Parent getParent() {
        return this.parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Institute getInstitute() {
        return this.institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public CourseMaster getCourseMaster() {
        return this.courseMaster;
    }

    public void setCourseMaster(CourseMaster courseMaster) {
        this.courseMaster = courseMaster;
    }

    @Override
    public Object clone() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        // TODO Auto-generated method stub
        return null;
    }
}