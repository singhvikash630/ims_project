package com.adept.ims.studentlife.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;
import com.adept.ims.course.database.pojo.*;
import com.adept.ims.hostel.database.pojo.Hostel;
import com.adept.ims.hostel.database.pojo.HostelOccupant;
import com.adept.ims.hostel.database.pojo.MessOccupant;
import com.adept.ims.institute.database.pojo.Institute;
import com.adept.ims.library.database.pojo.Library;
import com.adept.ims.library.database.pojo.LibraryAccount;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
public class Mate extends BasePojo implements java.io.Serializable {

    // Fields
    private long studentId;
    private String universityId;
    private boolean active;
    private CourseYear courseYear;
    private Audit audit;
    //private Parent parent;
    private Institute institute;
    private Person person;
    private Library library;
    private LibraryAccount libraryAccount;
    private CourseMaster courseMaster;
    private HostelOccupant hostelOccupant;
    private MessOccupant messOccupant;
    private Hostel hostel;

    // Constructors
    /** default constructor */
    public Mate() {
    }

    /** full constructor */
   public Mate(String universityId, boolean active, CourseYear courseYear, Audit audit,
             Institute institute, Person person, Library library,
            CourseMaster courseMaster, Hostel hostel) {
        this.universityId = universityId;
        this.active = active;
        this.courseYear = courseYear;
        this.audit = audit;
        //this.parent = parent;
        this.institute = institute;
        this.person = person;
        this.library = library;
        this.courseMaster = courseMaster;
        this.hostel = hostel;

    }

    // Property accessors
    public long getStudentId() {
        return this.studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getUniversityId() {
        return this.universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public boolean getActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public CourseYear getCourseYear() {
        return this.courseYear;
    }

    public void setCourseYear(CourseYear courseYear) {
        this.courseYear = courseYear;
    }

    public Audit getAudit() {
        return this.audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

//    public Parent getParent() {
//        return this.parent;
//    }
//
//    public void setParent(Parent parent) {
//        this.parent = parent;
//    }

    public Institute getInstitute() {
        return this.institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Library getLibrary() {
        return this.library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public CourseMaster getCourseMaster() {
        return this.courseMaster;
    }

    public void setCourseMaster(CourseMaster courseMaster) {
        this.courseMaster = courseMaster;
    }

    public Hostel getHostel() {
        return this.hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }

    public LibraryAccount getLibraryAccount() {
        return libraryAccount;
    }

    public void setLibraryAccount(LibraryAccount libraryAccount) {
        this.libraryAccount = libraryAccount;
    }

    public HostelOccupant getHostelOccupant() {
        return hostelOccupant;
    }

    public void setHostelOccupant(HostelOccupant hostelOccupant) {
        this.hostelOccupant = hostelOccupant;
    }

    public MessOccupant getMessOccupant() {
        return messOccupant;
    }

    public void setMessOccupant(MessOccupant messOccupant) {
        this.messOccupant = messOccupant;
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
        return getStudentId();
    }
}