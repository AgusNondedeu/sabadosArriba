package edu.it.repository;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

import edu.it.dto.CompraDTO;

public class GrabadorDeCompraJSON implements GrabadorDeCompra {

	private String obtenerPathSegunId(CompraDTO compra) {
		return new StringBuilder()
		.append("/var/sabadosarriba/compras/")
		.append(compra.id)
		.append(".json")
		.toString();
	}
	
	@Override
	public void grabar(CompraDTO compra) {
		String enJson = new Gson().toJson(compra);
	
		String path = obtenerPathSegunId(compra);
		try {
			FileUtils.writeStringToFile(new File(path), enJson, "UTF-8");
		}
		catch (Exception ex) {
			throw new RuntimeException();
		}
		System.out.println(enJson);
	}

}
