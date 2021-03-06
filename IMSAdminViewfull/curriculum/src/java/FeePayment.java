

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.course.database.pojo.CourseFee;
import com.adept.ims.student.database.pojo.Student;

/**
 * FeePayment entity. @author MyEclipse Persistence Tools
 */

public class FeePayment extends BasePojo implements java.io.Serializable {

	// Fields

	private long feePaymentId;
	private double amount;
        private Audit audit;
	private CourseFee courseFee;
	private Student student;
	private PaymentMode paymentMode;
	
	// Constructors

	/** default constructor */
	public FeePayment() {
	}

	/** full constructor */
	public FeePayment(double amount,Audit audit, CourseFee courseFee, Student student,
			PaymentMode paymentMode) {
		this.amount = amount;
                this.audit = audit;
		this.courseFee = courseFee;
		this.student = student;
		this.paymentMode = paymentMode;
		
	}

	// Property accessors

	public long getFeePaymentId() {
		return this.feePaymentId;
	}

	public void setFeePaymentId(long feePaymentId) {
		this.feePaymentId = feePaymentId;
	}

        public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	} 
	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public CourseFee getCourseFee() {
		return this.courseFee;
	}

	public void setCourseFee(CourseFee courseFee) {
		this.courseFee = courseFee;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public PaymentMode getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
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
		return getFeePaymentId();
	}

}