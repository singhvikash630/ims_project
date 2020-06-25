
package com.adept.ims.hostel.database.dao;

import com.adept.ims.hostel.database.pojo.MessFeeReminder;
import java.util.List;

public interface MessFeeReminderDAO extends HostelModuleDAO {

    public MessFeeReminder get(long messfeereminderId);

    public List<MessFeeReminder> getAll();

    public List<MessFeeReminder> getByFilter(String filter, String value);

    public List<MessFeeReminder> getByName(String name);

    public void remove(long messfeereminderId);

    public void save(MessFeeReminder messfeereminder);

    public void update(MessFeeReminder messfeereminder);

}
