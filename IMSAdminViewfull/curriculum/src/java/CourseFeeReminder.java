

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.course.database.pojo.CourseFee;



/**
 * CourseFeeReminder entity. @author MyEclipse Persistence Tools
 */

public class CourseFeeReminder extends BasePojo implements java.io.Serializable {


    // Fields    

     private long reminderId;
     private Audit audit;
     private CourseFee courseFee;


    // Constructors

    /** default constructor */
    public CourseFeeReminder() {
    }

	/** minimal constructor */
    public CourseFeeReminder(long reminderId) {
        this.reminderId = reminderId;
    }
    
    /** full constructor */
    public CourseFeeReminder(long reminderId, Audit audit, CourseFee courseFee) {
        this.reminderId = reminderId;
        this.audit = audit;
        this.courseFee = courseFee;
    }

   
    // Property accessors

    public long getReminderId() {
        return this.reminderId;
    }
    
    public void setReminderId(long reminderId) {
        this.reminderId = reminderId;
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
		return getReminderId();
	}
   








}