package edu.it.service;

import edu.it.repository.GrabadorDeCompra;

public class ProcesoCompraUnoUno implements ProcesoCompra {
	private LectorDeCompra lectorDeCompra;
	private GrabadorDeCompra grabadorDeCompra;
	
	public void run() {
		var compra = lectorDeCompra.leer();
		grabadorDeCompra.grabar(compra);
	}
}
