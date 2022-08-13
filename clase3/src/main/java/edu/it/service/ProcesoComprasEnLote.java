package edu.it.service;

import java.util.List;

import edu.it.repository.GrabadorDeCompra;

public class ProcesoComprasEnLote implements ProcesoCompra {
	private List<LectorDeCompra> lectoresDeCompra;
	private GrabadorDeCompra grabadorDeCompra;
	
	public ProcesoComprasEnLote(List<LectorDeCompra> lectoresDeCompra, GrabadorDeCompra grabadorDeCompra) {
		this.lectoresDeCompra = lectoresDeCompra;
		this.grabadorDeCompra = grabadorDeCompra;
	}
	
	public void run() {
		// LectorDeCompra lo puedo reutilizar
		// Ahora bien, puedo usar un patron que se llama
		// CommandPattern.
		// Voy a recibir precargados todos los lectores
		
		for (var lector : lectoresDeCompra) {
			var compra = lector.leer();
			grabadorDeCompra.grabar(compra);
			try { Thread.sleep(10000); } catch (Exception ex) {}
		}
	}
}
