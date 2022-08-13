package edu.it.factories;

import edu.it.service.LectorArchivoCSV;
import edu.it.service.ProcesoCompra;
import edu.it.service.ProcesoComprasEnLote;

public class CompraEnLote implements FactoryAbstracto {
	public ProcesoCompra obtenerProcesoCompra() {
		return new ProcesoComprasEnLote(
				new LectorArchivoCSV().leerArchivoCSV(),
				FactoryUtil.obtenerGrabadorDeCompra()
			);
	}
	
}
