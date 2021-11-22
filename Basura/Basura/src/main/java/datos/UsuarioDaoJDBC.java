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
    
}