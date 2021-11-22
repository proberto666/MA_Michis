<section id="Insumos">
        <div class="container-fluid"  style="margin-top: 20px;">
        <table class="table table-borderless">
            <thead bgcolor="eb332c" style="color:white">
              <tr>
                <th scope="col">ID</th>
                <th scope="col">Nombre</th>
                <th scope="col">Color</th>
                <th scope="col">Proveedor</th>
                <th scope="col">Cantidad</th>
                <th scope="col">Costo</th>
                <th scope="col"></th>
              </tr>
            
            </thead>
            <tbody>
              <tr>
                <th scope="row">1</th>
                <td>Tela</td>
                <td>Rojo</td>
                <td>N/A</td>
                <td>01</td>
                <td>N/A</td>
                <td><a class="pl-1 pr-1 text-dark btn" href="#">
                    <i class="fas fa-pen"></i>
                </a>
                <a class="pl-1 pr-1 text-dark btn" href="#">
                    <i class="fas fa-trash"></i>
                </a></td>
              </tr>     
            </tbody>        
        </table>
        </div>
    
        <a href="#" class="btn float text-white" style="background-color: #eb332c; border-radius: 50%;
            "data-toggle="modal" data-target="#agregarInsumoModal">
            <i class="fas fa-plus fa-2x mt-2"></i>
        </a>
        
        
</section>
<jsp:include page="./agregarInsumo.jsp"/>