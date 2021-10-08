<%-- 
    Document   : conyugales
    Created on : 8/10/2021, 12:20:33 PM
    Author     : Mariroco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos conyugales</h1>
        <form name="formConyugal" action="/practicaJsp/DatosServlet">
            <div>
                <input type="radio" id="soltero" name="estado" value="soltero">
                <label for="soltero">Soltero(a)</label><br>
                <input type="radio" id="casado" name="estado" value="casado">
                <label for="casado">Casado(a)</label><br>
                <input type="radio" id="union" name="estado" value="union">
                <label for="union">Union libre</label><br>
              </div>
            <br>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
