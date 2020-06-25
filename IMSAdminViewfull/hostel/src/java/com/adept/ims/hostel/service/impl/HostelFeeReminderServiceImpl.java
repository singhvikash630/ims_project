package com.adept.ims.hostel.service.impl;

import java.util.Collection;
import java.util.List;


import com.adept.ims.hostel.database.dao.HostelFeeReminderDAO;
import com.adept.ims.hostel.database.pojo.HostelFeeReminder;
import com.adept.ims.hostel.service.HostelFeeReminderService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HostelFeeReminderServiceImpl implements HostelFeeReminderService {

    private static Log log = LogFactory.getLog(HostelFeeReminderServiceImpl.class);
    private HostelFeeReminderDAO dao;

    public void setHostelFeeReminderDAO(HostelFeeReminderDAO dao) {
        this.dao = dao;
    }

    public List<HostelFeeReminder> getAll() {
        return dao.getAll();
    }

    public HostelFeeReminder get(long hostelfeereminderId) {
        HostelFeeReminder hostelfeereminder = dao.get(hostelfeereminderId);

        if (hostelfeereminder == null) {
            log.warn("HostelFeeReminderId '" + hostelfeereminderId + "' not found in database.");
        }

        return hostelfeereminder;
    }

    public HostelFeeReminder save(HostelFeeReminder hostelfeereminder) {
        dao.save(hostelfeereminder);

        return hostelfeereminder;
    }

    public void remove(long hostelfeereminderId) {
        if (dao.get(hostelfeereminderId) != null) {
            dao.remove(hostelfeereminderId);
        }
    }

    public List<HostelFeeReminder> getById(long id) {
        return dao.getById(id);
    }

    public void update(HostelFeeReminder hostelfeereminder) {
        dao.update(hostelfeereminder);
    }

    public List<HostelFeeReminder> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<HostelFeeReminder> getByOperator(HostelFeeReminder hostelfeereminder, String operator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
}
