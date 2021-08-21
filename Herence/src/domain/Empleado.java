package domain;

public class Empleado extends Persona {
   
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }
    /*public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public static void setContadorEmpleado(int contadorEmpleado) {
        contadorEmpleado = contadorEmpleado;
    }  */ 

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" {Número de empleado =  ").append(idEmpleado);
        sb.append(", nombre =  ").append(this.nombre);
        //sb.append(", (").append(super.toString());
        sb.append(", sueldo = ").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
}