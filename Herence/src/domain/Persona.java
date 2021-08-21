package domain;

//esta sera la clase principal
public class Persona{
    protected String nombre; //protected -> sirve para declarar de manera protejida, es el manejador de acceso, lo dejamos protejido para poder hacer la herencia, no queda publico ni privado
    protected char genero;
    protected int edad;
    protected String direccion;


    public Persona(){
    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    //sobre carga crear otro constructor
    
    public Persona(String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion =  direccion;
    }


    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }

}
