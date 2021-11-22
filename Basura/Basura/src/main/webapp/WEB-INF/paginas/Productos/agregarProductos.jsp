<div class="modal fade" id="agregarProductoModal" tabindex="-1" role="dialog" aria-labelledby="agregarProductoModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="agregarProductoLabel">Añadir Producto</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
        <form action="${pageContext.request.contextPath}/ServletControlador?accion=abrirProductos"
                  method="POST" class="was-validated">
      <div class="modal-body">
            <div class="modal-body" style="text-align: center;">
                
                <div class="col-8 container">
                 <img class="img-fluid" src="${pageContext.request.contextPath}/ServletImagenes?load=cargarCamara">
                </div>
                 <button class="btn bgBlack text-white mt-3">Añadir Foto</button>
                 <br> <br>
                <input type="text" placeholder="Nombre" class="inputValue form-control" required>
                <br> <br>
                <label>Cantidad</label>
                <input type="number" placeholder="0"  class="inputValue form-control" required>
                <br> <br>
                <label>Precio</label>
                <input type="number" min="1" step="any" placeholder="0" class="inputValue form-control" required>
                <br> <br>
                    
            </div>
        </div>
        <div class="modal-footer">
          <button class="btn btn-dark" type="submit" data-dismiss="modal">CONFIRMAR</button>

        </div>
      </form>
    </div>
  </div>
</div>