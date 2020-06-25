

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * PlacementType entity. @author MyEclipse Persistence Tools
 */

public class PlacementType extends BasePojo implements java.io.Serializable {

	// Fields

	private long placementTypeId;
	private String name;
        private Audit audit;
	

	// Constructors

	/** default constructor */
	public PlacementType() {
	}

	/** full constructor */
	public PlacementType(Audit audit, String name) {
	       this.name = name; 	
               this.audit = audit;
		
	}

	// Property accessors

	public long getPlacementTypeId() {
		return this.placementTypeId;
	}

	public void setPlacementTypeId(long placementTypeId) {
		this.placementTypeId = placementTypeId;
	}

        public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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
		return getPlacementTypeId();
	}

}