<div class="modal fade" id="agregarInsumoModal" tabindex="-1" role="dialog" aria-labelledby="agregarInsumoModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="agregarInsumoModal">Añadir Insumo</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
        <form action="${pageContext.request.contextPath}/ServletControlador?accion=abrirProductos"
                  method="POST" class="was-validated">
      <div class="modal-body" style="text-align: center">
                    <input type="text" name="nombre" placeholder="Nombre" class="inputValue form-control" required>
                    <br> <br>
                    <input type="text" name="color" placeholder="Color"  class="inputValue form-control" required>
                    <br> <br>
                    <input type="text" name="proveedor" placeholder="Proveedor" class="inputValue form-control" required>
                    <br> <br>
                    <label>Cantidad</label>
                    <input type="number" name="cantidad" placeholder="0"  class="inputValue form-control" required>
                    <br> <br>
                    <label>Costo</label>
                    <input type="number" name="costo" placeholder="0"  class="inputValue form-control" required>
                    <br> <br>
                </div>  
        <div class="modal-footer">
          <button class="btn btn-dark" type="submit" data-dismiss="modal">CONFIRMAR</button>
        </div>
      </form>
    </div>
  </div>
</div>