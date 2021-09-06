/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mariroco
 */
public class UsuarioDao {
    
    private Connection conTransaccional;
    
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, contrasena FROM prueba.usuario";
    private static final String SQL_DELETE = "DELETE FROM prueba.usuario WHERE id_usuario= ? ";
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, contrasena) VALUES(?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, contrasena = ? WHERE id_usuario = ?";
    
    public UsuarioDao(){}
    public UsuarioDao(Connection conTransaccional){
        this.conTransaccional = conTransaccional;
    }
    
    
    static public List <Usuario> seleccionar()throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareCall(SQL_SELECT);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                //Obtener los atributos de cada usuario en la BD
                int idUsuario = rs.getInt("id_usuario");
                String usuarioUsuario = rs.getString("usuario");
                String contrasena = rs.getString("contrasena");
                
                usuario = new Usuario(idUsuario, usuarioUsuario, contrasena);
                
                usuarios.add(usuario);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        finally{
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return usuarios;
    }
    
    public int eliminar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0; 
        try {
            conn = this.conTransaccional != null ? this.conTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getId_usuario());

            // Ejecutar sentencia
            registros = stmt.executeUpdate(); 

        }
        finally {
            try {
                close(stmt);
                if (this.conTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
      public int insertar(Usuario usuario)throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conTransaccional!=null ? this.conTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getContrasena());
            registros = stmt.executeUpdate(); 
        }
        catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        finally{
            try {
                close(stmt);
                if(this.conTransaccional==null){
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int actualizar(Usuario usuario) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conTransaccional!=null ? this.conTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getContrasena());
            stmt.setInt(3, usuario.getId_usuario());
            registros = stmt.executeUpdate(); 
        }catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        finally{
            try {
                close(stmt);
                if(this.conTransaccional==null){
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
