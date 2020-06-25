

import java.io.Serializable;
import java.util.Date;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.student.database.pojo.Student;

/**
 * StudentPlacement entity. @author MyEclipse Persistence Tools
 */

public class StudentPlacement extends BasePojo implements java.io.Serializable {

	// Fields

	private long placementId;
        private double salary;
	private String designation;
	private Date selectedDate;
	private Date joiningDate;
	private Audit audit;
	private TierType tierType;
	private Student student;
	private PlacementType placementType;
	private CompanyMaster companyMaster;
	
	// Constructors

	/** default constructor */
	public StudentPlacement() {
	}

	/** full constructor */
	public StudentPlacement(double salary, String designation, Date selectedDate,
			Date joiningDate,Audit audit, TierType tierType, Student student,
			PlacementType placementType, CompanyMaster companyMaster) {
		this.salary = salary;
		this.designation = designation;
		this.selectedDate = selectedDate;
		this.joiningDate = joiningDate;
                this.audit = audit;
		this.tierType = tierType;
		this.student = student;
		this.placementType = placementType;
		this.companyMaster = companyMaster;
			}

	// Property accessors

	public long getPlacementId() {
		return this.placementId;
	}

	public void setPlacementId(long placementId) {
		this.placementId = placementId;
	}
        
        public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getSelectedDate() {
		return this.selectedDate;
	}

	public void setSelectedDate(Date selectedDate) {
		this.selectedDate = selectedDate;
	}

	public Date getJoiningDate() {
		return this.joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
   
	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public TierType getTierType() {
		return this.tierType;
	}

	public void setTierType(TierType tierType) {
		this.tierType = tierType;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public PlacementType getPlacementType() {
		return this.placementType;
	}

	public void setPlacementType(PlacementType placementType) {
		this.placementType = placementType;
	}

	public CompanyMaster getCompanyMaster() {
		return this.companyMaster;
	}

	public void setCompanyMaster(CompanyMaster companyMaster) {
		this.companyMaster = companyMaster;
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
		return getPlacementId();
	}

}