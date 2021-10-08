package web;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/DatosServlet")
public class DatosServlet extends HttpServlet{

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        HttpSession sesion = request.getSession();

        String nombre = (String) sesion.getAttribute("name");
        
        String direccion = (String) sesion.getAttribute("direccion");
        String telefono = (String) sesion.getAttribute("telefono");
        String tecnologias = request.getParameter("tecnologias");
        String experiencia = request.getParameter("experiencia");
        String estadoCivil = request.getParameter("estado");

        out.print("<html>");
        out.print("<head>");
        out.print("<title>DATOS PROCESADOS</title>");
        out.print("<meta charset='UTF-8'>");
        out.print("</head>");
        out.print("<body><br>");
        out.print("<div> <h1>Datos:</h1>");
        out.print("<h2>Nombre: "+nombre+"</h2>");
        out.print("<h2>Dirección: "+direccion+"</h2>");
        out.print("<h2>Teléfono: "+telefono+"</h2>");
        out.print("<h2>Tecnologías: "+tecnologias+"</h2>");
        out.print("<h2>Experiencia: "+experiencia+"</h2>");
        out.print("<h2>Estado Civil: "+estadoCivil+"</h2>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
    }
}