package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class test {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/prueba?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Web Interface
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conexion = DriverManager.getConnection(url, "root", "admin123");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT id_persona, nombre, apellido, email, telefono FROM prueba.persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            
            //Para recorrer los elementos de la consulta
            while(resultado.next())
            {
                System.out.println("Id Persona"+resultado.getString("id_persona"));
            }
            
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
