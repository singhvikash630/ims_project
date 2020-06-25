

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.course.database.pojo.Subject;
import com.adept.ims.staff.database.pojo.Staff;

/**
 * Assignment entity. @author MyEclipse Persistence Tools
 */

public class Assignment extends BasePojo implements java.io.Serializable {

	// Fields

	private long assignId;
	private Audit audit;
	private Subject subject;
	private Staff staff;

	// Constructors

	/** default constructor */
	public Assignment() {
	}

	/** minimal constructor */
	public Assignment(long assignId) {
		this.assignId = assignId;
	}

	/** full constructor */
	public Assignment(long assignId, Audit audit, Subject subject, Staff staff) {
		this.assignId = assignId;
		this.audit = audit;
		this.subject = subject;
		this.staff = staff;
	}

	// Property accessors

	public long getAssignId() {
		return this.assignId;
	}

	public void setAssignId(long assignId) {
		this.assignId = assignId;
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
		return getAssignId();
	}

}