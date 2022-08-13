package edu.it.factories;

import edu.it.repository.GrabadorDeCompra;
import edu.it.repository.GrabadorDeCompraJSON;
import edu.it.repository.GrabadorDeCompraSQL;
import edu.it.repository.GrabadorDeCompraSQL_O_JSON;
import edu.it.service.LectorArchivoCSV;
import edu.it.service.LectorDeCompra;
import edu.it.service.LectorDeCompraPorConsola;
import edu.it.service.ProcesoCompra;
import edu.it.service.ProcesoCompraUnoUno;
import edu.it.service.ProcesoComprasEnLote;

public class FactoryUtil {
	public static LectorDeCompra obtenerLectorDeCompra() {
		return new LectorDeCompraPorConsola();
	}
	public static GrabadorDeCompra obtenerGrabadorDeCompra() {
		try {
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
