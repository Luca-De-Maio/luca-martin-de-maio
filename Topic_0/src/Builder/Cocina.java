package Builder;

public class Cocina {

        private ConexionBuilder conexionBuilder;

        public void setConexionBuilder(ConexionBuilder pb) {
            conexionBuilder = pb;
        }

        public Conexion getConexion() {
            return conexionBuilder.getConexion();
        }

        public void construirConexion() {
            conexionBuilder.crearNuevaConexion();
            conexionBuilder.buildHost();
            conexionBuilder.buildUser();
            conexionBuilder.buildPassword();
            conexionBuilder.buildNombrebd();
        }

         public void printAlll(){
            conexionBuilder.printAll();
    }



}


