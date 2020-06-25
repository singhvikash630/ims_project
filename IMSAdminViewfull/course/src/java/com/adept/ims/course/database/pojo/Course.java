package com.adept.ims.course.database.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.adept.ims.common.database.pojo.*;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */
public class Course extends BasePojo implements java.io.Serializable {

    // Fields
    private long courseId;
    private String batch;
    private long durationMonths;
    private Audit audit;
    private CourseEligibility courseEligibility;
    private CourseMaster courseMaster;
    private Set courseVacancies = new HashSet(0);
    private Set courseYears = new HashSet(0);
    private Set courseFee = new HashSet(0);

    // Constructors
    /** default constructor */
    public Course() {
    }

    /** full constructor */
    public Course(Audit audit, CourseEligibility courseEligibility,
            CourseMaster courseMaster, long durationMonths, String batch,
            Set courseVacancies,
            Set courseYears) {
        this.audit = audit;
        this.courseEligibility = courseEligibility;
        this.courseMaster = courseMaster;
        this.durationMonths = durationMonths;
        this.batch = batch;
        this.courseVacancies = courseVacancies;
        this.courseYears = courseYears;

    }

    // Property accessors
    public long getCourseId() {
        return this.courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getBatch() {
        return this.batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public long getDurationMonths() {
        return this.durationMonths;
    }

    public void setDurationMonths(long durationMonths) {
        this.durationMonths = durationMonths;
    }

    public Audit getAudit() {
        return this.audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public CourseEligibility getCourseEligibility() {
        return this.courseEligibility;
    }

    public void setCourseEligibility(CourseEligibility courseEligibility) {
        this.courseEligibility = courseEligibility;
    }

    public CourseMaster getCourseMaster() {
        return this.courseMaster;
    }

    public void setCourseMaster(CourseMaster courseMaster) {
        this.courseMaster = courseMaster;
    }

    public Set getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(Set courseFee) {
        this.courseFee = courseFee;
    }

    public Set getCourseVacancies() {
        return this.courseVacancies;
    }

    public void setCourseVacancies(Set courseVacancies) {
        this.courseVacancies = courseVacancies;
    }

    public Set getCourseYears() {
        return this.courseYears;
    }

    public void setCourseYears(Set courseYears) {
        this.courseYears = courseYears;
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
        return getCourseId();
    }
}