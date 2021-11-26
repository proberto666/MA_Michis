
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
                case "cargarImgPNG":
                    this.cargarImgPNG(request,response);
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
        File f = new File(pathToWeb + "/img/fuego.png");
        BufferedImage bi = ImageIO.read(f);
        try (OutputStream out = response.getOutputStream()) {
            ImageIO.write(bi, "png", out);
        }

    }
    
    protected void cargarImgPNG(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String img = request.getParameter("ImgName") ;
        if (img==null){
            img="camara.png";
        }
        response.setContentType("image/png");
        
        String pathToWeb = getServletContext().getRealPath(File.separator);
        File f = new File(pathToWeb + "/img/"+img);
        BufferedImage bi = ImageIO.read(f);
        try (OutputStream out = response.getOutputStream()) {
            ImageIO.write(bi, "png", out);
        }
    }
}


