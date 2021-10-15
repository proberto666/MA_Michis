<!DOCTYPE html>
<html>
    <head>
        <title>Pagina Principal</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css">
    </head>
    <body>
        <jsp:useBean id="hotel" class="beans.hotel" scope="application"/>
        <h1 class="tituloPrincipal">Bienvenido al hotel MLLC</h1>
        <a href="setter.jsp">Nueva reservacion</a>
        <br>
        <a href="getter.jsp">Consultar habitaciones disponibles</a>
    </body>
</html>
