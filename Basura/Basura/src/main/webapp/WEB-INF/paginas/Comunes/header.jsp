<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header id="header" class="py-2 text-white bgBlack">

    <nav class="navbar navbar-ligh ">
        
        <a class="navbar-brand" href="#">
            <img src="${pageContext.request.contextPath}/ServletImagenes?load=cargarImgPNG&ImgName=logoH.png" width="80" height="80" alt="logo">
        </a>
        
            <c:set var="usuario" scope="session" value="${usuarioLog}"/>
            <a class="nav-link text-white btn" href="${pageContext.request.contextPath}/ServletControlador?accion=abrirProductos">Productos</a>
            
            <a class="nav-link text-white btn" href="${pageContext.request.contextPath}/ServletControlador?accion=abrirInsumos">Insumos</a>
            <c:if test = '${usuarioLog.getNivel()=="Administrador"}'>
                <a class="nav-link text-white btn" href="${pageContext.request.contextPath}/ServletControlador?accion=abrirUsuarios">Usuarios</a>
            </c:if>
        <ul class="navbar-right pr-4 pt-2">
            <a class="pl-1 pr-1 text-white" href="${pageContext.request.contextPath}/ServletControlador?accion=accionDefault">
            <i class="fas fa-sign-out-alt fa-lg"></i>
            </a>
        </ul>
        
    </nav>

</header>