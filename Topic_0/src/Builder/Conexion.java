package Builder;

public class Conexion {
    // CLASE PRODUCTO.

        private String host = "";
        private String user = "";
        private String password = "";
        private String nombrebd = "";


        public void setHost(String host) {
            this.host = host;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        public void setNombrebd(String nombrebd) {
            this.nombrebd = nombrebd;
        }

        public String getHost() {
          return host;
        }

        public String getUser() {
             return user;
        }

        public String getPassword() {
            return password;
        }

        public String getNombrebd() {
            return nombrebd;
        }






    }


