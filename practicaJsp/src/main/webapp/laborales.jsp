<%-- 
    Document   : laborales
    Created on : 8/10/2021, 12:20:02 PM
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
        <h1>Datos laborales</h1>
        <form name="formLaboral" action="conyugales.jsp">
            <table  style="border-spacing: 25px">
                <tr>
                    <td style="vertical-align: top;">
                        <table>
                           <tr>
                               <th>TECNOLOGIA</th>
                           </tr>
                           <tr>
                               <td>
                                   .NET<input type="checkbox" name="net" value="1">
                                   <br>
                                   JAVA<input type="checkbox" name="java" value="2"><br>
                                   JAVASCRIPT<input type="checkbox" name="javascript" value="3"><br>
                                   HTML<input type="checkbox" name="html" value="4"><br>
                                   KOTLIN<input type="checkbox" name="kotlin" value="5"><br>
                                   C++<input type="checkbox" name="cplusplus" value="6"><br>
                                   C#<input type="checkbox" name="csharp" value="7"><br>
                               </td>
                           </tr>
                       </table>
                    </td>
                    <td style="vertical-align: top;">
                        <table>
                            <tr>
                                <th>
                                    AÑOS DE EXPERIENCIA
                                </th>
                            </tr>
                            <tr>
                                <td>
                                    <select name="años" multiple class="default">
                                        <option value="1">0-3</option>
                                        <option value="2">4-7</option>
                                        <option value="3">8-11</option>
                                        <option value="4">11+</option>
                                    </select>
                                </td>
                            </tr>
                            
                        </table>
                    </td>
                </tr>
            </table>
            <br>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
