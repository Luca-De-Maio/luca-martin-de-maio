package Proxy;

import java.util.logging.Logger;

public class ConexionProxy implements ICuenta {

    private ICuenta conexionReal;
    private final static Logger LOGGER = Logger.getLogger(ConexionProxy.class.getName());

    public ConexionProxy(ICuenta conexionReal) {
        this.conexionReal = conexionReal;
    }


    @Override
    public Conexion conectarBD( Conexion conexion) {
        LOGGER.info("----Conexion Proxy - Conectar BD----");
        if (conexionReal == null) {
            conexionReal = new ConexionSQLImpl();
            return conexionReal.conectarBD(conexion);
        } else {
            return conexionReal.conectarBD(conexion);
        }    }

    @Override
    public Conexion desconectarBD(Conexion conexion) {
        LOGGER.info("----Desconexion Proxy - Desconectar BD----");
        if (conexionReal == null) {
            conexionReal = new ConexionSQLImpl();
            return conexionReal.desconectarBD(conexion);
        } else {
            return conexionReal.desconectarBD(conexion);
        }
    }



}

