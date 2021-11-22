<section id="usuarios">
   
    <div class="container col-md-11" style="margin-top: 20px; ">
        <div class="row">
            <div class="col-md-12" >
                <table class="table thead-light" >
                   
                    <thead class="titleTable">
                            <tr>
                                <th>USUARIO</th>
                                <th>CONTRASEÑA</th>
                                <th>CONTACTO</th>
                                <th>NIVEL</th>
                                <th> </th>
                            </tr>
                        </thead>
            
                        <tbody>
                                <tr class="elementTable">
                                    <td>Mariroco101</td>
                                    <td style="text-align: start; ">********&nbsp; &nbsp;<i class="fa fa-eye" aria-hidden="true"></td>
                                    <td> mariroco@gmail.com</td>
                                    <td> Administradora</td>
                                    <td><i class="fas fa-pen"></i> <i class="fas fa-trash"></i></td>
                                </tr>
                                <tr class="elementTable">
                                    <td>yareRam0-0</td>
                                    <td style="text-align: start; ">yares:) &nbsp; &nbsp;<i  class="fa fa-eye-slash" aria-hidden="true"></i></td>
                                    <td> yarelirb@gmail.com</td>
                                    <td> Vendedor</td>
                                    <td><i class="fas fa-pen"></i> <i class="fas fa-trash"></i></i></td>
                                </tr>
                        </tbody>
                    </table>
                <a href="#" class="btn float text-white" style="background-color: #eb332c; border-radius: 50%;
                   "data-toggle="modal" data-target="#agregarUsuarioModal">
                    <i class="fas fa-plus fa-2x mt-2"></i>
                </a>
            </div>
        </div>
    </div>

    
    
</section>

<jsp:include page="/WEB-INF/paginas/Usuarios/agregarUsuario.jsp"/>
