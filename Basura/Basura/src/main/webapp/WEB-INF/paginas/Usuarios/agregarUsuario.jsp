<div class="modal fade" id="agregarUsuarioModal" tabindex="-1" role="dialog" aria-labelledby="agregarUsuarioModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="agregarUsuarioModalLabel">Añadir Usuario</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>

            <div class="modal-body">
                <form action="${pageContext.request.contextPath}/ServletControlador?accion=agregarUsuario"
                      method="POST" class="was-validated text-center col-10 mx-auto">
                    <input type="text" name="usuario" placeholder="Usuario" class="inputValue form-control" required>
                    <br> <br>
                    <input type="password" name="password" placeholder="Contraseña"  class="inputValue form-control" required>
                    <br> <br>
                    <input type="email" name="contacto" placeholder="Contacto" class="inputValue form-control" required>
                    <br> <br>
                    <label>NIVEL</label>


                    <select name="nivel" class="form-control mb-2">
                        <option>--Selecciona una opción--</option>
                        <option value="Administrador">Administrador</option>
                        <option value="Vendedor">Vendedor</option>
                    </select>
                    <button class="btn btn-dark mt-2" type="submit">CONFIRMAR</button>

                </form>
            </div>
        </div>
    </div>
</div>