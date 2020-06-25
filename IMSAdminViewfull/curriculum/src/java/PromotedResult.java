

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;



/**
 * PromotedResult entity. @author MyEclipse Persistence Tools
 */

public class PromotedResult extends BasePojo implements java.io.Serializable {


    // Fields    

     private long promotedResultId;
     private String reason;
     private Audit audit;
     private Result result;
     


    // Constructors

    /** default constructor */
    public PromotedResult() {
    }

    
    /** full constructor */
    public PromotedResult(String reason,Audit audit, Result result) {
        this.reason = reason;
        this.audit = audit;
        this.result = result;
        
    }

   
    // Property accessors

    public long getPromotedResultId() {
        return this.promotedResultId;
    }
    
    public void setPromotedResultId(long promotedResultId) {
        this.promotedResultId = promotedResultId;
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

    public Result getResult() {
        return this.result;
    }
    
    public void setResult(Result result) {
        this.result = result;
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
		return getPromotedResultId();
	}
   








}