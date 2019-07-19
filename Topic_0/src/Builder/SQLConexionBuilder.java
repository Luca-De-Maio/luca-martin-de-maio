package Builder;

public class SQLConexionBuilder extends ConexionBuilder {
        @Override
        public void buildHost() {
            conexion.setHost("3067");
        }

        @Override
        public void buildUser() {
            conexion.setUser("user");
        }

        @Override
        public void buildPassword() {
            conexion.setPassword("Pass");
        }

        @Override
        public void buildNombrebd() {
        conexion.setNombrebd("DBMIDNIGHT");
    }


}


