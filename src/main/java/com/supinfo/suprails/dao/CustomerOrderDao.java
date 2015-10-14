/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.suprails.dao;

import com.supinfo.suprails.entity.CustomerOrder;
import javax.ejb.Local;

/**
 *
 * @author Guillaume
 */
@Local
public interface CustomerOrderDao {
    CustomerOrder addCustomerOrder(CustomerOrder customerOrder);
}
