<section id="login">

    <div class="row">
        <div class="col-4 pt-3 pb-5 container">
            <form>
                <div class="col-12 p-1">
                    <img src="${pageContext.request.contextPath}/ServletImagenes?load=cargarLogoLogIn" class="img-fluid" alt="logo">
                </div>
                <div class="col-12 text-center">
                    <input type="text" class="form-control mt-3" placeholder="usuario" id="txtUsuario">
                    <input type="password" class="form-control mt-3" placeholder="contraseña" id="txtPassword">
                    <a  class="btn bgBlack text-white mt-3" href="${pageContext.request.contextPath}/ServletControlador?accion=abrirProductos">INICIAR SESION</a>
                </div>
            </form>
        </div>
    </div>

</section>
