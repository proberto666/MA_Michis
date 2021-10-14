<!DOCTYPE html>
<%@ page import="beans.habitacion" %>
<html>
    <head>
        <title>
            Consulta habitaciones disponibles
        </title>
    </head>
    <body>
        <jsp:useBean id="hotel" class="beans.hotel" scope="application"/>
        <h1>Habitaciones disponibles</h1>
        <table>
        <%
        for(habitacion H:hotel.getHotel()){
            if(H.getDisponible()){
        %>
        <td>o</td>
        <% }else{ %>
        <td>x</td>
        <% } } %>
        </table>
    </body>
</html>