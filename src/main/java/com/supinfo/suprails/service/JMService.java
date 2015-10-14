/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.suprails.service;

import com.supinfo.suprails.entity.CustomerOrder;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Guillaume
 */
@Stateless
@LocalBean
public class JMService {

    public void printTicket(CustomerOrder order) throws NamingException, JMSException {

        Context ctx = new InitialContext();
        ConnectionFactory connectionFactory = (ConnectionFactory) ctx.lookup("jms/GlassFishPrintConnectionFactory");

        Destination destination = (Destination) ctx.lookup("jms/GlassFishPrintQueue");

        Connection cnx = connectionFactory.createConnection();
        Session session = cnx.createSession(false, Session.AUTO_ACKNOWLEDGE);

        MessageProducer producer = session.createProducer(destination);

        String txt = "Ticket : "
                + "\n Departure station : " + order.getTrip().getDepartureStation().getName()
                + " located at " + order.getTrip().getDepartureStation().getCity()
                + "\n Arrival station : " + order.getTrip().getArrivalStation().getName()
                + " located at " + order.getTrip().getArrivalStation().getCity()
                + "\n Price : " + order.getTrip().getPrice()
                + "\n\n Customer info :"
                + "\n Nom : " + order.getCustomer().getLastName()
                + "\n Prénom : " + order.getCustomer().getFirstName() + "\n Email : " + order.getCustomer().getEmail();

        TextMessage message = session.createTextMessage();
        message.setText(txt);

        producer.send(message);
        System.out.println("Sending JMS....");

        cnx.close();

    }
}
