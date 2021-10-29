package datos;

import dominio.Cliente;
import dominio.Compra;
import java.sql.*;
import java.util.*;

public class CompraDaoJDBC {
    private static final String SQL_SELECT_BY_ID_COMPRA = "SELECT * FROM compra WHERE id_compra=?";
    
    private static final String SQL_SELECT = "SELECT * FROM compra";

    private static final String SQL_SELECT_BY_ID_CLIENTE = "SELECT * FROM compra WHERE id_cliente=?";

    private static final String SQL_INSERT = "INSERT INTO compra(id_cliente, monto) VALUES(?, ?)";

    private static final String SQL_UPDATE = "UPDATE compra SET monto=? WHERE id_compra=?";
    
    private static final String SQL_DELETE = "DELETE FROM compra WHERE id_compra = ?";
    
    public List<Compra> listarComprasPorId(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Compra compra = null;
        List<Compra> compras = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID_CLIENTE);
            stmt.setInt(1, cliente.getIdCliente());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idCompra = rs.getInt("id_compra");
                int idCliente = rs.getInt("id_cliente");
                double monto = rs.getDouble("monto");

                compra = new Compra(idCompra, idCliente, monto);
                compras.add(compra);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return compras;
    }
    
    public List<Compra> listarCompras() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Compra compra = null;
        List<Compra> compras = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idCompra = rs.getInt("id_compra");
                int idCliente = rs.getInt("id_cliente");
                double monto = rs.getDouble("monto");

                compra = new Compra(idCompra, idCliente, monto);
                compras.add(compra);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return compras;
    }
    
    public Compra encontrarCompra(Compra compra) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID_COMPRA);
            stmt.setInt(1, compra.getId_compra());
            rs = stmt.executeQuery();
            rs.absolute(1);//nos posicionamos en el primer registro devuelto

            int idCliente = rs.getInt("id_cliente");
            double monto = rs.getDouble("monto");

            compra.setId_cliente(idCliente);
            compra.setMonto(monto);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return compra;
    }
    
    public int insertarCompra(Compra compra) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, compra.getId_cliente());
            stmt.setDouble(2, compra.getMonto());
       

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public int actualizarCompra(Compra compra) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setDouble(1, compra.getMonto());
            stmt.setInt(2, compra.getId_compra());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public int eliminarCompra(Compra compra) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, compra.getId_compra());

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
