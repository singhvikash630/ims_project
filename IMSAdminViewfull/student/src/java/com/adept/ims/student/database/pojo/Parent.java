package com.adept.ims.student.database.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.adept.ims.common.database.pojo.*;

/**
 * Parent entity. @author MyEclipse Persistence Tools
 */

public class Parent extends BasePojo implements java.io.Serializable {

	// Fields

	private long parentId;
	private String relationship;
        private Set students = new HashSet(0);
        private Student student;
	private Person person;
	

	// Constructors

	/** default constructor */
	public Parent() {
	}

	/** full constructor */
	public Parent(String relationship,Set students,Student student,Person person) {
		this.relationship = relationship;
                this.students = students;
                this.student = student;
		this.person = person;
		
	}

	// Property accessors

	public long getParentId() {
		return this.parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
        public String getRelationship() {
		return this.relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
        public Set getStudents() {
    	        return this.students;
	}
	public void setStudents(Set students) {
		this.students = students;
	} 
        public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
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
		return getParentId();
	}

}