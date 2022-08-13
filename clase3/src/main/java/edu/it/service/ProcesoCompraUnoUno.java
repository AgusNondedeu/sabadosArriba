package edu.it.service;

import edu.it.repository.GrabadorDeCompra;

public class ProcesoCompraUnoUno implements ProcesoCompra {
	private LectorDeCompra lectorDeCompra;
	private GrabadorDeCompra grabadorDeCompra;
	
	public ProcesoCompraUnoUno(LectorDeCompra lectorDeCompra, GrabadorDeCompra grabadorDeCompra) {
		this.lectorDeCompra = lectorDeCompra;
		this.grabadorDeCompra = grabadorDeCompra;
	}
	
	public void run() {
		var compra = lectorDeCompra.leer();
		grabadorDeCompra.grabar(compra);
	}
}
