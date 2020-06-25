package com.adept.ims.library.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * LibraryAccount entity. @author MyEclipse Persistence Tools
 */
public class LibraryAccount extends BasePojo implements java.io.Serializable {

    // Fields
    private long accountId;
    private long maxBooks;
    private String type;
    private Audit audit;
    private Person person;
    private Library library;

    // Constructors
    /** default constructor */
    public LibraryAccount() {
    }

    /** full constructor */
    public LibraryAccount(long maxBooks, String type, Audit audit, Person person) {
        this.maxBooks = maxBooks;
        this.type = type;
        this.audit = audit;
        this.person = person;
    }

    // Property accessors
    public long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getMaxBooks() {
        return this.maxBooks;
    }

    public void setMaxBooks(long maxBooks) {
        this.maxBooks = maxBooks;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
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
        return getAccountId();
    }
}