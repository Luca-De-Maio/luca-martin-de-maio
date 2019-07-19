package Abstract_Factory;

import Abstract_Factory.IConexion;
import Abstract_Factory.ConexionSQL;
import Abstract_Factory.ConexionVacia;

public class ConexionFabrica implements IFabricaAbstracta{


	@Override
	public IConexion getBD(String motor) {

		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionSQL();
		}  else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostGre();
		}

		return new ConexionVacia();

	}
}
