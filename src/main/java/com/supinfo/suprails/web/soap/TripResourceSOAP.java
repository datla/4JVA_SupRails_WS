package com.supinfo.suprails.web.soap;

import com.supinfo.suprails.entity.Trip;
import com.supinfo.suprails.service.TripService;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author gbalas
 */
@WebService
public class TripResourceSOAP {

    @EJB
    TripService tripService;

    @WebMethod
    public List<Trip> getAllTrips() {
        return tripService.getAllTrips();
    }

}
