package datos;

public class CompraDaoJDBC {
    private static final String SQL_SELECT_BY_ID_COMPRA = "SELECT * FROM compra WHERE id_compra";

    private static final String SQL_SELECT_BY_ID_CLIENTE = "SELECT * FROM compra WHERE id_cliente";

    private static final String SQL_INSERT = "INSERT INTO compra(id_cliente, monto) VALUES(?, ?)";

    private static final String SQL_UPDATE = "UPDATE compra SET monto=? WHERE id_compra=?";
    
    private static final String SQL_DELETE = "DELETE FROM compra WHERE id_compra = ?";
}
