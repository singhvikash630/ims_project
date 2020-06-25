

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.student.database.pojo.Student;

/**
 * Result entity. @author MyEclipse Persistence Tools
 */

public class Result extends BasePojo implements java.io.Serializable {

	// Fields

	private long resultId;
        private long markObtained;
	private boolean attendance;
        private Examination examination;
	private Audit audit;
	private Student student;
	
	// Constructors

	/** default constructor */
	public Result() {
	}

	/** minimal constructor */
	public Result(long resultId) {
		this.resultId = resultId;
	}

	/** full constructor */
	public Result(long resultId,long markObtained, boolean attendance,Examination examination, Audit audit,
			Student student) {
		this.markObtained = markObtained;
		this.attendance = attendance;
                this.resultId = resultId;
		this.examination = examination;
		this.audit = audit;
		this.student = student;
			}

	// Property accessors

	public long getResultId() {
		return this.resultId;
	}

	public void setResultId(long resultId) {
		this.resultId = resultId;
	}
        
        public long getMarkObtained() {
		return this.markObtained;
	}

	public void setMarkObtained(long markObtained) {
		this.markObtained = markObtained;
	}

	public boolean getAttendance() {
		return this.attendance;
	}

	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
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
		return getResultId();
	}

}