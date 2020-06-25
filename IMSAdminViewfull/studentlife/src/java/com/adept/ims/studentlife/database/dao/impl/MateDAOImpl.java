package com.adept.ims.studentlife.database.dao.impl;

import java.util.List;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.adept.ims.studentlife.database.dao.MateDAO;
import com.adept.ims.studentlife.database.pojo.Mate;

/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve Trust objects.
 */
public class MateDAOImpl extends MateDAOImpl implements MateDAO {

    private static Log log = LogFactory.getLog(mateDAOImpl.class);

    /**public RoleServiceDAOImpl() {
        className = RoleService.class.getName();
    }**/

    public mate get(long studentId) {
        return (Mate) super.get(studentId);
    }

    public List<Mate> getAll() {
        return super.getAll();
    }


//    public void save(PersonRole personRole) {
//        super.save(personRole);
//    }
//
//    public void update(PersonRole personRole) {
//        super.update(personRole);
//    }
 public List<Mate> getByFilter(String filter, String value) {
        return super.getByFilter(filter, value);
    }

    public List<Mate> getByOperator(String operator, Map<String, String> queryMap) {
        return super.getByOperator(operator, queryMap);
    }

}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laptop
 */
