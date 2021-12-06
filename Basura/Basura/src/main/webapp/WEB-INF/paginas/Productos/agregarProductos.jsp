<div class="modal fade" id="agregarProductoModal" tabindex="-1" role="dialog" aria-labelledby="agregarProductoModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="agregarProductoLabel">Añadir Producto</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form action="${pageContext.request.contextPath}/ServletControlador?accion=agregarProducto"
                      method="POST" class="was-validated text-center col-10 mx-auto " enctype="multipart/form-data">
                    
                    
                    <div class="col-8 container">
                        <img class="img-fluid" src="${pageContext.request.contextPath}/ServletImagenes?load=cargarImgPNG">
                    </div>
                    <input type="text" name="img" placeholder="URL de la imagen" class="inputValue form-control mt-4" required>
                    <br> <br>
                    <input type="text" name="nombre" placeholder="Nombre" class="inputValue form-control" required>
                    <br> <br>
                    <label>Cantidad</label>
                    <input type="number" name="cantidad" placeholder="0"  class="inputValue form-control" required>
                    <br> <br>
                    <label>Precio</label>
                    <input type="number" name="precio" min="1" step="any" placeholder="0" class="inputValue form-control" required>
                    <br> <br>
                    <button class="btn btn-dark" type="submit" >CONFIRMAR</button>
                </form>
            </div>
        </div>
    </div>
</div>