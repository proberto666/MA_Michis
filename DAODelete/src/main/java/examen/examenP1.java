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
    
    public static int usrEliminado = 0, usrActualizado = 0, usrAlta = 0;
    public static int prsnEliminado = 0, prsnActualizado = 0, prsnAlta = 0;
    
    public static void main(String[] args) throws SQLException{
        Scanner input= new Scanner(System.in);
        int x=0;                
        while(x==0){
        System.out.println("---MENU---"
            + "\n1-Persona"
            + "\n2-Usuario"
            + "\n3-Registro de cambios"
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
            case 3:
                contadoresCambios();
                break;
            default:
                System.out.println("Error");
            }
        }
    }
    
    public static void menuPersona() throws SQLException{

        //Variables auxiliares
        int id = 0;
        String nombre = "";
        String apellido = "";
        String correo = "";
        String telefono = "";

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
                System.out.println("Ingrese el id de la persona a eliminar: \n");
                id = Integer.parseInt(input.nextLine());
                Persona PersonaEliminar = new Persona(id);
                personaDao.delete(PersonaEliminar);
                 prsnEliminado++;
                break;
            case 3:
                System.out.println("Ingrese el nombre: \n");
                nombre = input.nextLine();
                System.out.println("Ingrese el apellido: \n");
                apellido = input.nextLine();
                System.out.println("Ingrese el correo: \n");
                correo = input.nextLine();
                System.out.println("Ingrese el teléfono: \n");
                telefono = input.nextLine();
                
                Persona personaNuevo = new Persona(nombre,apellido,correo,telefono);
                personaDao.insertar(personaNuevo);
                prsnAlta++;
                break;
            case 4:
                System.out.println("Ingrese el id de la persona a editar: \n");
                id = Integer.parseInt(input.nextLine());
                System.out.println("Ingrese el nombre: \n");
                nombre = input.nextLine();
                System.out.println("Ingrese el apellido: \n");
                apellido = input.nextLine();
                System.out.println("Ingrese el correo: \n");
                correo = input.nextLine();
                System.out.println("Ingrese el teléfono: \n");
                telefono = input.nextLine();
                
                Persona personaEditar = new Persona(id,nombre,apellido,correo,telefono);
                personaDao.actualizar(personaEditar);
                prsnActualizado++;
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

        int id = 0;
        String user = "";
        String password = "";

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
                System.out.println("Ingrese el id del usuario a eliminar: \n");
                id = Integer.parseInt(input.nextLine());
                Usuario UsuarioEliminar = new Usuario(id);
                usuarioDao.eliminar(UsuarioEliminar);
                usrEliminado++;
                break;
            case 3:
                System.out.println("Ingrese el usuario: \n");
                user = input.nextLine();
                System.out.println("Ingrese la contraseña: \n");
                password = input.nextLine();
                
                Usuario usuarioNuevo = new Usuario(user, password);
                usuarioDao.insertar(usuarioNuevo);
                usrActualizado++;
                break;
            case 4:
                System.out.println("Ingrese el id del usuario a editar: \n");
                id = Integer.parseInt(input.nextLine());
                System.out.println("Ingrese el usuario: \n");
                user = input.nextLine();
                System.out.println("Ingrese la contraseña: \n");
                password = input.nextLine();
                
                Usuario usuarioEditar = new Usuario(id,user,password);
                usuarioDao.actualizar(usuarioEditar);
                usrAlta++;
                break;
            case 5:
                x++;
                break;
            default:
                System.out.println("Error");
            }
        }
    }
    
    public static void contadoresCambios() {
        System.out.println("--PERSONAS--\n");
        System.out.println("Agregadas: " + prsnAlta);
        System.out.println("Eliminadas: " + prsnEliminado);
        System.out.println("Actualizadas: " + prsnActualizado);
        
        System.out.println("--USUARIOS--\n");
        System.out.println("Agregados: " + usrAlta);
        System.out.println("Eliminados: " + usrEliminado);
        System.out.println("Actualizados: " + usrActualizado);
    }
    
}