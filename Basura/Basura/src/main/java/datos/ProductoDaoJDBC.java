package datos;

import dominio.Producto;
import java.sql.*;
import java.util.*;

public class ProductoDaoJDBC {
    private static final String SQL_SELECT = "SELECT * FROM producto";
    
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM producto WHERE idProducto = ?";
    
    private static final String SQL_INSERT = "INSERT INTO producto(nombre, cantidad, precio) VALUES(?, ?, ?)";
    
    private static final String SQL_UPDATE = "UPDATE insumo SET nombre=?, cantidad=?, precio=? WHERE idProducto=?";
    
    private static final String SQL_DELETE = "DELETE FROM producto WHERE idProducto = ?";
}
