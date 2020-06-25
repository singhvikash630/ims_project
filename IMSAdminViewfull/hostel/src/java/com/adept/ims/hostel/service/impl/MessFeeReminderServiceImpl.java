package com.adept.ims.hostel.service.impl;

import java.util.List;


import com.adept.ims.hostel.database.dao.MessFeeReminderDAO;
import com.adept.ims.hostel.database.pojo.MessFeeReminder;
import com.adept.ims.hostel.service.MessFeeReminderService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MessFeeReminderServiceImpl implements MessFeeReminderService {

    private static Log log = LogFactory.getLog(MessFeeReminderServiceImpl.class);
    private MessFeeReminderDAO dao;

    public void setMessFeeReminderDAO(MessFeeReminderDAO dao) {
        this.dao = dao;
    }

    public List<MessFeeReminder> getAll() {
        return dao.getAll();
    }

    public MessFeeReminder get(long messfeereminderId) {
        MessFeeReminder messfeereminder = dao.get(messfeereminderId);

        if (messfeereminder == null) {
            log.warn("MessFeeReminderId '" + messfeereminderId + "' not found in database.");
        }

        return messfeereminder;
    }

    public MessFeeReminder save(MessFeeReminder messfeereminder) {
        dao.save(messfeereminder);

        return messfeereminder;
    }

    public void remove(long messfeereminderId) {
        if (dao.get(messfeereminderId) != null) {
            dao.remove(messfeereminderId);
        }
    }

    public List<MessFeeReminder> getByName(String name) {
        return dao.getByName(name);
    }

    public void update(MessFeeReminder messfeereminder) {
        dao.update(messfeereminder);
    }

    public List<MessFeeReminder> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<MessFeeReminder> getByOperator(MessFeeReminder messfeereminder, String operator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

}
