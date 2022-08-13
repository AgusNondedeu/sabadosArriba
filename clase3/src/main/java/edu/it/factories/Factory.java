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
	public static ProcesoCompra obtenerProcesoCompraEstrategia1() {
		return new ProcesoCompraUnoUno(
					obtenerLectorDeCompra(),
					obtenerGrabadorDeCompra()
				);
	}
	public static ProcesoCompra obtenerProcesoCompraEstrategia2() {
		return new ProcesoComprasEnLote(
					new LectorArchivoCSV().leerArchivoCSV(),
					obtenerGrabadorDeCompra()
				);
	}
}
