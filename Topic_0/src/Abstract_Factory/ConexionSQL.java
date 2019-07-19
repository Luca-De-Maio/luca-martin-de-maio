package Abstract_Factory;

public class ConexionSQL extends ConexionBase {

    public ConexionSQL(){
        host = "3098" ;
        puerto = "puertazo";
        usuario = "user";
        contrasena = "pass";
    }

    @Override
    public void conectar() {
        System.out.println("se conecto a SQL");
    }

    @Override
    public void desconectar() {
        System.out.println("se desconecto a SQL");
    }
}
