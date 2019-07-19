package Builder;
    // ABSTRACT BUILDER.
    public abstract class ConexionBuilder {

        protected Conexion conexion;

        public Conexion getConexion() {
            return conexion;
        }

        public void crearNuevaConexion() {
            conexion = new Conexion();
        }

        public abstract void buildHost();
        public abstract void buildUser();
        public abstract void buildPassword();
        public abstract void buildNombrebd();

        public void printAll(){
            System.out.println("Host : "+  conexion.getHost());
            System.out.println("Usuario : "+ conexion.getUser());
            System.out.println("Password : "+ conexion.getPassword());
            System.out.println("Nombrebd : "+ conexion.getNombrebd());
    }
    }


