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
            out.print("<h1>Lista articulos</h1>");
            out.print("</br>");
            out.print("<table><thead><tr><th>Producto</th><th>Cantidad</th></tr></thead><tbody>");
            
            for(Producto prod : aux){
                out.print("<tr><td>");
                out.print(prod.getNombre()+"</td><td>"+prod.getCantidad()+"</tr>");
            }
            out.print("</tbody></table>");
            out.print("<a href='/tareaCart'>Regresar a inicio</a>");
        }

    }
}
