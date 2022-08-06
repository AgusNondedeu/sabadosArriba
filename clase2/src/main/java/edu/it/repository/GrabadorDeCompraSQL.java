package edu.it.repository;

import edu.it.dto.CompraDTO;

public class GrabadorDeCompraSQL implements GrabadorDeCompra {
	public void grabar(CompraDTO compra) {
		String sql ="insert into compra(cliente,modelo) values (" +compra.cliente + "'," + compra.autoModelo+ "')";
		System.out.println("Grabando SQL...");
		System.out.println(sql);
	}
	
}
