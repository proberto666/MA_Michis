/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.Conexion;
import datos.UsuarioDao;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author proberto666
 */
public class testUserTrransaccional {
    public static void main(String[] args){
         Connection conexion = null;
         
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            UsuarioDao usuarioDao= new UsuarioDao(conexion);
            
            Usuario actualizarUsuario = new Usuario();
            actualizarUsuario.setId_usuario(1);
            actualizarUsuario.setUsuario("Fernando");
            actualizarUsuario.setContrasena("Contrasenalarga");
            
            usuarioDao.actualizar(actualizarUsuario);
            
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setUsuario("Vega");
            nuevoUsuario.setContrasena("Contrasena2");
            
            usuarioDao.insertar(nuevoUsuario);
            
            Usuario deleteUsuario = new Usuario();
            deleteUsuario.setId_usuario(4);
            
            usuarioDao.eliminar(deleteUsuario);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.print("No fue posible realizar los datos - Rollback");
            try{
                conexion.rollback();
            }catch (SQLException ex1){
                ex1.printStackTrace(System.out);
            }
        }
    }
}
