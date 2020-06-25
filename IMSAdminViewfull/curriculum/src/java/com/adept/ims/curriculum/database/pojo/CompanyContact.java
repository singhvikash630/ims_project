package com.adept.ims.curriculum.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * CompanyContact entity. @author MyEclipse Persistence Tools
 */

public class CompanyContact extends BasePojo  implements java.io.Serializable {


    // Fields    

     private long contactId;
     private String name;
     private String designation;
     private long contactNumber1;
     private long contactNumber2;
     private String email;
     private Audit audit;
     private CompanyMaster companyMaster;


    // Constructors

    /** default constructor */
    public CompanyContact() {
    }

    
    /** full constructor */
    public CompanyContact(String name,String designation,long contactNumber1,long contactNumber2,String email,Audit audit,CompanyMaster companyMaster) {
        this.name = name;
        this.designation = designation;
        this.contactNumber1 = contactNumber1;
        this.contactNumber2 = contactNumber2;
        this.email = email;
        this.audit = audit;
        this.companyMaster = companyMaster;
        
    }

   
    // Property accessors

    public long getContactId() {
        return this.contactId;
    }
    
    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return this.designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getContactNumber1() {
        return this.contactNumber1;
    }
    
    public void setContactNumber1(long contactNumber1) {
        this.contactNumber1 = contactNumber1;
    }

    public long getContactNumber2() {
        return this.contactNumber2;
    }
    
    public void setContactNumber2(long contactNumber2) {
        this.contactNumber2 = contactNumber2;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Audit getAudit() {
        return this.audit;
    }
    
    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public CompanyMaster getCompanyMaster() {
        return this.companyMaster;
    }
    
    public void setCompanyMaster(CompanyMaster companyMaster) {
        this.companyMaster = companyMaster;
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
		return getContactId();
	}
   








}