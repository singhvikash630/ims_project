package com.adept.ims.curriculum.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;



/**
 * CompanyMaster entity. @author MyEclipse Persistence Tools
 */

public class CompanyMaster extends BasePojo implements java.io.Serializable {


    // Fields    

     private long companyId;
     private String companyName;
     private Audit audit;
     private Address address;


    // Constructors

    /** default constructor */
    public CompanyMaster() {
    }

    
    /** full constructor */
    public CompanyMaster(String companyName,Audit audit,Address address) {
        this.companyName = companyName;
        this.audit = audit;
        this.address = address;
        
    }

   
    // Property accessors

    public long getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
		return getCompanyId();
	}
   








}