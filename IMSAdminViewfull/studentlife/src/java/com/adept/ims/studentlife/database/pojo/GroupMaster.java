package com.adept.ims.authorization.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.BasePojo;
import com.adept.ims.common.database.pojo.Audit;
import java.util.HashSet;
import java.util.Set;

/**
 * GroupMaster entity. @author MyEclipse Persistence Tools
 */
public class GroupMaster extends BasePojo implements java.io.Serializable {

    // Fields
    private long id;
    private String groupName;
    private String description;
    private Audit audit;
    Set groupServices = new HashSet(0);

    // Constructors
    /** default constructor */
    public GroupMaster() {
    }

    /** full constructor */
    public GroupMaster( String groupName, String description,Audit audit,Set groupServices) {
        
        this.groupName = groupName;
        this.description = description;
        this.audit = audit;
        this.groupServices=groupServices;
    }

    // Property accessors
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    
    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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


    public Set getGroupServices() {
        return groupServices;
    }

    public void setGroupServices(Set groupServices) {
        this.groupServices = groupServices;
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

    /**
     * Compare with other object
     * @param o
     * @return -1 if current object is less then other object
    0  if current object is equal to other object
    1  if current object is greater then other objct
     */
    @Override
    public Serializable getPrimaryKeyObj() {
        // TODO Auto-generated method stub
        return getId();
    }
}