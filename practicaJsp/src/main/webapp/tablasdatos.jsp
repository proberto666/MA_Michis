<%-- 
    Document   : tablasdatos
    Created on : 8/10/2021, 12:23:38 PM
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
        <h1>DATOS</h1>
        <table style="border-spacing: 25px">
            <tr>
                <td style="vertical-align: top;">
                    <table>
                        <tr>
                            <th>PERSONALES</th>
                        </tr>
                        <tr>
                            <td>Nombre: </td>
                            <td>${"Mariela Rocha"}</td>
                        </tr>
                        <tr>
                            <td>Direccion: </td>
                            <td>${"Dir. Placehold #101"}</td>
                        </tr>
                        <tr>
                            <td>Telefono: </td>
                            <td>${"1234567890"}</td>
                        </tr>
                    </table>
                </td>
                
                <td style="vertical-align: top;">
                    <table>
                        <tr>
                            <th>LABORALES</th>
                        </tr>
                        <tr>
                            <td>Tecnologias: </td>
                            <td>
                                <u>
                                    <li>Java</li>
                                    <li>kotlin</li>
                                    <li>c++</li>
                                </u>
                            </td>
                        </tr>
                        <tr>
                            <td>Experiencia </td>
                            <td>${"X años"}</td>
                        </tr>
                    </table>
                </td>
                
                <td style="vertical-align: top">
                    <table>
                        <tr>
                            <th>CONYUGALES</th>
                        </tr>
                        <tr>
                            <td>Estado civil: </td>
                            <td>${"soltero(a)"}</td>
                        </tr>
                     </table>
                </td>
                
            </tr>
        </table>
            
        
            
        
    </body>
</html>
