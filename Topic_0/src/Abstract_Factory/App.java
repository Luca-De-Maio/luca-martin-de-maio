package Abstract_Factory;

import Abstract_Factory.IConexion;

public class App {

	public static void main(String[] args) {
		IFabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
		IConexion cxBD1 = fabricaBD.getBD("MYSQL");

		cxBD1.conectar();

		IFabricaAbstracta fabricaBD1 = FabricaProductor.getFactory("BD");
		IConexion cxBD12 = fabricaBD1.getBD("PostGre");

		cxBD12.conectar();



	}
}
