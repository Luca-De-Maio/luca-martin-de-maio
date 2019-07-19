package Builder;

public class PostGreConexionBuilder extends ConexionBuilder {

    // CONCRETE BUILDER.

        @Override
        public void buildHost() {
            conexion.setHost("suave");
        }

        @Override
        public void buildUser() {
            conexion.setUser("dulce");
        }

        @Override
        public void buildPassword() {
            conexion.setPassword("chorizo+alcachofas");
        }

        @Override
        public void buildNombrebd() {
            conexion.setNombrebd("chorizo+alcachofas");
    }



    }


