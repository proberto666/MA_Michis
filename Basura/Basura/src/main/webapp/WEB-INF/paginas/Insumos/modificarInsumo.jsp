<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Basura - Editar Insumo</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="styles.css">

        <script src="https://kit.fontawesome.com/ab66b3d3f7.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <jsp:include page="/WEB-INF/paginas/Comunes/header.jsp"/>
        <div class="container text-center p-4">
           
            <form class="col-4 mx-auto" action="#"
                method="POST" class="was-validated">
                <h1 class="text-center">Editar Insumo</h1> </br>
                <input type="text" placeholder="Nombre" value="${insumo.nombre}" class="inputValue form-control" required>
                <br> <br>
                <input type="text" placeholder="Color" value="${insumo.color}" class="inputValue form-control" required>
                <br> <br>
                <input type="text" placeholder="Proveedor" value="${insumo.proveedor}" class="inputValue form-control" required>
                <br> <br>
                <label>Cantidad</label>
                <input type="number" placeholder="0" value="${insumo.cantidad}" class="inputValue form-control" required>
                <br> <br>
                <label>Costo</label>
                <input type="number" placeholder="0" value="${insumo.costo}" class="inputValue form-control" required>
                <br> <br>
                
                <a class="btn btn-dark" href="${pageContext.request.contextPath}/ServletControlador?accion=abrirInsumos" >Cancelar</a>
                <button class="btn btn-dark" type="submit" >CONFIRMAR</button>
                
            </form>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>        
    </body>
</html>