package com.adept.ims.curriculum.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;

/**
 * Lecture entity. @author MyEclipse Persistence Tools
 */

public class Lecture extends BasePojo implements java.io.Serializable {

	// Fields

	private long lectureId;
	private Date datel;
	private Date startTime;
	private Date endTime;
        private Audit audit;

	// Constructors

	/** default constructor */
	public Lecture() {
	}

	/** minimal constructor */
	public Lecture(long lectureId) {
		this.lectureId = lectureId;
	}

	/** full constructor */
	public Lecture(long lectureId,Date datel, Date startTime,Date endTime, Audit audit) {
		this.lectureId = lectureId;
		this.datel = datel;
		this.startTime = startTime;
		this.endTime = endTime;
                this.audit = audit; 
	}

	// Property accessors

	public long getLectureId() {
		return this.lectureId;
	}

	public void setLectureId(long lectureId) {
		this.lectureId = lectureId;
	}

	public Date getDatel() {
		return this.datel;
	}

	public void setDatel(Date datel) {
		this.datel = datel;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
        
        public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
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
		return getLectureId();
	}

}