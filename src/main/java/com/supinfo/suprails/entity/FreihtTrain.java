package com.supinfo.suprails.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Guillaume
 */

@Entity
@DiscriminatorValue("freiht")
public class FreihtTrain extends Train implements Serializable {
    
    private Long maxWeight;

    public Long getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Long maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    
}
