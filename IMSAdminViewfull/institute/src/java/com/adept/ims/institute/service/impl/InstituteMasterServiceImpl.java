/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adept.ims.institute.service.impl;

import com.adept.ims.institute.database.dao.InstituteMasterDAO;
import com.adept.ims.institute.service.InstituteMasterService;
import com.adept.ims.institute.database.pojo.InstituteMaster;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author Viswanath
 */
public class InstituteMasterServiceImpl implements InstituteMasterService {

    private static Log log = LogFactory.getLog(InstituteMasterServiceImpl.class);
    private InstituteMasterDAO instituteMasterDAO;

    public void setInstituteMasterDAO(InstituteMasterDAO instituteMasterDAO) {
        this.instituteMasterDAO = instituteMasterDAO;
    }

    public List<InstituteMaster> getAll() {
        return this.instituteMasterDAO.getAll();
    }

    public InstituteMaster get(long instituteMasterId) {
        InstituteMaster institute = this.instituteMasterDAO.get(instituteMasterId);

        if (institute == null) {
            log.warn("InstituteMasterId '" + instituteMasterId + "' not found in database.");
        }

        return institute;
    }


    public InstituteMaster getByPrimaryKey(long instituteMasterId) {
        return get(instituteMasterId);
    }

    public void save(InstituteMaster institute) {
        this.instituteMasterDAO.save(institute);
    }

    public void remove(long trustId) {
        if (this.instituteMasterDAO.get(trustId) != null) {
            this.instituteMasterDAO.remove(trustId);
        }
    }

    public List<InstituteMaster> getByName(String name) {
        return this.instituteMasterDAO.getByFilter("name", name);
    }

    public void update(InstituteMaster institute) {
        this.instituteMasterDAO.update(institute);
    }

    public List<InstituteMaster> getByFilter(String filter, String value) {
        return this.instituteMasterDAO.getByFilter(filter, value);
    }

    public List<InstituteMaster> getByOperator(InstituteMaster instituteMaster, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();

        if (!"".equals(instituteMaster.getName().trim())) {
            queryMap.put("name", instituteMaster.getName());
        }

        if (!"".equals(instituteMaster.getType().trim())) {
            queryMap.put("type", instituteMaster.getType());
        }

        return this.instituteMasterDAO.getByOperator(operator, queryMap);

    }

    public List<InstituteMaster> getByOperator(String operator, Map<String, String> queryMap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
