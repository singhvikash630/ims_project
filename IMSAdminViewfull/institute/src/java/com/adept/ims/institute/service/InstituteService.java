/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.service;

import com.adept.ims.institute.database.pojo.Institute;

import java.util.List;

/**
 *
 * @author Viswanath
 */
public interface InstituteService {

   
    public Institute get(long instituteId);

    public Institute getByPrimaryKey(long primaryKeyId);

    public Institute save(Institute Institute);

    public void update(Institute institute);

    public void remove(long instituteId);
    
    public List<Institute> getAll();
   
    public List<Institute> getByFilter(String filter, String value);

    public List<Institute> getByOperator(Institute institute, String operator);
}
