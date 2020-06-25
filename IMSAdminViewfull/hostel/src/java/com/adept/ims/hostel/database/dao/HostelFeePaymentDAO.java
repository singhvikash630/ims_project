
package com.adept.ims.hostel.database.dao;

import com.adept.ims.hostel.database.pojo.HostelFeePayment;
import java.util.List;
import java.util.Map;

public interface HostelFeePaymentDAO extends HostelModuleDAO {

    public HostelFeePayment get(long hostelfeepaymentId);

    public HostelFeePayment get(String hostelfeepaymentId);

    public List<HostelFeePayment> getAll();

    public List<HostelFeePayment> getByFilter(String filter, String value);

    public List<HostelFeePayment> getById(long id);

    public List<HostelFeePayment> getByOperator(String operator, Map<String, String> queryMap);

    public void remove(long hostelfeepaymentId);

    public void save(HostelFeePayment hostelfeepayment);

    public void update(HostelFeePayment hostelfeepayment);

}
