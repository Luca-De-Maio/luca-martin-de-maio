package Proxy;

public class App {

    public static void main(String[] args) {
        Conexion c = new Conexion(1, "user", "pass",  "sql");

        ICuenta cuentaProxy = new ConexionProxy(new ConexionSQLImpl());
        cuentaProxy.conectarBD(c);
        cuentaProxy.desconectarBD(c);

    }

}
