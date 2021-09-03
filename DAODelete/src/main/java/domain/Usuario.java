package domain;

public class Usuario {
    private int id_usuario;
    private String usuario;
    private String contrasena;
    
    //Contructor Vacío
    public Usuario(){
    }

    //Eliminar Usuario
    public Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    //Generar un nuevo usuario
    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    //Modificación de un usuario
    public Usuario(int id_usuario, String usuario, String contrasena) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    //Gets y Sets
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    //.toString
        @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
}
