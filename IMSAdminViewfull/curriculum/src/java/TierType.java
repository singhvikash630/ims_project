

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * TierType entity. @author MyEclipse Persistence Tools
 */

public class TierType extends BasePojo implements java.io.Serializable {

	// Fields

	private long tierId;
        private String tierName;
	private double minSal;
	private double maxSal;
        private Audit audit;
	
       // Constructors

	/** default constructor */
	public TierType() {
	}

	/** full constructor */
	public TierType(Audit audit, String tierName, double minSal, double maxSal) {
		this.tierName = tierName;
		this.minSal = minSal;
		this.maxSal = maxSal;
                this.audit = audit;
	}

	// Property accessors

	public long getTierId() {
		return this.tierId;
	}

	public void setTierId(long tierId) {
		this.tierId = tierId;
	}

	
	public String getTierName() {
		return this.tierName;
	}

	public void setTierName(String tierName) {
		this.tierName = tierName;
	}

	public double getMinSal() {
		return this.minSal;
	}

	public void setMinSal(double minSal) {
		this.minSal = minSal;
	}

	public double getMaxSal() {
		return this.maxSal;
	}

	public void setMaxSal(double maxSal) {
		this.maxSal = maxSal;
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
		return getTierId();
	}

}