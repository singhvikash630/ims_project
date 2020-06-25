
package com.adept.ims.hostel.database.dao.impl;
import com.adept.ims.hostel.database.dao.HostelFeePaymentDAO;
import com.adept.ims.hostel.database.pojo.HostelFeePayment;
import java.util.List;

public class HostelFeePaymentDAOImpl extends HostelModuleDAOImpl implements HostelFeePaymentDAO {

    @Override
    public HostelFeePayment get(long hostelfeepaymentId) {
        return (HostelFeePayment) super.get(hostelfeepaymentId);
    }

    public HostelFeePayment get(String hostelfeepaymentId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*public List<HostelFeePayment> getByName(String name) {
    return getByFilter("hostelName", name);
    }*/

    public void save(HostelFeePayment hostelfeepayment) {
        super.save(hostelfeepayment);
    }

    public void update(HostelFeePayment hostelfeepayment) {
        super.update(hostelfeepayment);
    }

    public List<HostelFeePayment> getById(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
