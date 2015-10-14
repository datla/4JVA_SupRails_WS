package com.supinfo.suprails.web.servlet;

import com.supinfo.suprails.entity.Customer;
import com.supinfo.suprails.entity.CustomerOrder;
import com.supinfo.suprails.entity.Trip;
import com.supinfo.suprails.service.CustomerOrderService;
import com.supinfo.suprails.service.TripService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.jms.JMSException;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guillaume
 */

@WebServlet(name = "BookTripServlet", urlPatterns = {"/trips/book"})
public class BookTripServlet extends HttpServlet {

    @EJB
    private TripService tripService;
    
    @EJB
    private CustomerOrderService customerOrderService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //get trip id
        String idTrip = req.getParameter("id");
        
        //search for the trip with the id
        Trip myTrip = tripService.findTripById(Long.parseLong(idTrip));
        
        //put the trip as attribute
        req.setAttribute("trip", myTrip);
        
        req.getRequestDispatcher("/jsp/bookTrip.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String firstName = req.getParameter("firstname");
            String lastName = req.getParameter("lastname");
            String email = req.getParameter("email");
            String tripId = req.getParameter("id");
            
            CustomerOrder myOrder = new CustomerOrder();
            myOrder.setCustomer(new Customer(firstName, lastName, email));
            myOrder.setTrip(tripService.findTripById(Long.parseLong(tripId)));
            
            customerOrderService.processCustomerOrder(myOrder);
            
            resp.sendRedirect(req.getContextPath());
        
    }
    
}
