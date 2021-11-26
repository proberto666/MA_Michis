<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"/>
<section id="productos">
    
    
    
    
    <div class="row">
         <c:forEach var="producto" items="${listProductos}" varStatus="status">
            <div class="col-3 p-3" >
                <div class="col-12 m-3" style="border-color: #eb332c; border-style: solid; border-width: 1px; max-width: 90%">

                    <div class="col-12 text-right text-dark">
                    <a class="pl-1 pr-1 text-dark btn" href="${pageContext.request.contextPath}/ServletControlador?accion=editarProducto&idProducto=${producto.idProducto}">
                        <i class="fas fa-pen"></i>
                    </a>
                    <a class="pl-1 pr-1 text-dark btn" href="${pageContext.request.contextPath}/ServletControlador?accion=eliminarProducto&idProducto=${producto.idProducto}">
                        <i class="fas fa-trash"></i>
                    </a>
                </div>

                <div class="p-3" class="col-12">
                     <img src="${pageContext.request.contextPath}/ServletImagenes?load=cargarGorro" alt="alt" class="img-fluid"/>
                </div>

                <div class="col-12 text-left">
                    <h4> ${producto.nombre} </h4>

                    <p> ${producto.cantidad} disponible(s) </p>
                    <h5>$ ${producto.precio} </h5>
                </div>

                </div>
            </div>
       
       </c:forEach>
            
            </div>
        </div>
    </div>
            <a class="btn float text-white" href="#" style="background-color: #eb332c; border-radius: 50%;"
                data-toggle="modal" data-target="#agregarProductoModal">
                 <i class="fas fa-plus fa-2x mt-2"></i>
            </a>
</section>
            
<jsp:include page="./agregarProductos.jsp"/>

