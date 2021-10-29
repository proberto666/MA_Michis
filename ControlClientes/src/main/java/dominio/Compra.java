package dominio;

public class Compra {
    private int id_compra;
    private int id_cliente;
    private double monto;
    
    public Compra(){
    }

    public Compra(int id_compra, int id_cliente, double monto) {
        this.id_compra = id_compra;
        this.id_cliente = id_cliente;
        this.monto = monto;
    }

    public Compra(int id_cliente, double monto) {
        this.id_cliente = id_cliente;
        this.monto = monto;
    }
    
    public Compra(int id_compra, double monto, boolean redFlag) {
        this.id_compra = id_compra;
        this.monto = monto;
    }

    public Compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Compra{id_compra=").append(id_compra);
        sb.append(", id_cliente=").append(id_cliente);
        sb.append(", monto=").append(monto);
        sb.append('}');
        return sb.toString();
    }
}
