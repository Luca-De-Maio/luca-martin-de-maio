package Proxy;

public class ConexionSQLImpl implements ICuenta {

    @Override
    public Conexion conectarBD(Conexion conexion) {
        System.out.println("fuiste conectado a db SQL");
        conexion.printAll();
        return conexion;
    }

    @Override
    public Conexion desconectarBD(Conexion conexion) {
        System.out.println("fuiste desconectado a db SQL");
        conexion.printAll();
        return conexion;
    }


}
