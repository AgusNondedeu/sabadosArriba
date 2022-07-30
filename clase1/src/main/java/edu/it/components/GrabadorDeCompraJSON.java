package edu.it.components;

import com.google.gson.Gson;

import edu.it.dto.Compra;

public class GrabadorDeCompraJSON implements GrabadorDeCompra {

	@Override
	public void grabar(Compra compra) {
		String enJson = new Gson().toJson(compra);
		System.out.println(enJson);
	}

}
