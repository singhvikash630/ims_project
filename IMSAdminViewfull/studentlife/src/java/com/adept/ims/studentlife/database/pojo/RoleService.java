package com.adept.ims.authorization.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.common.database.pojo.BasePojo;

/**
 * RoleService entity. @author MyEclipse Persistence Tools
 */
public class RoleService extends BasePojo implements java.io.Serializable {

    // Fields
    private long id;
    private Audit audit;
    private Role role;
    private Service service;

    public RoleService() {
    }

    public RoleService(Audit audit, Role role, Service service) {
        this.audit = audit;
        this.role = role;
        this.service = service;
    }

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
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
        return getId();
    }
}