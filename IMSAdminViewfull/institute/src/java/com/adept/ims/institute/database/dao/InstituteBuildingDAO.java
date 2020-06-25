/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.database.dao;

import com.adept.ims.institute.database.pojo.InstituteBuilding;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Viswanath
 */
public interface InstituteBuildingDAO extends InstituteModuleDAO {

    public InstituteBuilding get(long instituteBuildingId);

    public void save(InstituteBuilding instituteBuilding);

    public void update(InstituteBuilding instituteBuilding);

    public void remove(long trustId);

    public List<InstituteBuilding> getAll();

    public List<InstituteBuilding> getByFilter(String filter, String value);

    public List<InstituteBuilding> getByOperator(String operator, Map<String, String> queryMap);
}
