package Abstract_Factory;

public class ConexionPostGre extends ConexionBase{
    public ConexionPostGre(){
        host = "3098" ;
        puerto = "puertazo";
        usuario = "user";
        contrasena = "pass";
    }

    @Override
    public void conectar() {
        System.out.println("se conecto a delcanio");
    }

    @Override
    public void desconectar() {
        System.out.println("se desconecto a delcanio");
    }

}
