package com.adept.ims.curriculum.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.student.database.pojo.Student;

/**
 * Attendance entity. @author MyEclipse Persistence Tools
 */

public class Attendance extends BasePojo implements java.io.Serializable {

	// Fields

	private long attendanceId;
        private boolean attendance;
	private String reason; 
	private Audit audit;
	private Lecture lecture;
	private Student student;
	

	// Constructors

	/** default constructor */
	public Attendance() {
	}

	/** minimal constructor */
	public Attendance(long attendanceId) {
		this.attendanceId = attendanceId;
	//}

	/** full constructor */
	//public Attendance(long attendanceId,boolean attendance, String reason,Audit audit, Lecture lecture,
			//Student student, ) {
		this.attendanceId = attendanceId;
		this.audit = audit;
		this.lecture = lecture;
		this.student = student;
		this.attendance = attendance;
		this.reason = reason;
	}

	// Property accessors

	public long getAttendanceId() {
		return this.attendanceId;
	}

	public void setAttendanceId(long attendanceId) {
		this.attendanceId = attendanceId;
	}
        public boolean getAttendance() {
		return this.attendance;
	}

	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	} 
	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Lecture getLecture() {
		return this.lecture;
	}

	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
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
		return getAttendanceId();
	}

}