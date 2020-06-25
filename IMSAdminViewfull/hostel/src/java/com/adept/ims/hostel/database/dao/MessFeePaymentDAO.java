
package com.adept.ims.hostel.database.dao;

import com.adept.ims.hostel.database.pojo.MessFeePayment;
import java.util.List;

public interface MessFeePaymentDAO extends HostelModuleDAO {

    public MessFeePayment get(long messfeepaymentId);

    public List<MessFeePayment> getAll();

    public List<MessFeePayment> getByFilter(String filter, String value);

    public List<MessFeePayment> getByName(String name);

    public void remove(long messfeepaymentId);

    public void save(MessFeePayment messfeepayment);

    public void update(MessFeePayment messfeepayment);

}
