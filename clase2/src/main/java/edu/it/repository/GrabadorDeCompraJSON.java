package edu.it.repository;

import com.google.gson.Gson;

import edu.it.dto.CompraDTO;

public class GrabadorDeCompraJSON implements GrabadorDeCompra {

	private String obtenerPathSegunId(CompraDTO compra) {
		return new StringBuilder()
		.append("/var/sabadosarriba/compras/")
		.append("id")
		.append(".json")
		.toString();
	}
	
	@Override
	public void grabar(CompraDTO compra) {
		String enJson = new Gson().toJson(compra);
		System.out.println(enJson);
	}

}
