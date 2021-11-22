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
}
