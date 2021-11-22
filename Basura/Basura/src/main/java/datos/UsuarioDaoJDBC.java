package datos;

import dominio.Usuario;
import java.sql.*;
import java.util.*;

public class UsuarioDaoJDBC {
    
    private static final String SQL_SELECT = "SELECT * FROM usuario";
    
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM usuario WHERE idUsuario = ?";
    
    private static final String SQL_SELECT_LOGIN = "SELECT * FROM usuario WHERE usuario = ? AND password = ?";
    
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password, contacto, nivel) VALUES(?, ?, ?, ?)";
    
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario=?, password=?, contacto=?, nivel=? WHERE idUsuario=?";
    
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE idUsuario = ?";
    
    public List<Usuario> getUsuarios() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario user = null;
        
        List<Usuario> users = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idUsuario = rs.getInt("idUsuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");
                String contacto = rs.getString("contacto");
                String nivel = rs.getString("nivel");

                user = new Usuario(idUsuario, usuario, password, contacto, nivel);
                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return users;
    }
    
    public Usuario getUsuario(Usuario user) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, user.getIdUsuario());
            rs = stmt.executeQuery();
            if(rs.next()){
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");
                String contacto = rs.getString("contacto");
                String nivel = rs.getString("nivel");

                user.setUsuario(usuario);
                user.setPassword(password);
                user.setContacto(contacto);
                user.setNivel(nivel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return user;
    }
    
    public int addUsuario(Usuario user) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, user.getUsuario());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getContacto());
            stmt.setString(4, user.getNivel());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public int updateUsuario(Usuario user) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, user.getUsuario());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getContacto());
            stmt.setString(4, user.getNivel());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public int deleteInsumo(Usuario user) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, user.getIdUsuario());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
}