/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.suprails.dao.jpa;

import com.supinfo.suprails.dao.CustomerOrderDao;
import com.supinfo.suprails.entity.CustomerOrder;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Guillaume
 */
@Stateless
public class JpaCustomerOrderDao implements CustomerOrderDao {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public CustomerOrder addCustomerOrder(CustomerOrder customerOrder) {
        em.persist(customerOrder);
        return customerOrder;
    }
    
}
