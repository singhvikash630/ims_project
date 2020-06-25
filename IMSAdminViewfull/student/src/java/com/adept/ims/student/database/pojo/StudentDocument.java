package com.adept.ims.student.database.pojo;

import java.io.Serializable;

import com.adept.ims.common.database.pojo.*;

/**
 * StudentDocument entity. @author MyEclipse Persistence Tools
 */
public class StudentDocument extends BasePojo implements java.io.Serializable {

    // Fields
    private long studDocId;
    private byte[] document_1;
    private Audit audit;
    private Document document;
    private Student student;


    // Constructors
    /** default constructor */
    public StudentDocument() {
    }

    /** full constructor */
    public StudentDocument(byte[] document_1, Audit audit, Document document) {
        this.document_1 = document_1;
        this.audit = audit;
        this.document = document;
    }

    // Property accessors
    public long getStudDocId() {
        return this.studDocId;
    }

    public void setStudDocId(long studDocId) {
        this.studDocId = studDocId;
    }

    public byte[] getDocument_1() {
        return this.document_1;
    }

    public void setDocument_1(byte[] document_1) {
        this.document_1 = document_1;
    }

    public Audit getAudit() {
        return this.audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public Document getDocument() {
        return this.document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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
        return getStudDocId();
    }
}