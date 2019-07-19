package Abstract_Factory;

import Abstract_Factory.IFabricaAbstracta;

public class FabricaProductor {

    public static IFabricaAbstracta getFactory(String tipoFabrica) {

        if (tipoFabrica.equalsIgnoreCase("BD")) {
            return new ConexionFabrica();

        }
        //here we put the others factories if they exist

        return null;
    }

}
