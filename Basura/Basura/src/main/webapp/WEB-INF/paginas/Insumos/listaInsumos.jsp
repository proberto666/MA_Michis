<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"/>
<section id="Insumos">
    <div class="container col-md-11" style="margin-top: 20px; ">
        <div class="row">
            <div class="col-md-12" >
                <table class="table thead-light" style="border-color:  ">

                    <thead class="titleTable text-center">
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">Color</th>
                            <th scope="col">Proveedor</th>
                            <th scope="col">Cantidad</th>
                            <th scope="col">Costo</th>
                            <th scope="col"></th>
                            <th scope="col"></th>
                        </tr>
                    </thead>

                    <tbody class="text-center">
                        <c:forEach var="insumo" items="${listInsumos}" varStatus="status">
                            <tr class="elementTable">
                                <th scope="row">${insumo.idInsumo}</th>
                                <td>${insumo.nombre}</td>
                                <td>${insumo.color}</td>
                                <td>${insumo.proveedor}</td>
                                <td>${insumo.cantidad} (m)</td>
                                <td>$ ${insumo.costo}</td>
                                <td><a class="pl-1 pr-1 text-dark btn" href="${pageContext.request.contextPath}/ServletControlador?accion=editarInsumo&idInsumo=${insumo.idInsumo}">
                                        <i class="fas fa-pen"></i>
                                    </a>
                                </td>
                                <td>
                                    <a class="pl-1 pr-1 text-dark btn" href="${pageContext.request.contextPath}/ServletControlador?accion=eliminarInsumo&idInsumo=${insumo.idInsumo}">
                                        <i class="fas fa-trash"></i>
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>

                </table>
            </div>

            <a href="#" class="btn float text-white" style="background-color: #eb332c; border-radius: 50%;
               "data-toggle="modal" data-target="#agregarInsumoModal">
                <i class="fas fa-plus fa-2x mt-2"></i>
            </a>
        </div>
    </div>

</section>
<jsp:include page="./agregarInsumo.jsp"/>