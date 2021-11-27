<section id="login">

    <div class="row">
        <div class="col-4 pt-3 pb-5 container">

            <div class="col-8 container p-1">
                <img src="${pageContext.request.contextPath}/ServletImagenes?load=cargarImgPNG&ImgName=logoLI.png" class="img-fluid" alt="logo">
            </div>
            <div class="col-12 text-center">
                <form action="${pageContext.request.contextPath}/ServletControlador?accion=Login" method="POST">
                    <input type="text" name="usuario" class="form-control mt-3" placeholder="usuario" id="txtUsuario">
                    <input type="password" name="password" class="form-control mt-3" placeholder="contraseña" id="txtPassword">
                    <input type="submit" value="INICIAR SESION" class="btn text-white bgBlack mt-3">
                </form>
            </div>

        </div>
    </div>

</section>
