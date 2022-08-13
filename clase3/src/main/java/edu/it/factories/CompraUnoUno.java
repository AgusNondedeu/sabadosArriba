package edu.it.factories;

import edu.it.service.ProcesoCompra;
import edu.it.service.ProcesoCompraUnoUno;

public class CompraUnoUno implements FactoryAbstracto {
	public ProcesoCompra obtenerProcesoCompra() {
		return new ProcesoCompraUnoUno(
				FactoryUtil.obtenerLectorDeCompra(),
				FactoryUtil.obtenerGrabadorDeCompra()
			);
	}
	
}
