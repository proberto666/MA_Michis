package dominio;

public class Insumo {
    private int idInsumo;
    private String nombre;
    private String color;
    private String proveedor;
    private int cantidad;
    private double costo;

    public Insumo() {
    }
    
    public Insumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public Insumo(int idInsumo, String nombre, String color, String proveedor, int cantidad, double costo) {
        this.idInsumo = idInsumo;
        this.nombre = nombre;
        this.color = color;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Insumo{" + "idInsumo=" + idInsumo + ", nombre=" + nombre + ", color=" + color + ", proveedor=" + proveedor + ", cantidad=" + cantidad + ", costo=" + costo + '}';
    }
    
}
