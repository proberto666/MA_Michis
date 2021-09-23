
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
        
        String nombreCampo = "<tr class='col-12 text-center pt-3 pb-2 fw-bold'><td>";
        String endTr = "</td></tr>";
        String valorCampo = "<tr class='col-12 text-center'><td>";
        String endDiv= "</div>";

        String imports = "<meta charset='UTF-8'/>"+
        "<link rel='stylesheet' href='./Recursos/styles.css'>"+
        "<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css' integrity='sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU' crossorigin='anonymous'>";

        out.println("<html><head><title>Respuesta Servlet</title>"+imports+"</head>");
        out.println("<body class='container-fluid'>");
        out.println("<div class='row'><div class='container col-4 mt-5 p-3 box'>");
        out.println("<h1 class='text-center'>Respuestas del usuario</h1><table class='table'>"+nombreCampo+"Usuario:"+endTr+valorCampo);
        out.println(usuario);
        out.println(endTr+nombreCampo+"Contraseña:"+endTr+valorCampo);
        out.println(contrasena);
        out.println(endTr+nombreCampo+"Tecnologías:"+endTr+valorCampo);
        for (String tecnologia : tecnologias) {
            out.println(tecnologia);   
        }
        out.println(endTr+nombreCampo+"Genero:"+endTr+valorCampo);
        out.println(genero);
        out.println(endTr+nombreCampo+"Ocupación:"+endTr+valorCampo);
        out.println(ocupacion);
        out.println(endTr+nombreCampo+"Música:"+endTr+valorCampo);
        out.println(musica);
        out.println(endTr+nombreCampo+"Comentarios:"+endTr+valorCampo);
        out.println(comentarios);
        out.println(endTr+"</table>"+endDiv+endDiv+"</body></html>");
        
    }

}
