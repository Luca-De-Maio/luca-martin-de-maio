package Builder;

// CLASE PRINCIPAL.



public class Principal {
    public static void main(String[] args) {
        Cocina cocina = new Cocina(); // Director.
        ConexionBuilder PostGreConexionbuilder = new PostGreConexionBuilder();
        ConexionBuilder sqlconexionbuilder = new SQLConexionBuilder();//instancio constructor concreto,
        // (cualquier instancia clase padre puede ser reemplazada , por cualquier instancia clase hija )

        cocina.setConexionBuilder( sqlconexionbuilder );
        cocina.construirConexion();
        cocina.printAlll();


    }
}
