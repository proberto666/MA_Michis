<!DOCTYPE html>
<html>
    <head>
        <title>
            JSP Page
        </title>
    </head>
    <body>
        <h1>Seleccionar habitación</h1>
        <jsp:useBean id="habitacion" class="beans.habitacion" scope="application"/>
        <form action="confirmacion.jsp">
            <select class="form-control" name="habitaciones" id="select_habitaciones">
                <option value="">--Seleccione una habitacion--</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
            </select>
            
            <input type="submit" value="Enviar"/>
        </form>
        </br>
    </body>
</html>