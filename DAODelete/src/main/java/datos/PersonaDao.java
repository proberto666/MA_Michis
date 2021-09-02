package datos;

import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDao {
    
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM prueba.persona";
    
    //Método que regresa una lista de objetos de tipo Persona de la clase Persona.java
    public List <Persona> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        
        List<Persona> personas = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareCall(SQL_SELECT);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                //Obtener los atributos de cada usuario en la BD
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                
                //Crear objetivo tipo 'persona' e insetarle los datos
                persona = new Persona(idPersona, nombre, apellido, email, telefono);
                
                //Insertar dentro de la lista 'personas' el objeto 'persona'
                personas.add(persona);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        //Cerrar todos los objetos de conexión
        finally{
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        //Retorno de listas personas
        return personas;
    }
    
    public Persona delete(int id_persona)
    {
        //Creación de la línea de secuencia de SQL
        String stringID = String.valueOf(id_persona);
        String SQL_DELETE = "DELETE FROM prueba.persona WHERE id_persona=".concat(stringID);
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.executeUpdate();
            System.out.println("Borrado con éxito.");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        //Cerrar todos los objetos de conexión
        finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return null;
    }
}
