package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import jdk.nashorn.internal.parser.TokenType;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{

 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out= response.getWriter();

        String action = request.getParameter("opcion");
        
        switch(action){
            case "1": 
                double a = Double.parseDouble(request.getParameter("formulaGA"));
                double b = Double.parseDouble(request.getParameter("formulaGB"));
                double c = Double.parseDouble(request.getParameter("formulaGC"));
                
                double resultado1 = (b*(-1)+ Math.sqrt(b*b -4*(a*c)))/(2*a);
                double resultado2 = (b*(-1)- Math.sqrt(b*b -4*(a*c)))/(2*a);
                
                
                out.print("<html>");
                out.print("<head>");
                out.print("<title>Resultado</title>");
                out.print("<meta charset=\"UTF-8\"/>");
                out.print("</head>");
                out.print("<body>");
                out.print("<h1>Fórmula General</h1>");
                out.print("<h2> a = "+ a + "</h2>");
                out.print("<h2> b = "+ b + "</h2>");
                out.print("<h2> c = "+ c + "</h2>");
                out.print("<br>");
                out.print("<h2> resultado 1 = "+ resultado1 + "</h2>");
                out.print("<h2> resultado 2 = "+ resultado2 + "</h2>");
                out.print("</body>");
                out.print("</html>");
            break;
            case "2": 
                
                int n =  Integer.parseInt(request.getParameter("numero"));
               
                out.print("<html>");
                out.print("<head>");
                out.print("<title>Resultado</title>");
                out.print("<meta charset=\"UTF-8\"/>");
                out.print("</head>");
                out.print("<body>");
                out.print("<h1>Números primos</h1>");
                
                for(int i=2; i<= n; i++){
                    if( i % n != 0){
                        out.print("<h2>"+i+"</h2>");
                    }
                }
                out.print("</body>");
                out.print("</html>");
            break;
            case "3": 
                
                double ladoa = Double.parseDouble(request.getParameter("ladoa"));
                double ladob = Double.parseDouble(request.getParameter("ladob"));
                double ladoc = Double.parseDouble(request.getParameter("ladoc"));
                
                String tipoTriangulo;
                
                if(ladoa == ladob && ladob == ladoc){
                    tipoTriangulo = "Equilátero";
                }else{
                    if(ladoa == ladob || ladob == ladoc || ladoa == ladoc){
                        tipoTriangulo = "Isóceles";
                    }else{
                        tipoTriangulo = "Escaleno";
                    }
                }
                
                out.print("<html>");
                out.print("<head>");
                out.print("<title>Resultado</title>");
                out.print("<meta charset=\"UTF-8\"/>");
                out.print("</head>");
                out.print("<body>");
                out.print("<h1>Tipo de Triángulo/h1>");
                out.print("<h2>El triángulo es: "+tipoTriangulo+"</h2>");
                out.print("</body>");
                out.print("</html>");
            break;
        }
        
        
        
     

    }
}
