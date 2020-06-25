/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.database.dao;

import com.adept.ims.institute.database.pojo.InstituteMaster;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Viswanath
 */
public interface InstituteMasterDAO extends InstituteModuleDAO {

    public InstituteMaster get(long instituteMasterId);

    public void save(InstituteMaster institute);

    public void update(InstituteMaster institute);

    public void remove(long instituteMasterId);

    public List<InstituteMaster> getAll();

    public List<InstituteMaster> getByFilter(String filter, String value);

    public List<InstituteMaster> getByOperator(String operator, Map<String, String> queryMap);
}
