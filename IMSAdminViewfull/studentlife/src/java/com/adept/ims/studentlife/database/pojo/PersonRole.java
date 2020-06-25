package com.adept.ims.authorization.database.pojo;



import com.adept.ims.common.database.pojo.Person;
import java.io.Serializable;
import com.adept.ims.common.database.pojo.Audit;
import com.adept.ims.common.database.pojo.BasePojo;


/**
 * PersonRole entity. @author MyEclipse Persistence Tools
 */
public class PersonRole extends BasePojo implements java.io.Serializable {

    // Fields
    private long id;
    private Audit audit;
    private Person person;
    private Role role;
   // Constructors
    /** default constructor */
    public PersonRole() {
    }

    /** Full Constrocter*/
    public PersonRole(Audit audit,Person person,Role role){
         this.audit=audit;
         this.person=person;
         this.role=role;


    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
        return getId();
    }
}