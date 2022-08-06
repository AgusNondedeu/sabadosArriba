package edu.it.factories;

import edu.it.repository.GrabadorDeCompra;
import edu.it.service.LectorDeCompra;
import edu.it.service.LectorDeCompraPorConsola;

public class Factory {
	public static LectorDeCompra obtenerLectorDeCompra() {
		return new LectorDeCompraPorConsola();
	}
	public static GrabadorDeCompra obtenerGrabadorDeCompra(String grabadorSpec) {
		try {
			GrabadorDeCompra grabadorCompra = (GrabadorDeCompra)Class.forName(grabadorSpec)
					.getConstructor()
					.newInstance();
			
			return grabadorCompra;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException();
		}
	}
}
