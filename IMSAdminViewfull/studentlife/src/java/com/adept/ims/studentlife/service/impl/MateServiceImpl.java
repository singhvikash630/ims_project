package com.adept.ims.studentlife.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.studentlife.database.dao.MateDAO;
import com.adept.ims.studentlife.database.pojo.;
import com.adept.ims.studentlife.service.MateService;
import java.util.HashMap;
import java.util.Map;

public class MateServiceImpl implements MateService {

   private static Log log = LogFactory.getLog(MateServiceImpl.class);
    private MateDAO dao;

    public void setMateDAO(MateDAO dao) {
        this.dao = dao;
    }

    public List<Mate> getAll() {
        return dao.getAll();
    }

    public mate get(long studentId) {
        Mate mate = dao.get(studentId);

        if (mate == null) {
            log.warn("studentId '" + studentId + "' not found in database.");
        }

        return mate;
    }

//    public Mate save(PersonRole personRole) {
//        dao.save(personRole);
//
//        return personRole;
//    }

//    public void remove(long personId) {
//        if (dao.get(personId) != null) {
//            dao.remove(personId);
//        }
//    }
//
//    public void update(PersonRole personRole) {
//        dao.update(personRole);
//    }

    public List<Mate> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<Mate> getByOperator(Mate mate, String operator) {
        Map<String, String> queryMap = new HashMap<String, String>();


        return dao.getByOperator(operator, queryMap);
}
}
