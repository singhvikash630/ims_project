package com.adept.ims.hostel.database.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.adept.ims.common.database.pojo.*;

/**
 * Hostel entity. @author MyEclipse Persistence Tools
 */
public class Hostel extends BasePojo implements java.io.Serializable {

    // Fields
    private long hostelId;
    private long capacity;
    private Address address;
    private Person person;
    private Audit audit;
    private Set hostelRooms = new HashSet(0);
    private Set students = new HashSet(0);


    // Constructors
    /** default constructor */
    public Hostel() {
    }

    /** full constructor */
    public Hostel(Audit audit, Address address, Person person, long capacity,
            Set hostelRooms, Set students) {
        this.audit = audit;
        this.address = address;
        this.person = person;
        this.capacity = capacity;
        this.hostelRooms = hostelRooms;
        this.students = students;

    }

    // Property accessors
    public long getHostelId() {
        return this.hostelId;
    }

    public void setHostelId(long hostelId) {
        this.hostelId = hostelId;
    }

    public long getCapacity() {
        return this.capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Audit getAudit() {
        return this.audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public Set getHostelRooms() {
        return this.hostelRooms;
    }

    public void setHostelRooms(Set hostelRooms) {
        this.hostelRooms = hostelRooms;
    }

    public Set getStudents() {
        return this.students;
    }

    public void setStudents(Set students) {
        this.students = students;
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
        return getHostelId();
    }
}