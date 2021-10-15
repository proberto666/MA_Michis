<!DOCTYPE html>
<%@ page import="beans.habitacion" %>
<html>
    <head>
        <title>Consulta habitaciones disponibles</title>
        <link rel="stylesheet" type="text/css" href="estilos.css">
    </head>
    <body>
        <jsp:useBean id="hotel" class="beans.hotel" scope="application"/>
         <label class="tituloHotel"> Hotel MLLC</label>
        <h1 class="subtitulo">Habitaciones disponibles</h1>
        <table>
        <%
        for(habitacion H:hotel.getHotel()){
            if(H.getDisponible()){
        %>
        <td class="noreservada"><%=H.getNumero()%></td>
        <% }else{ %>
        <td class="reservada"> <%= H.getNumero()%></td>
        <% } } %>
        </table>
        <br>
        <a href="index.jsp">Regresar al menu principal</a>
    </body>
</html>