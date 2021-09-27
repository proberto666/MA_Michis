package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{

 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out= response.getWriter();
        String endTags = "</body></html>";

        int action = Integer.parseInt(request.getParameter("opcion"));
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Resultado</title>");
        out.print("<meta charset=\"UTF-8\"/>");
        out.print("</head>");
        out.print("<body>");

        switch(action){
            case 1: 
                double a = Double.parseDouble(request.getParameter("formulaGA"));
                double b = Double.parseDouble(request.getParameter("formulaGB"));
                double c = Double.parseDouble(request.getParameter("formulaGC"));

                ArrayList<Double> resultados = formulaGeneral(a, b, c); 
               
                out.print("<h1>Fórmula General</h1>");
                out.print("<h2> a = "+ a + "</h2>");
                out.print("<h2> b = "+ b + "</h2>");
                out.print("<h2> c = "+ c + "</h2>");
                out.print("<br>");
                out.print("<h2> resultado 1 = "+ resultados.get(0) + "</h2>");
                out.print("<h2> resultado 2 = "+ resultados.get(1) + "</h2>");
                out.print(endTags);
            break;
            case 2: 
                int n =  Integer.parseInt(request.getParameter("numero"));
                out.print("<h1>Números primos</h1>");
                ArrayList<Integer> nPrimos = primos(n);
                
                for (Integer integer : nPrimos) {
                    out.print(integer + "</br>");
                }

                out.print(endTags);
                break;
            case 3: 
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
                out.print("<h1>Tipo de Triángulo/h1>");
                out.print("<h2>El triángulo es: "+tipoTriangulo+"</h2>");
                out.print(endTags);
                break;
            default:
                break;
        }
        
    }

    ArrayList<Double> formulaGeneral(double a, double b, double c){

        ArrayList<Double> resultados = new ArrayList<>();
        
                
        double resultado1 = (b*(-1)+ Math.sqrt(b*b -4*(a*c)))/(2*a);
        double resultado2 = (b*(-1)- Math.sqrt(b*b -4*(a*c)))/(2*a);

        resultados.add(resultado1);
        resultados.add(resultado2);
    
        return resultados;
    }

    ArrayList<Integer> primos(int total){
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero = 2;
        int loop = 0;
        while(loop<total){
            int contador = 0;
            for (int i = (int) Math.sqrt(numero); i > 1; i--) {
                if (numero % i == 0) {
                    contador++;
                }
            }
            if(contador<1){
                numeros.add(numero);
                loop++;
            }
            numero ++;
        }
        return numeros;
    }
}
