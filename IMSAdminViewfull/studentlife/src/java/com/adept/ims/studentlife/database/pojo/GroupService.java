package com.adept.ims.authorization.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.common.database.pojo.BasePojo;


/**
 * GroupService entity. @author MyEclipse Persistence Tools
 */

public class GroupService extends BasePojo implements java.io.Serializable {

	// Fields

	private long id;
	private Audit audit;
	private Service service;

	// Constructors

	/** default constructor */
	public GroupService() {
	}

	/** full constructor */
	public GroupService(Audit audit, Service service) {
		this.audit = audit;
		this.service = service;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
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
		return getId();
	}

}