package com.adept.ims.library.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */

public class Book extends BasePojo implements java.io.Serializable {

	// Fields

	private long bookId;
	private String name;
	private String description;
	private String author;
	private String publication;
	private String edition;
	private Date dateb;
	private long quantity;
	private long curQuantity;
	private long noOfDays;
	private long noTimesRenew;
        private Audit audit;
	private BookCategory bookCategory;
	private BookTag bookTag;
	private Rack rack;
	

	// Constructors

	/** default constructor */
	public Book() {
	}

	/** full constructor */
	public Book(String name, String description, String author,String publication,String edition,
                     Date dateb, long quantity,long curQuantity, long noOfDays,long noTimesRenew,
                     Audit audit, BookCategory bookCategory, BookTag bookTag,Rack rack) {
		this.name = name;
		this.description = description;
		this.author = author;
		this.publication = publication;
		this.edition = edition;
		this.dateb = dateb;
		this.quantity = quantity;
		this.curQuantity = curQuantity;
		this.noOfDays = noOfDays;
		this.noTimesRenew = noTimesRenew;
                this.audit = audit;
		this.bookCategory = bookCategory;
		this.bookTag = bookTag;
		this.rack = rack;
	}

	// Property accessors

	public long getBookId() {
		return this.bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return this.publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getEdition() {
		return this.edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public Date getDateb() {
		return this.dateb;
	}

	public void setDateb(Date dateb) {
		this.dateb = dateb;
	}

	public long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getCurQuantity() {
		return this.curQuantity;
	}

	public void setCurQuantity(long curQuantity) {
		this.curQuantity = curQuantity;
	}

	public long getNoOfDays() {
		return this.noOfDays;
	}

	public void setNoOfDays(long noOfDays) {
		this.noOfDays = noOfDays;
	}

	public long getNoTimesRenew() {
		return this.noTimesRenew;
	}

	public void setNoTimesRenew(long noTimesRenew) {
		this.noTimesRenew = noTimesRenew;
	}
        public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public BookCategory getBookCategory() {
		return this.bookCategory;
	}

	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}

	public BookTag getBookTag() {
		return this.bookTag;
	}

	public void setBookTag(BookTag bookTag) {
		this.bookTag = bookTag;
	}

	public Rack getRack() {
		return this.rack;
	}

	public void setRack(Rack rack) {
		this.rack = rack;
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
		return null;
	}

}