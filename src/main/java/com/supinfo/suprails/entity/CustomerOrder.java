package com.supinfo.suprails.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import com.supinfo.suprails.entity.Customer;
import com.supinfo.suprails.entity.Trip;

/**
 *
 * @author Guillaume
 */
@Entity
@XmlRootElement
public class CustomerOrder {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Embedded
    private Customer customer;
    
    @OneToOne
    private Trip trip;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }    
}
