<%-- 
    Document   : index
    Created on : 8/10/2021, 12:05:16 PM
    Author     : Mariroco
--%>

<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Datos personales</h1>
        <form name="formPersonal" action="laborales.jsp">
            <table>
                <tr>
                    <td>Nombre:</td>
                    <td>
                        <input type="text" name="nombre"/>
                    </td>
                </tr>
                <tr>
                    <td>Direccion: </td>
                    <td>
                        <input type="text" name="direccion"/>
                    </td>
                </tr>
                <tr>
                    <td>Teléfono: </td>
                    <td>
                        <input type="text" name="telefono"/>
                    </td>
                </tr>
            </table>
            <br>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
