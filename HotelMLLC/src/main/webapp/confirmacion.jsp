<!DOCTYPE html>
<%@ page import="beans.habitacion" %>
<html>
    <head>
        <title>
            Confirmación Reservación
        </title>
    </head>
    <body>
        <jsp:useBean id="hotel" class="beans.hotel" scope="application"/>
        <%    
            int numHabitacion = Integer.parseInt(request.getParameter("habitaciones"));
            habitacion aux= hotel.getHabitacion(numHabitacion-1); 
            if(aux.getDisponible()){
                aux.setDisponible(false);
        %>
        <h1>Habitación reservada con exito</h1>
         <% } else { %>
            <h1>La habitación seleccionada no esta disponible :(</h1>
         <%}%>
         <a href="index.jsp">Volver al menú principal</a>
    </body>
</html>