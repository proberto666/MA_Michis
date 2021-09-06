/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.Conexion;
import datos.PersonaDao;
import domain.Persona;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testPersonaTransaccional {
    public static void main(String[] args){
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            PersonaDao personaDao= new PersonaDao(conexion);
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Luis");
            nuevaPersona.setApellido("Vega");
            nuevaPersona.setEmail("luve@mail.com");
            nuevaPersona.setTelefono("1234567890");
            personaDao.insertar(nuevaPersona);
            
        }  catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback - no fue posible realizar cambios");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
    }
}
