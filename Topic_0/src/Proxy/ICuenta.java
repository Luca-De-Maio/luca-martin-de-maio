package Proxy;

public interface ICuenta {
    Conexion conectarBD( Conexion conexion);
    Conexion desconectarBD( Conexion conexion);
}
