package edu.it.factories;

import edu.it.repository.GrabadorDeCompra;
import edu.it.repository.GrabadorDeCompraJSON;
import edu.it.repository.GrabadorDeCompraSQL;
import edu.it.repository.GrabadorDeCompraSQL_O_JSON;
import edu.it.service.LectorDeCompra;
import edu.it.service.LectorDeCompraPorConsola;

public class Factory {
	public static LectorDeCompra obtenerLectorDeCompra() {
		return new LectorDeCompraPorConsola();
	}
	public static GrabadorDeCompra obtenerGrabadorDeCompra() {
		try {
			/*
			GrabadorDeCompra grabadorCompra = (GrabadorDeCompra)Class.forName(grabadorSpec)
					.getConstructor()
					.newInstance();
			
			return grabadorCompra;
			*/
			return GrabadorDeCompraSQL_O_JSON
				.build()
				.agregarGrabadorSQL(new GrabadorDeCompraSQL())
				.agregarGrabadorJSON(new GrabadorDeCompraJSON());
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException();
		}
	}
}
