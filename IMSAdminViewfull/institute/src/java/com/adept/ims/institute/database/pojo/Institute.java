package com.adept.ims.institute.database.pojo;

import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.common.database.pojo.BasePojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Institute entity. @author MyEclipse Persistence Tools
 */
public class Institute extends BasePojo implements java.io.Serializable {

    // Fields
    private long instituteId;
    private String status;
    private Audit audit;
    private Trust trust;
    private InstituteMaster instituteMaster;
    private Set holidays = new HashSet(0);
    private Set buildings = new HashSet(0);

    // Constructors
    /** default constructor */
    public Institute() {
         trust = new Trust();
         instituteMaster = new InstituteMaster();
    }

    /** full constructor */
    public Institute(String status,Audit audit, Trust trust, InstituteMaster instituteMaster,Set holidays,Set buildings
            ) {
        this.status = status;
        this.audit = audit;
        this.trust = trust;
        this.instituteMaster = instituteMaster;
        this.holidays=holidays;
        this.buildings=buildings;
    }

    // Property accessors
    public long getInstituteId() {
        return this.instituteId;
    }

    public void setInstituteId(long instituteId) {
        this.instituteId = instituteId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Audit getAudit() {
        return this.audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public Trust getTrust() {
        return this.trust;
    }

    public void setTrust(Trust trust) {
        this.trust = trust;
    }

    public InstituteMaster getInstituteMaster() {
        return this.instituteMaster;
    }

    public void setInstituteMaster(InstituteMaster instituteMaster) {
        this.instituteMaster = instituteMaster;
    }

    

    public Set getHolidays() {
        return holidays;
    }

    public void setHolidays(Set holidays) {
        this.holidays = holidays;
    }

    public Set getBuildings() {
        return buildings;
    }

    public void setBuildings(Set buildings) {
        this.buildings = buildings;
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
        return getInstituteId();
    }
}