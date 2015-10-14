
package com.supinfo.suprails.web.rest;

import com.supinfo.suprails.entity.CustomerOrder;
import com.supinfo.suprails.entity.TrainStation;
import com.supinfo.suprails.entity.Trip;
import com.supinfo.suprails.service.CustomerOrderService;
import com.supinfo.suprails.service.TrainStationService;
import com.supinfo.suprails.service.TripService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author Guillaume
 */

@Stateless
@Path("/rest")
public class TripResourceREST {
    
    @EJB
    TripService tripService;
    
    @EJB
    TrainStationService trainStationService;
    
    @EJB
    CustomerOrderService customerOrderService;

    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/trips")
    public List<Trip> getAllTrips() {
        return tripService.getAllTrips();
    }

    @GET @Produces(MediaType.APPLICATION_XML)
    @Path("/stations")
    public List<TrainStation> getAllTrainStations() {
        return trainStationService.getAllTrainStations();
    }
    
   @POST @Consumes(MediaType.APPLICATION_XML)
   @Path("/addstation")
   public void addTrainStation(TrainStation trainStation) {      
       trainStationService.addTrainStation(trainStation);       
   }
   
   @POST @Consumes(MediaType.APPLICATION_XML)
   @Path("/processCustomerOrder")
   public void processCustomerOrder(CustomerOrder customerOrder) {      
      customerOrderService.processCustomerOrder(customerOrder);
   }

    
}
