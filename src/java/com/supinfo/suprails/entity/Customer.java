package com.supinfo.suprails.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Guillaume
 */
@Embeddable
public class Customer implements Serializable {
    
    private String firstName;
    private String lastName;
    private String email;

    public Customer() {
    }
    
    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
