package web;

import datos.InsumoDaoJDBC;
import datos.ProductoDaoJDBC;
import datos.UsuarioDaoJDBC;
import dominio.Insumo;
import dominio.Producto;
import dominio.Usuario;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    
    // SECCIÓN DE GET
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "abrirInsumos":
                    this.abrirInsumos(request, response);
                    break;
                case "abrirProductos":
                    this.abrirProductos(request, response);
                    break;
                case "abrirUsuarios":
                    this.abrirUsuarios(request, response);
                    break;
                case "editarInsumo":
                    this.editarInsumo(request, response);
                    break;
                case "editarProducto":
                    this.editarProducto(request, response);
                    break;
                case "editarUsuario":
                    this.editarUsuario(request, response);
                    break;
                case "eliminarInsumo":
                    this.eliminarInsumo(request, response);
                    break;
                case "eliminarProducto":
                    this.eliminarProducto(request, response);
                    break;
                case "eliminarUsuario":
                    this.eliminarUsuario(request, response);
                    break;
                default:
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }
    
    //Acción default que lleva a página de Login
    private void accionDefault(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
        response.sendRedirect("login.jsp");
    }
     
    //Método para abrir la página de Insumos
    private void abrirInsumos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Insumo> listInsumos = new InsumoDaoJDBC().getInsumos();
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listInsumos", listInsumos);
        request.getRequestDispatcher("insumos.jsp").forward(request, response);
        response.sendRedirect("insumos.jsp");
    }
     
    //Método para abrir la página de Productos
    private void abrirProductos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Producto> listProductos = new ProductoDaoJDBC().getProductos();
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listProductos", listProductos);
        request.getRequestDispatcher("productos.jsp").forward(request, response);
        response.sendRedirect("productos.jsp");
    }
     
    //Método para abrir la página de Usuarios
    private void abrirUsuarios(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Usuario> listUsuarios = new UsuarioDaoJDBC().getUsuarios();
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listUsuarios", listUsuarios);
         
        request.getRequestDispatcher("usuarios.jsp").forward(request, response);
        response.sendRedirect("usuarios.jsp");
    }
    
    //Método para editar un insumo
    private void editarInsumo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Recuperación de id del insumo a editar
        int idInsumo = Integer.parseInt(request.getParameter("idInsumo"));
        
        Insumo insumo = new InsumoDaoJDBC().getInsumo(new Insumo(idInsumo));
        request.setAttribute("insumo", insumo);
        
        //Creación de ruta para navegar
        String jspEditar = "/WEB-INF/paginas/Insumos/agregarInsumo.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }
    
     //Método para editar un producto
    private void editarProducto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Recuperación de id del producto a editar
        int idProducto = Integer.parseInt(request.getParameter("idProducto"));
        
        Producto producto = new ProductoDaoJDBC().getProducto(new Producto(idProducto));
        request.setAttribute("producto", producto);
        
        //Creación de ruta para navegar
        String jspEditar = "/WEB-INF/paginas/Productos/agregarProductos.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }
    
    //Método para editar un usuario
    private void editarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Recuperación de id del usuario a editar
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
        
        Usuario usuario = new UsuarioDaoJDBC().getUsuario(new Usuario(idUsuario));
        request.setAttribute("usuario", usuario);
        
        //Creación de ruta para navegar
        String jspEditar = "/WEB-INF/paginas/Usuarios/agregarUsuario.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }
    
    //Método para eliminar un insumo
    private void eliminarInsumo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //recuperamos los valores del formulario agregarInsumo
        int idInsumo = Integer.parseInt(request.getParameter("idInsumo"));
     

        //Creamos el objeto de insumo (modelo)
        Insumo insumo = new Insumo(idInsumo);

        //Eliminamos el  objeto en la base de datos
        int registrosModificados = new InsumoDaoJDBC().deleteInsumo(insumo);
        System.out.println("registrosModificados = " + registrosModificados);

        //Redirigimos hacia accion por default
        this.accionDefault(request, response);
    }
    
    //Método para eliminar un producto
    private void eliminarProducto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //recuperamos los valores del formulario agregarProducto
        int idProducto = Integer.parseInt(request.getParameter("idProducto"));
     

        //Creamos el objeto de producto (modelo)
        Producto producto = new Producto(idProducto);

        //Eliminamos el  objeto en la base de datos
        int registrosModificados = new ProductoDaoJDBC().deleteProducto(producto);
        System.out.println("registrosModificados = " + registrosModificados);

        //Redirigimos hacia accion por default
        this.accionDefault(request, response);
    }
    
    //Método para eliminar un usuario
    private void eliminarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //recuperamos los valores del formulario agregarUsuario
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
     

        //Creamos el objeto de usuario (modelo)
        Usuario usuario = new Usuario(idUsuario);

        //Eliminamos el  objeto en la base de datos
        int registrosModificados = new UsuarioDaoJDBC().deleteUsuario(usuario);
        System.out.println("registrosModificados = " + registrosModificados);

        //Redirigimos hacia accion por default
        this.accionDefault(request, response);
    }
    
    // FINAL DE SECCIÓN DE GET
    
    // SECCIÓN DE POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "agregarInsumo":
                    
                    break;
                case "agregarProducto":
                    
                    break;
                case "agregarUsuario":
                    
                    break;
                case "modificarInsumo":
                    
                    break;
                case "modificarProducto":
                    
                    break;
                case "modificarUsuario":
                    
                    break;
                default:
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }
    
    // FINAL DE SECCIÓN DE POST
}
