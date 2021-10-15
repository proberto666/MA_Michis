<!DOCTYPE html>
<%@ page import="beans.habitacion" %>
<html>
    <head>
        <title>Confirmacionn Reservacionn</title>
        <link rel="stylesheet" type="text/css" href="estilos.css">
    </head>
    <body>
        <jsp:useBean id="hotel" class="beans.hotel" scope="application"/>
        <label class="tituloHotel"> Hotel MLLC</label>
        <%    
            int numHabitacion = Integer.parseInt(request.getParameter("habitaciones"));
            habitacion aux= hotel.getHabitacion(numHabitacion-1); 
            if(aux.getDisponible()){
                aux.setDisponible(false);
        %>
        <h1 class="subtitulo">Habitacion reservada con exito</h1>
         <% } else { %>
            <h1 class="subtitulo">La habitacion seleccionada no esta disponible :(</h1>
         <%}%>
         <a href="index.jsp">Volver al menu principal</a>
         <br>
         <a href="getter.jsp">Ver habitaciones</a>
    </body>
</html>