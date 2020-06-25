package com.adept.ims.library.database.pojo;

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;

/**
 * BookIssue entity. @author MyEclipse Persistence Tools
 */

public class BookIssue extends BasePojo implements java.io.Serializable {

	// Fields

	private long bookTransId;
        private long quantity;
        private long noTimesRenewd;
	private Date issueDate;
	private Date dueDate;
	private Date receiveDate;
        private Date renewdDate;
        private long fine;
        private Audit audit;
	private LibraryAccount libraryAccount;
	private Book book;
	
	
	// Constructors

	/** default constructor */
	public BookIssue() {
	}

	/** full constructor */
	public BookIssue(long quantity, Date issueDate, Date dueDate, Date receiveDate,
			long noTimesRenewd, Date renewdDate, long fine,Audit audit, LibraryAccount libraryAccount, Book book) {
		this.quantity = quantity;
		this.issueDate = issueDate;
		this.dueDate = dueDate;
		this.receiveDate = receiveDate;
		this.noTimesRenewd = noTimesRenewd;
		this.renewdDate = renewdDate;
		this.fine = fine;
                this.audit = audit;
		this.libraryAccount = libraryAccount;
		this.book = book;
		
	}

	// Property accessors

	public long getBookTransId() {
		return this.bookTransId;
	}

	public void setBookTransId(long bookTransId) {
		this.bookTransId = bookTransId;
	}

	
	public long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public Date getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getReceiveDate() {
		return this.receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

	public long getNoTimesRenewd() {
		return this.noTimesRenewd;
	}

	public void setNoTimesRenewd(long noTimesRenewd) {
		this.noTimesRenewd = noTimesRenewd;
	}

	public Date getRenewdDate() {
		return this.renewdDate;
	}

	public void setRenewdDate(Date renewdDate) {
		this.renewdDate = renewdDate;
	}

	public long getFine() {
		return this.fine;
	}

	public void setFine(long fine) {
		this.fine = fine;
	}
        public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public LibraryAccount getLibraryAccount() {
		return this.libraryAccount;
	}

	public void setLibraryAccount(LibraryAccount libraryAccount) {
		this.libraryAccount = libraryAccount;
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
		return getBookTransId();
	}

}