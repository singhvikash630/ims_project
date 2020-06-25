package com.adept.ims.staff.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * MiscItDetails entity. @author MyEclipse Persistence Tools
 */

public class MiscItDetails extends BasePojo implements java.io.Serializable {

	// Fields

	private long miscItId;
	private double medicalInsu;
	private String handicap;
	private String diseases;
	private long higherEdu;
	private double houseIncome;
	private Audit audit;
	// Constructors

	/** default constructor */
	public MiscItDetails() {
	}

	/** full constructor */
	public MiscItDetails(Audit audit, double medicalInsu, String handicap,
			String diseases, long higherEdu, double houseIncome) {
		this.audit = audit;
		this.medicalInsu = medicalInsu;
		this.handicap = handicap;
		this.diseases = diseases;
		this.higherEdu = higherEdu;
		this.houseIncome = houseIncome;
	}

	// Property accessors

	public long getMiscItId() {
		return this.miscItId;
	}

	public void setMiscItId(long miscItId) {
		this.miscItId = miscItId;
	}

	public double getMedicalInsu() {
		return this.medicalInsu;
	}

	public void setMedicalInsu(double medicalInsu) {
		this.medicalInsu = medicalInsu;
	}

	public String getHandicap() {
		return this.handicap;
	}

	public void setHandicap(String handicap) {
		this.handicap = handicap;
	}

	public String getDiseases() {
		return this.diseases;
	}

	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}

	public long getHigherEdu() {
		return this.higherEdu;
	}

	public void setHigherEdu(long higherEdu) {
		this.higherEdu = higherEdu;
	}

	public double getHouseIncome() {
		return this.houseIncome;
	}

	public void setHouseIncome(double houseIncome) {
		this.houseIncome = houseIncome;
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
		return getMiscItId();
	}

}