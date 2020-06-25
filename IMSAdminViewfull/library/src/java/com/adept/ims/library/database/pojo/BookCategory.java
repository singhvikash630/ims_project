package com.adept.ims.library.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * BookCategory entity. @author MyEclipse Persistence Tools
 */

public class BookCategory extends BasePojo implements java.io.Serializable {

	// Fields

	private long bookCategoryId;
	private String name;
        private Audit audit;

	// Constructors

	/** default constructor */
	public BookCategory() {
	}

	/** full constructor */
	public BookCategory(Audit audit, String name) {
		this.audit = audit;
		this.name = name;
	}

	// Property accessors

	public long getBookCategoryId() {
		return this.bookCategoryId;
	}

	public void setBookCategoryId(long bookCategoryId) {
		this.bookCategoryId = bookCategoryId;
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
		return getBookCategoryId();
	}

}