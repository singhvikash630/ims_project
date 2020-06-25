
package com.adept.ims.hostel.database.dao;

import com.adept.ims.hostel.database.pojo.HostelFeeReminder;
import java.util.List;

public interface HostelFeeReminderDAO extends HostelModuleDAO  {

    public HostelFeeReminder get(long hostelfeereminderId);

    public HostelFeeReminder get(String hostelfeereminderId);

    public List<HostelFeeReminder> getAll();

    public List<HostelFeeReminder> getByFilter(String filter, String value);

    public List<HostelFeeReminder> getById(long id);

    public void remove(long hostelfeereminderId);

    public void save(HostelFeeReminder hostelfeereminder);

    public void update(HostelFeeReminder hostelfeereminder);


}
