

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.student.database.pojo.Student;

/**
 * ExamLeave entity. @author MyEclipse Persistence Tools
 */

public class ExamLeave extends BasePojo implements java.io.Serializable {

	// Fields

	private long examLeaveId;
        private String reason;
	private Examination examination;
	private Audit audit;
	private Student student;
	
	// Constructors

	/** default constructor */
	public ExamLeave() {
	}

	/** full constructor */
	public ExamLeave(String reason,Examination examination,Audit audit,Student student) {
		this.reason = reason;
                this.examination = examination;
		this.audit = audit;
		this.student = student;
		
	}

	// Property accessors

	public long getExamLeaveId() {
		return this.examLeaveId;
	}

	public void setExamLeaveId(long examLeaveId) {
		this.examLeaveId = examLeaveId;
	}

        public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	} 
	public Examination getExamination() {
		return this.examination;
	}

	public void setExamination(Examination examination) {
		this.examination = examination;
	}

	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
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
		return getExamLeaveId();
	}

}