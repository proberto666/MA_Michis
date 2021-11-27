package dominio;

public class Usuario {
    private int idUsuario;
    private String usuario;
    private String password;
    private String contacto;
    private String nivel;
    
    public Usuario() {
    }
    
    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
    

    public Usuario(int idUsuario, String usuario, String password, String contacto, String nivel) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
        this.contacto = contacto;
        this.nivel = nivel;
    }

    public Usuario(String usuario, String password, String contacto, String nivel) {
        this.usuario = usuario;
        this.password = password;
        this.contacto = contacto;
        this.nivel = nivel;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", usuario=" + usuario + ", password=" + password + ", contacto=" + contacto + ", nivel=" + nivel + '}';
    }   
    
}
