
package com.adept.ims.hostel.database.dao.impl;

import com.adept.ims.hostel.database.dao.MessFeeReminderDAO;
import com.adept.ims.hostel.database.pojo.MessFeeReminder;
import java.util.List;

public class MessFeeReminderDAOImpl extends HostelModuleDAOImpl implements MessFeeReminderDAO {

    @Override
    public MessFeeReminder get(long messfeereminderId) {
        return (MessFeeReminder) super.get(messfeereminderId);
    }

    public List<MessFeeReminder> getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void save(MessFeeReminder messfeereminder) {
        super.save(messfeereminder);
    }

    public void update(MessFeeReminder messfeereminder) {
        super.update(messfeereminder);
    }

}
