package com.adept.ims.library.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * BookOrder entity. @author MyEclipse Persistence Tools
 */

public class BookOrder extends BasePojo implements java.io.Serializable {

	// Fields

	private long bookOrderId;
        private long quantity;
	private double price;
	private Audit audit;
	private Book book;
	
	// Constructors

	/** default constructor */
	public BookOrder() {
	}

	/** full constructor */
	public BookOrder(long quantity, double price,Audit audit, Book book) {
		this.quantity = quantity;
		this.price = price;
                this.audit = audit;
		this.book = book;
		   
	}

	// Property accessors

	public long getBookOrderId() {
		return this.bookOrderId;
	}

	public void setBookOrderId(long bookOrderId) {
		this.bookOrderId = bookOrderId;
	}

	
	public long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

        public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
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
		return getBookOrderId();
	}

}