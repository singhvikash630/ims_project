package com.adept.ims.staff.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.library.database.pojo.Library;
import com.adept.ims.library.database.pojo.LibraryAccount;

/**
 * Staff entity. @author MyEclipse Persistence Tools
 */
public class Staff extends BasePojo implements java.io.Serializable {

    // Fields
    private long staffId;
    private StaffMember staffMember;
    private Library library;
    private Audit audit;
    private LibraryAccount libraryAccount;
    // Constructors

    /** default constructor */
    public Staff() {
    }

    /** full constructor */
    public Staff(Audit audit, StaffMember staffMember, Library library) {
        this.audit = audit;
        this.staffMember = staffMember;
        this.library = library;
    }

    // Property accessors
    public long getStaffId() {
        return this.staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public StaffMember getStaffMember() {
        return this.staffMember;
    }

    public void setStaffMember(StaffMember staffMember) {
        this.staffMember = staffMember;
    }

    public Library getLibrary() {
        return this.library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Audit getAudit() {
        return this.audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public LibraryAccount getLibraryAccount() {
        return libraryAccount;
    }

    public void setLibraryAccount(LibraryAccount libraryAccount) {
        this.libraryAccount = libraryAccount;
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
        return getStaffId();
    }
}