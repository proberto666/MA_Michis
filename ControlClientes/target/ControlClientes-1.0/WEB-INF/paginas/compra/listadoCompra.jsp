<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"/>

<section id="clientes">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Listado de Compras</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>No. Compra</th>
                                <th>No. Cliente</th>
                                <th>Monto</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>                            
                            <!-- Iteramos cada elemento de la lista de compras -->
                            <c:forEach var="compra" items="${compras}" varStatus="status" >
                                <tr>
                                    <td>${status.count}</td>
                                    <td>${compra.id_compra}</td>
                                    
                                    <%--Agregamos conversión de numero a moneda--%>
                                    <td> <fmt:formatNumber value="${compra.monto}" type="currency"/> </td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&idCliente=${cliente.idCliente}"
                                           class="btn btn-secondary">
                                            <i class="fas fa-angle-double-right"></i> Editar
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

            <!--Inicio Tarjetas para los totales-->
            <div class="col-md-3">
                <div class="card text-center bg-danger text-white mb-3">
                    <div class="card-body">
                        <h3>Monto Total</h3>
                        <h4 class="display-4">
                            <fmt:formatNumber value="${montoTotal}" type="currency" />
                        </h4>
                    </div>
                </div>

                <div class="card text-center bg-success text-white mb-3">
                    <div class="card-body">
                        <h3>Total Compras</h3>
                        <h4 class="display-4">
                            <i class="fas fa-users"></i> ${totalCompras}
                        </h4>
                    </div>
                </div>        
            </div>
            <!--Fin Tarjetas para los totales-->
        </div>
    </div>
</section>

<!-- Agregar cliente MODAL -->
<jsp:include page="/WEB-INF/paginas/cliente/agregarCliente.jsp"/>
                        