/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.suprails.service;

import com.supinfo.suprails.entity.CustomerOrder;
import java.util.concurrent.Future;
import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Guillaume
 */
@Stateless
@LocalBean
public class MailService {
    
    @Asynchronous
    public Future<Boolean> sendAsyncEmail(CustomerOrder order) {
        sendEmail(order);
        return new AsyncResult<Boolean>(true);
    }
    
    private void sendEmail(CustomerOrder order) {
       System.out.println("Sending mail....");
    }
    
}
