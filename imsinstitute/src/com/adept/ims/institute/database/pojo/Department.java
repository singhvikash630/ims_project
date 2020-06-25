package com.adept.ims.institute.database.pojo;

import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.common.database.pojo.BasePojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department extends BasePojo implements java.io.Serializable {

	// Fields

	private long departmentId;
    private String name;
	private String description;
	private Audit audit;
	private Institute institute;
    private Set staffVacancies = new HashSet(0);
	private Set staffMembers = new HashSet(0);
    
	// Constructors

	/** default constructor */
	public Department() {
        Institute institute = new Institute();
	}

	/** full constructor */
	public Department(String name,String description,Audit audit, Institute institute, Set staffVacancies,
			 Set staffMembers) {
		
		this.name = name;
		this.description = description;
        this.audit = audit;
		this.institute = institute;
        this.staffVacancies=staffVacancies;
		this.staffMembers = staffMembers;
	}

	// Property accessors

	public long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Institute getInstitute() {
		return this.institute;
	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
	}

	

    public Set getStaffVacancies() {
        return staffVacancies;
    }

    public void setStaffVacancies(Set staffVacancies) {
        this.staffVacancies = staffVacancies;
    }

    public Set getStaffMembers() {
		return this.staffMembers;
	}

	public void setStaffMembers(Set staffMembers) {
		this.staffMembers = staffMembers;
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
     */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		// TODO Auto-generated method stub
		return getDepartmentId();
	}

}