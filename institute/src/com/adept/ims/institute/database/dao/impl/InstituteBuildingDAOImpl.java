/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.database.dao.impl;


import com.adept.ims.institute.database.dao.InstituteBuildingDAO;
import com.adept.ims.institute.database.pojo.InstituteBuilding;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Viswanath
 */
public class InstituteBuildingDAOImpl extends InstituteModuleDAOImpl implements InstituteBuildingDAO {

    public InstituteBuildingDAOImpl() {
        className = InstituteBuilding.class.getName();
    }

    public InstituteBuilding get(long instituteBuildingId) {
        return (InstituteBuilding) super.get(instituteBuildingId);
    }

    public List<InstituteBuilding> getAll() {
        return super.getAll();
    }

    public void save(InstituteBuilding instituteBuilding) {
        super.save(instituteBuilding);
    }

    public void update(InstituteBuilding instituteBuilding) {
        super.update(instituteBuilding);
    }

    public List<InstituteBuilding> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<InstituteBuilding> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }
}
