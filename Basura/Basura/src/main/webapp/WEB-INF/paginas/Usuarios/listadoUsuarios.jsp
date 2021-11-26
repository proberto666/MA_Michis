<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"/>
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
                                <th> </th>
                            </tr>
                        </thead>
            
                        <tbody class="text-center">
                            <c:forEach var="usuario" items="${listUsuarios}" varStatus="status">
                                <tr class="elementTable">
                                    <td>${usuario.usuario}</td>
                                    <td>*****</td>
                                    <td> ${usuario.contacto}</td>
                                    <td> ${usuario.nivel}</td>
                                    <td>
                                        <a class="pl-1 pr-1 text-dark btn" href="${pageContext.request.contextPath}/ServletControlador?accion=editarUsuario&idUsuario=${usuario.idUsuario}">
                                            <i class="fas fa-pen"></i>
                                        </a>
                                    </td>
                                    <td>
                                        <a class="pl-1 pr-1 text-dark btn" href="${pageContext.request.contextPath}/ServletControlador?accion=eliminarUsuario&idUsuario=${usuario.idUsuario}">
                                            <i class="fas fa-trash"></i>
                                        </a>
                                    </td>
                                </tr>
                           </c:forEach>
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
