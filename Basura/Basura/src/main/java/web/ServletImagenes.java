
package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.OutputStream;
import javax.imageio.ImageIO;

 @WebServlet("/ServletImagenes")
public class ServletImagenes extends HttpServlet { 
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String load = request.getParameter("load");
        if (load != null) {
            switch (load) {
                case "cargarLogoHead":
                    this.cargarLogoHead(request,response);
                    break;
                case "cargarLogoLogIn":
                    this.cargarLogoLogIn(request,response);
                    break;
                case "cargarGorro":
                    this.cargarGorro(request,response);
                    break;
                default:
                    this.cargarFuego(request,response);
                    break;
            }
        } 
    }
     
    protected void cargarFuego(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("image/png");

        String pathToWeb = getServletContext().getRealPath(File.separator);
        File f = new File(pathToWeb + "fuego.png");
        BufferedImage bi = ImageIO.read(f);
        try (OutputStream out = response.getOutputStream()) {
            ImageIO.write(bi, "png", out);
        }

    }
    
    protected void cargarLogoHead(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("image/png");

        String pathToWeb = getServletContext().getRealPath(File.separator);
        File f = new File(pathToWeb + "logoH.png");
        BufferedImage bi = ImageIO.read(f);
        try (OutputStream out = response.getOutputStream()) {
            ImageIO.write(bi, "png", out);
        }

    }
    
    protected void cargarLogoLogIn(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("image/png");

        String pathToWeb = getServletContext().getRealPath(File.separator);
        File f = new File(pathToWeb + "logoLI.png");
        BufferedImage bi = ImageIO.read(f);
        try (OutputStream out = response.getOutputStream()) {
            ImageIO.write(bi, "png", out);
        }

    }
    
    protected void cargarGorro(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("image/png");

        String pathToWeb = getServletContext().getRealPath(File.separator);
        File f = new File(pathToWeb + "ballena.png");
        BufferedImage bi = ImageIO.read(f);
        try (OutputStream out = response.getOutputStream()) {
            ImageIO.write(bi, "png", out);
        }

    }

}


