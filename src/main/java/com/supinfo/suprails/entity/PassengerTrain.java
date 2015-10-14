package com.supinfo.suprails.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Guillaume
 */

@Entity
@DiscriminatorValue("passenger")
public class PassengerTrain extends Train implements Serializable {
    
    private Integer seatQuantity;

    public Integer getSeatQuantity() {
        return seatQuantity;
    }

    public void setSeatQuantity(Integer seatQuantity) {
        this.seatQuantity = seatQuantity;
    }
    
}
