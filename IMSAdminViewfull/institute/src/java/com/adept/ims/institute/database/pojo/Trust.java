package com.adept.ims.institute.database.pojo;

import com.adept.ims.common.database.pojo.Address;
import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.common.database.pojo.BasePojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



/**
 * Trust entity. @author MyEclipse Persistence Tools
 */

public class Trust extends BasePojo implements java.io.Serializable {

	// Fields

	private long trustId;
	private String trustName;
    private Audit audit;
	private Address address;
	private Set institutes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Trust() {
      address = new Address();     
	}

	/** full constructor */
	public Trust( String trustName,
			Audit audit, Address address, Set institutes) {
		
		this.trustName = trustName;
        this.audit = audit;
		this.address = address;
	    this.institutes = institutes;

	}

	// Property accessors

	public long getTrustId() {
		return this.trustId;
	}

	public void setTrustId(long trustId) {
		this.trustId = trustId;
	}

    public String getTrustName() {
		return this.trustName;
	}

	public void setTrustName(String trustName) {
		this.trustName = trustName;
	}

	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	public Set getInstitutes() {
		return this.institutes;
	}

	public void setInstitutes(Set institutes) {
		this.institutes = institutes;
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return null;
	}

	 /**
     * Compare with other object
     * @param o
     * @return -1 if current object is less then other object
               0  if current object is equal to other object
               1  if current object is greater then other objct
     */@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		// TODO Auto-generated method stub
		return getTrustId();
	}

}