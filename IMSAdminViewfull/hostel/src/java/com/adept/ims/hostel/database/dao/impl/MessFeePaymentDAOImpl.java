
package com.adept.ims.hostel.database.dao.impl;

import com.adept.ims.hostel.database.dao.MessFeePaymentDAO;
import com.adept.ims.hostel.database.pojo.MessFeePayment;
import java.util.List;

public class MessFeePaymentDAOImpl extends HostelModuleDAOImpl implements MessFeePaymentDAO {

    @Override
    public MessFeePayment get(long messfeepaymentId) {
        return (MessFeePayment) super.get(messfeepaymentId);
    }

    public List<MessFeePayment> getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void save(MessFeePayment messfeepayment) {
        super.save(messfeepayment);
    }

    public void update(MessFeePayment messfeepayment) {
        super.update(messfeepayment);
    }

}
