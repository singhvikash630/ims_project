
package com.adept.ims.hostel.database.dao.impl;

import com.adept.ims.hostel.database.dao.HostelFeeReminderDAO;
import com.adept.ims.hostel.database.pojo.HostelFeeReminder;
import java.util.List;

public class HostelFeeReminderDAOImpl extends HostelModuleDAOImpl implements HostelFeeReminderDAO {
    
    @Override
    public HostelFeeReminder get(long hostelfeereminderId) {
        return (HostelFeeReminder) super.get(hostelfeereminderId);
    }

    public HostelFeeReminder get(String hostelfeereminderId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*public List<HostelFeeReminder> getByName(String name) {
    return getByFilter("hostelName", name);
    }*/

    public void save(HostelFeeReminder hostelfeereminder) {
        super.save(hostelfeereminder);
    }

    public void update(HostelFeeReminder hostelfeereminder) {
        super.update(hostelfeereminder);
    }

    public List<HostelFeeReminder> getById(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
