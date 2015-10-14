/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.suprails.service;

import com.supinfo.suprails.dao.CustomerOrderDao;
import com.supinfo.suprails.entity.CustomerOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jms.JMSException;
import javax.naming.NamingException;

/**
 *
 * @author Guillaume
 */

@Stateless
@LocalBean
public class CustomerOrderService {
 
    @EJB
    private CustomerOrderDao customerOrderDao;
    
    @EJB
    private MailService mailService;
    
    @EJB
    private JMService jMService;
    
    public CustomerOrder processCustomerOrder(CustomerOrder customerOrder) {
        
        customerOrderDao.addCustomerOrder(customerOrder);
        mailService.sendAsyncEmail(customerOrder);
        try {
            jMService.printTicket(customerOrder);
        } catch (NamingException ex) {
            Logger.getLogger(CustomerOrderService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JMSException ex) {
            Logger.getLogger(CustomerOrderService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return customerOrder;
    }
    
}
