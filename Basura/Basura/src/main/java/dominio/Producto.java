package dominio;

public class Producto {

    
    private int idProducto;
    private String nombre;
    private int cantidad;
    private double precio;
    private String img;

    public Producto() {
    }
    
    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(int idProducto, String nombre, int cantidad, double precio, String img) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.img = img;
    }
    
    public Producto(String nombre, int cantidad, double precio, String img) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.img = img;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

     public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", img =" + img + '}';
    }
    
}
