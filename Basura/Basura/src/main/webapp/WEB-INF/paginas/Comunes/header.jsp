<header id="header" class="py-2 text-white" style="background-color: black;">

    <nav class="navbar navbar-ligh ">
        
        <a class="navbar-brand" href="#">
            <img src="/WEB-INF/paginas/Comunes/logo.png" alt="logo">
        </a>
        
            
            <a class="nav-link text-white btn" href="${pageContext.request.contextPath}/ServletControlador?accion=abrirProductos">Productos</a>
            
            <a class="nav-link text-white btn" href="${pageContext.request.contextPath}/ServletControlador?accion=abrirInsumos">Insumos</a>
            
            <a class="nav-link text-white btn" href="${pageContext.request.contextPath}/ServletControlador?accion=abrirUsuarios">Usuarios</a>
            
        <ul class="navbar-right pr-4 pt-2">
            <i class="fas fa-sign-out-alt fa-lg"></i>
        </ul>
        
    </nav>

</header>