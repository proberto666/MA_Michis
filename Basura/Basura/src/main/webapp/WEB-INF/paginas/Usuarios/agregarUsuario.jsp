<div class="modal fade" id="agregarUsuarioModal" tabindex="-1" role="dialog" aria-labelledby="agregarUsuarioModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="agregarUsuarioModalLabel">A�adir Usuario</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
        <form action="${pageContext.request.contextPath}/ServletControlador?accion=abrirProductos"
                  method="POST" class="was-validated">
      <div class="modal-body">
            <div class="modal-body" style="text-align: left;">
               <input type="text" placeholder="Usuario" class="inputValue form-control" required>
                <br> <br>
                <input type="password" placeholder="Contrase�a"  class="inputValue form-control" required>
                <br> <br>
                <input type="email" placeholder="Contacto" class="inputValue form-control" required>
                <br> <br>
                <label>NIVEL</label>

                
                <select class="form-control">
                    <option>Administrador</option>
                    <option>Vendedor</option>
                    <option>No se :)</option>
                </select>
            </div>
        </div>
        <div class="modal-footer">
          <button class="btn btn-dark" type="submit" data-dismiss="modal">CONFIRMAR</button>

        </div>
      </form>
    </div>
  </div>
</div>