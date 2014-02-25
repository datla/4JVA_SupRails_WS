<%-- 
    Document   : bookTrip
    Created on : 12 mars 2013, 15:47:54
    Author     : Guillaume
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Book a trip : </h1>

        <p>Trip details :
            Departure Station : ${trip.departureStation.name}
            Arrival Station : ${trip.arrivalStation.name}
            Price : ${trip.price}        
        </p>

        <form method="POST">
            <div>
                <label for="firstname">Firstname</label>
                <input type="text" id="firstname" name="firstname" />
            </div>
            <div>
                <label for="lastname">Lastname</label>
                <input type="text" id="lastname" name="lastname" />
            </div>
            <div>
                <label for="email">Email</label>
                <input type="text" id="email" name="email" />
            </div>
            <input type="hidden" id="id" name="id" value="${trip.id}" />
            <div>
                <input type="submit" value="Book this trip" />
            </div>
        </form>

    </body>
</html>
