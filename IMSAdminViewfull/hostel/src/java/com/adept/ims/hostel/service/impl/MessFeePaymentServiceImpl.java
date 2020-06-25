package com.adept.ims.hostel.service.impl;

import java.util.List;

 
import com.adept.ims.hostel.database.dao.MessFeePaymentDAO;
import com.adept.ims.hostel.database.pojo.MessFeePayment;
import com.adept.ims.hostel.service.MessFeePaymentService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MessFeePaymentServiceImpl implements MessFeePaymentService {

    private static Log log = LogFactory.getLog(MessFeePaymentServiceImpl.class);
    private MessFeePaymentDAO messFeePaymentDAO;

    public void setMessFeePaymentDAO(MessFeePaymentDAO messFeePaymentDAO) {
        this.messFeePaymentDAO = messFeePaymentDAO;
    }

    public List<MessFeePayment> getAll() {
        return messFeePaymentDAO.getAll();
    }

    public MessFeePayment get(long messfeepaymentId) {
        MessFeePayment messfeepayment = messFeePaymentDAO.get(messfeepaymentId);

        if (messfeepayment == null) {
            log.warn("MessFeePaymentId '" + messfeepaymentId + "' not found in database.");
        }

        return messfeepayment;
    }

    public MessFeePayment save(MessFeePayment messfeepayment) {
        messFeePaymentDAO.save(messfeepayment);

        return messfeepayment;
    }

    public void remove(long messfeepaymentId) {
        if (messFeePaymentDAO.get(messfeepaymentId) != null) {
            messFeePaymentDAO.remove(messfeepaymentId);
        }
    }

    public List<MessFeePayment> getByName(String name) {
        return messFeePaymentDAO.getByName(name);
    }

    public void update(MessFeePayment messfeepayment) {
        messFeePaymentDAO.update(messfeepayment);
    }

    public List<MessFeePayment> getByFilter(String filter, String value) {
        return messFeePaymentDAO.getByFilter(filter, value);
    }

    public List<MessFeePayment> getByOperator(MessFeePayment messfeepayment, String operator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
