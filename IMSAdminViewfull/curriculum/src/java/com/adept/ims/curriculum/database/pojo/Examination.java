package com.adept.ims.curriculum.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.institute.database.pojo.Room;

/**
 * Examination entity. @author MyEclipse Persistence Tools
 */

public class Examination extends BasePojo implements java.io.Serializable {

	// Fields

	private long examId;
	private Date datee;
	private Date startTime;
	private Date endTime;
	private long maxMark;
	private long passingMark;
        private Audit audit;
	private Subject subject;
	private ExamType examType;
	private Room room;

	// Constructors

	/** default constructor */
	public Examination() {
	}

	/** full constructor */
	public Examination(Date datee,Date startTime,Date endTime,long maxMark,long passingMark,Audit audit,
                           Subject subject,ExamType examType,Room room) {
		this.datee = datee;
		this.startTime = startTime;
		this.endTime = endTime;
		this.maxMark = maxMark;
		this.passingMark = passingMark;
                this.audit = audit;
		this.subject = subject;
		this.examType = examType;
		this.room = room;
	}

	// Property accessors

	public long getExamId() {
		return this.examId;
	}

	public void setExamId(long examId) {
		this.examId = examId;
	}

	public Date getDatee() {
		return this.datee;
	}

	public void setDatee(Date datee) {
		this.datee = datee;
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

	public long getMaxMark() {
		return this.maxMark;
	}

	public void setMaxMark(long maxMark) {
		this.maxMark = maxMark;
	}

	public long getPassingMark() {
		return this.passingMark;
	}

	public void setPassingMark(long passingMark) {
		this.passingMark = passingMark;
	}
        public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
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
		return getExamId();
	}

}