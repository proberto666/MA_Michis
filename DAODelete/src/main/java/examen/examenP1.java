package examen;

import datos.PersonaDao;
import datos.UsuarioDao;
import domain.Persona;
import domain.Usuario;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/*
Para las clases entidad persona y usuario utilizadas previamente en clase deberá generar un menú de
captura para los métodos de:
• Insertar
• Actualizar
• Eliminar
• Listar
De igual forma el sistema deberá ser capaz de saber cuantas entidades (persona o usuario) se han:
• Dado de alta
• Actualizado
• Eliminado
*/
public class examenP1 {
    
    public int usrEliminado = 0, usrActualizado = 0, usrAlta = 0;
    public int prsnEliminado = 0, prsnActualizado = 0, prsnAlta = 0;
    
    public static void main(String[] args) throws SQLException{
        Scanner input= new Scanner(System.in);
        int x=0;                
        while(x==0){
        System.out.println("---MENU---"
            + "\n1-Persona"
            + "\n2-Usuario"
            + "\n----------"
            + "\nIntroduce un número: ");
        
        int caso = input.nextInt();
    
        switch(caso){
            case 1:
                menuPersona();
                break;
            case 2:
                menuUsuario();
                break;
            default:
                System.out.println("Error");
            }
        }
    }
    
    public static void menuPersona() throws SQLException{
        PersonaDao personaDao = new PersonaDao();
        Scanner input= new Scanner(System.in);
        int x=0;                
        while(x==0){
        System.out.println("---MENU---"
            + "\n1-Consultar"
            + "\n2-Eliminar"
            + "\n3-Insertar"
            + "\n4-Update"
            + "\n5-Salir"
            + "\n----------"
            + "\nIntroduce un número: ");
        int caso = input.nextInt();
    
        switch(caso){
            case 1:
                List<Persona> personas = PersonaDao.seleccionar();
                personas.forEach(persona -> {
                System.out.println(persona);});
                break;
            case 2:
                Persona PersonaEliminar = new Persona(3);
                 personaDao.delete(PersonaEliminar);
                break;
            case 3:
                Persona personaNuevo = new Persona("Yare","Ramirez","yareli@gmail.com", "1234");
                personaDao.insertar(personaNuevo);
                personaNuevo = new Persona("Yare","Ramirez","yareli@gmail.com", "1234");
                personaDao.insertar(personaNuevo);
                personaNuevo = new Persona("Yare","Ramirez","yareli@gmail.com", "1234");
                personaDao.insertar(personaNuevo);
                personaNuevo = new Persona("Yare","Ramirez","yareli@gmail.com", "1234");
                personaDao.insertar(personaNuevo);
                personaNuevo = new Persona("Yare","Ramirez","yareli@gmail.com", "1234");
                personaDao.insertar(personaNuevo);
                break;
            case 4:
                Persona personaEditar = new Persona(1,"Yare","Ramirez","yareli@gmail.com", "1234");
                personaDao.actualizar(personaEditar);
                break;
            case 5:
                x++;
                break;
            default:
                System.out.println("Error");
            }
        }
    }
    
    public static void menuUsuario() throws SQLException{
        UsuarioDao usuarioDao = new UsuarioDao();
        Scanner input= new Scanner(System.in);
        int x=0;                
        while(x==0){
        System.out.println("---MENU---"
            + "\n1-Consultar"
            + "\n2-Eliminar"
            + "\n3-Insertar"
            + "\n4-Update"
            + "\n5-Salir"
            + "\n----------"
            + "\nIntroduce un número: ");
        int caso = input.nextInt();
    
        switch(caso){
            case 1:
                List<Usuario> usuarios= UsuarioDao.seleccionar();
                usuarios.forEach(usuario -> {
                System.out.println(usuario);});
                break;
            case 2:
                Usuario UsuarioEliminar = new Usuario(3);
                 usuarioDao.eliminar(UsuarioEliminar);
                break;
            case 3:
                Usuario usuarioNuevo = new Usuario("Yare", "1234");
                usuarioDao.insertar(usuarioNuevo);
                usuarioNuevo = new Usuario("Otra Yare", "1234");
                usuarioDao.insertar(usuarioNuevo);
                usuarioNuevo = new Usuario("Otra Yare 3", "1234");
                usuarioDao.insertar(usuarioNuevo);
                usuarioNuevo = new Usuario("Otra Yare 4", "1234");
                usuarioDao.insertar(usuarioNuevo);
                usuarioNuevo = new Usuario("Otra Yare 5", "1234");
                usuarioDao.insertar(usuarioNuevo);
                break;
            case 4:
                Usuario usuarioEditar = new Usuario(4,"Yareli","yare12");
                usuarioDao.actualizar(usuarioEditar);
                break;
            case 5:
                x++;
                break;
            default:
                System.out.println("Error");
            }
        }
    }
}
