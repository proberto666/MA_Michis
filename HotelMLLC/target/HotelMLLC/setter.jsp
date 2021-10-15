<!DOCTYPE html>
<html>
    <head>
        <title>Nueva Reservacion</title>
        <link rel="stylesheet" type="text/css" href="estilos.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <label class="tituloHotel"> Hotel MLLC</label>
        <h1 class="subtitulo">Seleccionar habitacion</h1>
        <form action="confirmacion.jsp">
            <select class="select" name="habitaciones" id="select_habitaciones">
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
            
            <input class="btn btn-outline-info" type="submit" value="Enviar"/>
        </form>
        </br>
    </body>
</html>