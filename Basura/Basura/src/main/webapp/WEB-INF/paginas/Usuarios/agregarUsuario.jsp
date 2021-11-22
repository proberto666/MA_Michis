<div class="modal fade" id="agregarUsuarioModal">
      <div class="modal-dialog">
        <div class="modal-content">
           
             <div>
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>
            <form action="${pageContext.request.contextPath}/ServletControlador?accion=abrirProductos"
                  method="POST" class="was-validated">
                
                <div class="modal-body" style="text-align: center">
                    <input type="text" placeholder="Usuario" class="inputValue" required>
                    <br> <br>
                    <input type="password" placeholder="Contraseña"  class="inputValue" required>
                    <br> <br>
                    <input type="email" placeholder="Contacto" class="inputValue" required>
                    <br> <br>
                     <label style=" text-align: start!important;padding-left: 25px;">NIVEL</label>

                    <div class="caja">
                        <select>
                            <option>Administrador</option>
                            <option>Vendedor</option>
                            <option>No se :)</option>
                        </select>
                    </div>
                
                    <button class="btn btn-dark" type="submit">CONFIRMAR</button>
                </div>    
            </form>
                   
        </div>
    </div>
</div>
   </div> 