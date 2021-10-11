<!DOCTYPE html>
<html>
    <head>
        <title>
            Confirmación Reservación
        </title>
    </head>
    <body>
        <%
            int numHabitacion = Integer.parseInt(request.getParameter("habitaciones"));
            boolean flag = false;
            if(flag){
        %>
       
        <h1>Habitación reservada con exito</h1>
         <% } else { %>
            <h1>La habitación seleccionada no esta disponible :(</h1>
         <%}%>
            
        
    </body>
</html>