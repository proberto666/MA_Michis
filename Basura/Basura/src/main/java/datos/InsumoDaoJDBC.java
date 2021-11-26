package datos;

import dominio.Insumo;
import java.sql.*;
import java.util.*;

public class InsumoDaoJDBC {
    private static final String SQL_SELECT = "SELECT * FROM insumo";
    
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM insumo WHERE idInsumo = ?";
    
    private static final String SQL_INSERT = "INSERT INTO insumo(nombre, color, proveedor, cantidad, costo) VALUES(?, ?, ?, ?, ?)";
    
    private static final String SQL_UPDATE = "UPDATE insumo SET nombre=?, color=?, proveedor=?, cantidad=?, costo=? WHERE idInsumo=?";
    
    private static final String SQL_DELETE = "DELETE FROM insumo WHERE idInsumo = ?";
    
    public List<Insumo> getInsumos() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Insumo insumo = null;
        
        List<Insumo> insumos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idInsumo = rs.getInt("idInsumo");
                String nombre = rs.getString("nombre");
                String color = rs.getString("color");
                String proveedor = rs.getString("proveedor");
                int cantidad = rs.getInt("cantidad");
                double costo = rs.getDouble("costo");

                insumo = new Insumo(idInsumo, nombre, color, proveedor, cantidad, costo);
                insumos.add(insumo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return insumos;
    }
    
    public Insumo getInsumo(Insumo insumo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, insumo.getIdInsumo());
            rs = stmt.executeQuery();
            if(rs.next()){
                String nombre = rs.getString("nombre");
                String color = rs.getString("color");
                String proveedor = rs.getString("proveedor");
                int cantidad = rs.getInt("cantidad");
                double costo = rs.getDouble("costo");

                insumo.setNombre(nombre);
                insumo.setColor(color);
                insumo.setProveedor(proveedor);
                insumo.setCantidad(cantidad);
                insumo.setCosto(costo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return insumo;
    }
    
    public int addInsumo(Insumo insumo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, insumo.getNombre());
            stmt.setString(2, insumo.getColor());
            stmt.setString(3, insumo.getProveedor());
            stmt.setInt(4, insumo.getCantidad());
            stmt.setDouble(5, insumo.getCosto());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public int updateInsumo(Insumo insumo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, insumo.getNombre());
            stmt.setString(2, insumo.getColor());
            stmt.setString(3, insumo.getProveedor());
            stmt.setInt(4, insumo.getCantidad());
            stmt.setDouble(5, insumo.getCosto());
            stmt.setInt(6, insumo.getIdInsumo());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public int deleteInsumo(Insumo insumo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, insumo.getIdInsumo());

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
