package test;

import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class test {
    
     public static void main(String[] args){

        System.out.println("PRUEBA EMPLEADO");
        Empleado empleado = new Empleado("Yareli", 30000.0);
        System.out.println("Información del empleado"+empleado);

        Empleado empleado1 = new Empleado("Mariela", 40000.0);
        System.out.println("Información del empleado "+empleado1);

        
        System.out.println("PRUEBA CLIENTE");
        
        Date fecha = new Date();
        Cliente cliente = new Cliente("Max",false,fecha);
        System.out.println("Información del Cliente "+cliente);

        Cliente cliente2 = new Cliente("Victor",true,fecha);
        System.out.println("Información del Cliente "+cliente2);

    }
}
