/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.service.impl;

import com.adept.ims.institute.database.dao.InstituteBuildingDAO;
import com.adept.ims.institute.database.pojo.InstituteBuilding;
import com.adept.ims.institute.service.InstituteBuildingService;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author Viswanath
 */
public class InstituteBuildingServiceImpl implements InstituteBuildingService {

    private static Log log = LogFactory.getLog(InstituteBuildingServiceImpl.class);
    private InstituteBuildingDAO dao;

    public void setInstituteBuildingDAO(InstituteBuildingDAO dao) {
        this.dao = dao;
    }

    public List<InstituteBuilding> getAll() {
        return dao.getAll();
    }

    public InstituteBuilding get(long instituteBuildingId) {
        InstituteBuilding instituteBuilding = dao.get(instituteBuildingId);

        if (instituteBuilding == null) {
            log.warn("InstitueBuildingId " + instituteBuildingId + " not found.");
        }

        return instituteBuilding;
    }

    public InstituteBuilding save(InstituteBuilding instituteBuilding) {

        dao.save(instituteBuilding);

        return instituteBuilding;
    }

    public void remove(long instituteBuildingId) {
        dao.remove(instituteBuildingId);
    }

    public void update(InstituteBuilding instituteBuilding) {
        dao.update(instituteBuilding);
    }

    public List<InstituteBuilding> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<InstituteBuilding> getByOperator(InstituteBuilding instituteBuilding, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        String buildingId = String.valueOf(instituteBuilding.getBuilding().getBuildingId());
        String instituteId = String.valueOf(instituteBuilding.getInstitute().getInstituteId());

        if (!"".equals(buildingId)) {
            queryMap.put("building.buildingId", buildingId);
        }

        if (!"".equals(instituteId)) {
            queryMap.put("institute.instituteId", instituteId);
        }

        return dao.getByOperator(operator, queryMap);

    }

    public InstituteBuilding getByPrimaryKey(String searchValue) {
        return get(Long.valueOf(searchValue));
    }
}
