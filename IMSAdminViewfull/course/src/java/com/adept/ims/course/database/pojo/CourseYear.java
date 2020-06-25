package com.adept.ims.course.database.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.adept.ims.common.database.pojo.*;

/**
 * CourseYear entity. @author MyEclipse Persistence Tools
 */

public class CourseYear extends BasePojo implements java.io.Serializable {

	// Fields

	private long courseYearId;
	private Audit audit;
	private Course course;
	private String year;
	private String semester;
	private Set subjects = new HashSet(0);
	private Set students = new HashSet(0);
	
	// Constructors

	/** default constructor */
	public CourseYear() {
	}

	/** full constructor */
	public CourseYear(Audit audit, Course course, String year, String semester,
			 Set subjects, Set students, Set sections) {
		this.audit = audit;
		this.course = course;
		this.year = year;
		this.semester = semester;
		this.subjects = subjects;
		this.students = students;
		
	}

	// Property accessors

	public long getCourseYearId() {
		return this.courseYearId;
	}

	public void setCourseYearId(long courseYearId) {
		this.courseYearId = courseYearId;
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

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSemester() {
		return this.semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	

	public Set getSubjects() {
		return this.subjects;
	}

	public void setSubjects(Set subjects) {
		this.subjects = subjects;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
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
		return getCourseYearId();
	}

	

}