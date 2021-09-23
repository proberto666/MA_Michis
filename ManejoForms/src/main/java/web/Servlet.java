
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out= response.getWriter();
        
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica = request.getParameter("musica");
        String comentarios = request.getParameter("comentarios");
        
        String br = "<br/>";
        String nombreCampo = "<div class='col-12 text-center pt-3 pb-2 fw-bold'>";
        String valorCampo = "<div class='col-12 text-center'>";
        String endDiv= "</div>";

        String imports = "<meta charset='UTF-8'/>"+
        "<link rel='stylesheet' href='./Recursos/styles.css'>"+
        "<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css' integrity='sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU' crossorigin='anonymous'>";

        out.println("<html><head><title>Respuesta Servlet</title>"+imports+"</head>");
        out.println("<body class='container-fluid'");
        out.println("<div class='row'><div class='container col-4 mt-5 p-3 box'>");
        out.println("<h1 class='text-center'>Respuestas del usuario</h1>"+nombreCampo+"Usuario:"+endDiv+valorCampo);
        out.println(usuario+br);
        out.println(endDiv+nombreCampo+"Contraseña:"+endDiv+valorCampo);
        out.println(contrasena+br);
        out.println(endDiv+nombreCampo+"Tecnologías:"+endDiv+valorCampo);
        for (String tecnologia : tecnologias) {
            out.println(tecnologia+br);   
        }
        out.println(endDiv+nombreCampo+"Genero:"+endDiv+valorCampo);
        out.println(genero+br);
        out.println(endDiv+nombreCampo+"Ocupación:"+endDiv+valorCampo);
        out.println(ocupacion+br);
        out.println(endDiv+nombreCampo+"Música:"+endDiv+valorCampo);
        out.println(musica+br);
        out.println(endDiv+nombreCampo+"Comentarios:"+endDiv+valorCampo);
        out.println(comentarios+br);
        out.println(endDiv+endDiv+"</body></html>");
        
    }

}
