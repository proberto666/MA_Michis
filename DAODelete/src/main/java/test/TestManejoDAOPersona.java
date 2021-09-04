package test;

import datos.PersonaDao;
import domain.Persona;
import java.util.List;
import java.util.Scanner;

public class TestManejoDAOPersona {
    public static void main(String[] args){
        PersonaDao personaDao = new PersonaDao();
        
        List<Persona> personas = personaDao.seleccionar();
        
        for(Persona persona:personas){
            System.out.println("persona"+persona);
        }
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la id_persona del objeto que desea borrar: ");
        int idDelete = scanner.nextInt();
        personaDao.delete(idDelete);
        
        //Consulta
        List<Persona> personas = personaDao.seleccionar();
        
        for(Persona persona:personas){
            System.out.println("persona"+persona);
        }
        */
    }
}
