package com.adept.ims.course.database.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.adept.ims.common.database.pojo.*;

/**
 * Discipline entity. @author MyEclipse Persistence Tools
 */

public class Discipline extends BasePojo implements java.io.Serializable {

	// Fields

	private long disciplineId;
	private Audit audit;
	private String disciplineName;
	private double numberOfYears;
	
	// Constructors

	/** default constructor */
	public Discipline() {
	}

	/** full constructor */
	public Discipline(Audit audit, String disciplineName, double numberOfYears,
			Set courseMasters) {
		this.audit = audit;
		this.disciplineName = disciplineName;
		this.numberOfYears = numberOfYears;
		
	}

	// Property accessors

	public long getDisciplineId() {
		return this.disciplineId;
	}

	public void setDisciplineId(long disciplineId) {
		this.disciplineId = disciplineId;
	}

	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public String getDisciplineName() {
		return this.disciplineName;
	}

	public void setDisciplineName(String disciplineName) {
		this.disciplineName = disciplineName;
	}

	public double getNumberOfYears() {
		return this.numberOfYears;
	}

	public void setNumberOfYears(double numberOfYears) {
		this.numberOfYears = numberOfYears;
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
		return getDisciplineId();
	}

}