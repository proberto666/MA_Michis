<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Basura - Editar Usuario</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="styles.css">

        <script src="https://kit.fontawesome.com/ab66b3d3f7.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <jsp:include page="/WEB-INF/paginas/Comunes/header.jsp"/>
        <div class="container text-center p-4">
            <form action="#"
                method="POST" class="col-4 mx-auto">
                <h1 class="text-center">Editar Usuario</h1> </br>
                <input type="text" placeholder="Usuario" class="inputValue form-control" value="${usuario.usuario}" required>
                <br> <br>
                <input type="password" placeholder="Contraseña" value="${usuario.password}" class="inputValue form-control" required>
                <br> <br>
                <input type="email" placeholder="Contacto" value="${usuario.contacto}" class="inputValue form-control" required>
                <br> <br>
                <label>NIVEL</label>
                <select class="form-control mb-2" value="${usuario.nivel}">
                    <option>--Selecciona una opción--</option>
                    <option value="Administrador">Administrador</option>
                    <option value="Vendedor">Vendedor</option>
                </select>
                <a class="btn btn-dark mt-2" href="${pageContext.request.contextPath}/ServletControlador?accion=abrirUsuarios" >Cancelar</a>
                <button class="btn btn-dark mt-2" type="submit" data-dismiss="modal">CONFIRMAR</button>
            </form>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>        
    </body>
</html>