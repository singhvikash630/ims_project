package com.adept.ims.authorization.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.BasePojo;
import com.adept.ims.common.database.pojo.Audit;
import java.util.HashSet;
import java.util.Set;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */
public class Role extends BasePojo implements java.io.Serializable {

    // Fields
    private long id;
    private String roleName;
    private String description;
    private Audit audit;
    Set roleServices = new HashSet(0);

        // Constructors
    /** default constructor */
    public Role() {
    }

    /** full constructor */
    public Role( String roleName, String description,Audit audit,Set roleServices) {
        
        this.roleName = roleName;
        this.description = description;
        this.audit = audit;
        this.roleServices=roleServices;
    }

    // Property accessors
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public Set getRoleServices() {
        return roleServices;
    }

    public void setRoleServices(Set roleServices) {
        this.roleServices = roleServices;
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