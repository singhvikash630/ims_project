package com.adept.ims.hostel.service.impl;



import com.adept.ims.hostel.database.dao.HostelFeePaymentDAO;
import com.adept.ims.hostel.database.pojo.HostelFeePayment;
import com.adept.ims.hostel.service.HostelFeePaymentService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Collection;
import java.util.List;

public class HostelFeePaymentServiceImpl implements HostelFeePaymentService {

    private static Log log = LogFactory.getLog(HostelFeePaymentServiceImpl.class);
    private HostelFeePaymentDAO dao;
    private String hostelFeePaymentId;
    private HostelFeePayment hostelfeeapayment;

    public void setHostelFeePaymentDAO(HostelFeePaymentDAO dao) {
        this.dao = dao;
    }

    public List<HostelFeePayment> getAll() {
       return dao.getAll();
    }

    public HostelFeePayment get(long HostelFeePaymentId) {
        HostelFeePayment hostelFeePayment = dao.get(hostelFeePaymentId);

        if (hostelFeePayment == null) {
            log.warn("HostelFeePaymentId '" + hostelFeePaymentId + "' not found in database.");
        }

        return hostelFeePayment;
    }

    public HostelFeePayment save(HostelFeePayment hostelFeePayment) {
         dao.save(hostelFeePayment);

        return hostelFeePayment;
    }

    public void update(HostelFeePayment hostelFeePayment) {
        dao.update(hostelfeeapayment);
    }

    public void remove(long hostelFeePaymentId) {
         if (dao.get(hostelFeePaymentId) != null) {
            dao.remove(hostelFeePaymentId);
        }
    }

    public List<HostelFeePayment> getById(long id) {
        return dao.getById(id);
    }

    public List<HostelFeePayment> getByFilter(String filter, String value) {
        return dao.getByFilter(filter, value);
    }

    public List<HostelFeePayment> getByOperator(HostelFeePayment hostelfeepayment, String operator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   



   

    

}
