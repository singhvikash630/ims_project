package com.adept.ims.authorization.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.BasePojo;
import com.adept.ims.common.database.pojo.Audit;

/**
 * Service entity. @author MyEclipse Persistence Tools
 */
public class Service extends BasePojo implements java.io.Serializable {

    // Fields
    private long id;
    private String serviceName;
    private String description;
    private Audit audit;

    // Constructors
    /** default constructor */
    public Service() {
    }

    /** full constructor */
    public Service( String serviceName, String description,Audit audit) {
        
        this.serviceName = serviceName;
        this.description = description;
        this.audit = audit;
    }

    // Property accessors
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    

    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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
        return getId();
    }
}