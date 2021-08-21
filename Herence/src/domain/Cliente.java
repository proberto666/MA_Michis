package domain;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean lineaCredito;
    private static int contadorCliente;
    
    public Cliente(String nombre, boolean lineaCredito, Date fechaRegistro){

        super(nombre);
        this.idCliente = ++Cliente.contadorCliente;
        this.lineaCredito = lineaCredito;
        this.fechaRegistro = fechaRegistro;
    }

    /*public static int getContadorCliente() {
        return contadorEmpleado;
    }

    public static void setContadorCliente(int contadorCliente) {
        contadorEmpleado = contadorEmpleado;
    }*/
    
    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean getLineaCredito() {
        return this.lineaCredito;
    }

    public void setLineaCredito(boolean lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Número de cliente = ").append(idCliente);
        sb.append(", nombre = ").append(this.nombre);
        sb.append(", Linea de crédito = ").append(lineaCredito);
        sb.append(", fecha de registro = ").append(fechaRegistro);
        sb.append('}');
        return sb.toString();
    }

}