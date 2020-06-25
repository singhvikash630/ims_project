package com.adept.ims.curriculum.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.institute.database.pojo.Room;
import com.adept.ims.staff.database.pojo.Staff;

/**
 * LectureMaster entity. @author MyEclipse Persistence Tools
 */

public class LectureMaster extends BasePojo implements java.io.Serializable {

	// Fields

	private long lectureMasId;
	private Audit audit;
	private Subject subject;
	private Room room;
	private Staff staff;

	// Constructors

	/** default constructor */
	public LectureMaster() {
	}

	/** full constructor */
	public LectureMaster(Audit audit, Subject subject, Room room, Staff staff) {
		this.audit = audit;
		this.subject = subject;
		this.room = room;
		this.staff = staff;
	}

	// Property accessors

	public long getLectureMasId() {
		return this.lectureMasId;
	}

	public void setLectureMasId(long lectureMasId) {
		this.lectureMasId = lectureMasId;
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

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
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
		return getLectureMasId();
	}

}