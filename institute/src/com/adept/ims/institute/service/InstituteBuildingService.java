/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.service;


import com.adept.ims.institute.database.pojo.InstituteBuilding;
import java.util.List;

/**
 *
 * @author Viswanath
 */
public interface InstituteBuildingService {

    public List<InstituteBuilding> getAll();

    public InstituteBuilding get(long instituteBuildingId);

    public InstituteBuilding getByPrimaryKey(String searchValue);

    public InstituteBuilding save(InstituteBuilding instituteBuilding);

    public void update(InstituteBuilding instituteBuilding);

    public void remove(long instituteBuildingId);

    public List<InstituteBuilding> getByFilter(String filter, String value);

    public List<InstituteBuilding> getByOperator(InstituteBuilding instituteBuilding, String operator);
}
