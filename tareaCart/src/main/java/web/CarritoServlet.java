package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import clases.Producto;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=utf-8");
        
        HttpSession sesion = request.getSession();
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        List<Producto> aux = new ArrayList<>();

        if(articulos==null){
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }else{
            for(String articulo: articulos){
                Producto x = new Producto();
                if(aux.isEmpty()){
                    x.setNombre(articulo);
                    x.setCantidad(1);
                    aux.add(x);
                }else{
                    Boolean flag = false;
                    for(Producto prod:aux){
                        int cant = prod.getCantidad();
                        String nombre=prod.getNombre();
                        if(nombre.equals(articulo)){
                            prod.setCantidad(cant+1);
                            flag=true;
                        }
                    }
                    if(!flag){
                        x.setNombre(articulo);
                        x.setCantidad(1);
                        aux.add(x);  
                    }
                }
            }
        }

        String articuloNuevo = request.getParameter("articulo");

        if(articuloNuevo != null && !articuloNuevo.trim().equals("")){
            articulos.add(articuloNuevo);
            Producto x = new Producto();
            if(aux.isEmpty()){
                x.setNombre(articuloNuevo);
                x.setCantidad(1);
                aux.add(x);
            }else{
                Boolean flag = false;
                for(Producto prod:aux){
                    int cant = prod.getCantidad();
                    String nombre=prod.getNombre();
                    if(nombre.equals(articuloNuevo)){
                        prod.setCantidad(cant+1);
                        flag=true;
                    }
                }
                
                if(!flag){
                    x.setNombre(articuloNuevo);
                    x.setCantidad(1);
                    aux.add(x);  
                }
                
                
            }
           
        }
        try(PrintWriter out = response.getWriter()){
            String imports = "<meta charset='UTF-8'/>"+
            "<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css' integrity='sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU' crossorigin='anonymous'>";
            out.print("<html><head><title>En el carrito</title>"+imports+"</head><body class='container-fluid'>");
           
            out.println("<div class='row'><div class='container col-4 mt-5 p-3 box'>");
        
            out.print("<h1 class='text-center'>Lista articulos</h1>");
            out.print("</br>");
            out.print("<table class='table table-striped'><thead><tr><th class='text-center' scope='col'>Producto</th><th class='text-center' scope='col'>Cantidad</th></tr></thead><tbody>");
            
            for(Producto prod : aux){
                out.print("<tr><td class='text-center' scope='row'>");
                out.print(prod.getNombre()+"</td><td>"+prod.getCantidad()+"</tr>");
            }
            out.print("</tbody></table>");
            out.print("<a href='/tareaCart'>Regresar a inicio</a></div></div></body>");
        }

    }
}
