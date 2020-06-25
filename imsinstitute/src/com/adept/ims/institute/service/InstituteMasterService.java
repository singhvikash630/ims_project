/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.service;

import com.adept.ims.institute.database.pojo.InstituteMaster;

import java.util.List;


/**
 *
 * @author Viswanath
 */
public interface InstituteMasterService {

    public InstituteMaster get(long instituteMasterId);

    public InstituteMaster getByPrimaryKey(long instituteMasterId);

    public void save(InstituteMaster institute);

    public void update(InstituteMaster institute);

    public void remove(long instituteMasterId);

    public List<InstituteMaster> getAll();

    public List<InstituteMaster> getByName(String name);

    public List<InstituteMaster> getByFilter(String filter, String value);

    public List<InstituteMaster> getByOperator(InstituteMaster institute, String operator);
}
