package datos;

import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaDao {
    
    private Connection conTransaccional;
    
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM prueba.persona";
    private static final String SQL_DELETE = "DELETE FROM prueba.persona WHERE id_persona= ? ";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    
    public PersonaDao(){}
    public PersonaDao(Connection conTransaccional){
        this.conTransaccional = conTransaccional;
    }
    
    //Método que regresa una lista de objetos de tipo Persona de la clase Persona.java
    public static List <Persona> seleccionar(){
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
    
    public Persona delete(Persona persona)throws SQLException
    {      
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = this.conTransaccional!=null ? this.conTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPersona());
            stmt.executeUpdate();
            System.out.println("Borrado con éxito.");
        } 
        //Cerrar todos los objetos de conexión
        finally{
            try {
                Conexion.close(stmt);
                if(this.conTransaccional==null){
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return null;
    }
    
      public int insertar(Persona persona) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conTransaccional!=null ? this.conTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            registros = stmt.executeUpdate(); 
        } finally {
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
    
    public int actualizar(Persona persona) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conTransaccional!=null ? this.conTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
             stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            registros = stmt.executeUpdate(); 
        } finally {
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
