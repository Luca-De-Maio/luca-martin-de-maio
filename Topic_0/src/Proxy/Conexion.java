package Proxy;

public class Conexion {

    private int host;
    private String usuario;
    private String password;
    private String nombrebd;

    public Conexion(int host, String usuario, String password, String nombrebd) {
        this.host = host;
        this.usuario = usuario;
        this.password = password;
        this.nombrebd = nombrebd;
    }

    public void printAll(){
        System.out.println("Host : "+ getHost());
        System.out.println("Usuario : "+getUsuario());
        System.out.println("Password : "+ getPassword());
        System.out.println("Password : "+ getNombrebd());
    }

    public int getHost() {
        return host;
    }

    public void setHost(int host ) {
        this.host = host;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setNombrebd(String nombrebd) {
        this.nombrebd = nombrebd;
    }

    public String getNombrebd() {
        return nombrebd;
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

}

