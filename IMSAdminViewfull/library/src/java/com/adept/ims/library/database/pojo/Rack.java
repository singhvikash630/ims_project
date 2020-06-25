package com.adept.ims.library.database.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.adept.ims.common.database.pojo.*;

/**
 * Rack entity. @author MyEclipse Persistence Tools
 */

public class Rack extends BasePojo implements java.io.Serializable {

	// Fields

	private long rackId;
	private String name;
	private Set books = new HashSet(0);
        private Audit audit;
	private Library library;
	

	// Constructors

	/** default constructor */
	public Rack() {
	}

	/** minimal constructor */
	public Rack(long rackId) {
		this.rackId = rackId;
	}

	/** full constructor */
	public Rack(long rackId,String name,Set books,Audit audit,Library library) {
		this.rackId = rackId;
		this.name = name;
		this.books = books;
                this.audit = audit;
		this.library = library;
	}

	// Property accessors

	public long getRackId() {
		return this.rackId;
	}

	public void setRackId(long rackId) {
		this.rackId = rackId;
	}

	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getBooks() {
		return this.books;
	}

	public void setBooks(Set books) {
		this.books = books;
	}
         
        public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Library getLibrary() {
		return this.library;
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
		return getRackId();
	}

}