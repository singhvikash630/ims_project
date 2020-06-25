package com.adept.ims.institute.database.pojo;

import com.adept.ims.common.database.pojo.Address;
import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.common.database.pojo.BasePojo;

import java.io.Serializable;

/**
 * InstituteMaster entity. @author MyEclipse Persistence Tools
 */
public class InstituteMaster extends BasePojo implements java.io.Serializable {

    // Fields
    private long instituteMasterId;
    private String name;
    private String type;
    private String description;
    private String university;
    private Audit audit;
    private Address address;

    // Constructors
    /** default constructor */
    public InstituteMaster() {
        address = new Address();
    }

    /** full constructor */
    public InstituteMaster( String name, String type,
            String description,String university,Audit audit, Address address) {
        
        this.name = name;
        this.type = type;
        this.description = description;
        this.university=university;
        this.audit = audit;
        this.address = address;

    }

    // Property accessors
    public long getInstituteMasterId() {
        return this.instituteMasterId;
    }

    public void setInstituteMasterId(long instituteMasterId) {
        this.instituteMasterId = instituteMasterId;
    }

    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
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
        return getInstituteMasterId();
    }
}