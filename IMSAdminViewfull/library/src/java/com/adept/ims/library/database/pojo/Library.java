package com.adept.ims.library.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Library entity. @author MyEclipse Persistence Tools
 */
public class Library extends BasePojo implements java.io.Serializable {

    // Fields
    private long libraryId;
    private String name;
    private Audit audit;
    private Person person;
    private Address address;
    Set members = new HashSet(0);


    // Constructors
    /** default constructor */
    public Library() {
    }

    /** full constructor */
    public Library(String name, Audit audit, Person person, Address address) {
        this.name = name;
        this.audit = audit;
        this.person = person;
        this.address = address;

    }

    // Property accessors
    public long getLibraryId() {
        return this.libraryId;
    }

    public void setLibraryId(long libraryId) {
        this.libraryId = libraryId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Audit getAudit() {
        return this.audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set getMembers() {
        return members;
    }

    public void setMembers(Set members) {
        this.members = members;
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
        return getLibraryId();
    }
}