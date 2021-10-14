package beans;

public class habitacion {
     private int numero;
    private boolean disponible;
    
    public habitacion(int n, boolean b){
        numero=n;
        disponible = b;
    }
    
    public habitacion (){}

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
