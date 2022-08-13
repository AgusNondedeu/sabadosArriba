package edu.it.repository;

import edu.it.components.ConectorJPA;
import edu.it.dto.CompraDTO;
import edu.it.entities.Compra;

public class GrabadorDeCompraSQL implements GrabadorDeCompra {
	public void grabar(CompraDTO compraDTO) {
		/*
		String sql ="insert into compra(cliente,modelo) values (" +compra.cliente + "'," + compra.autoModelo+ "')";
		System.out.println("Grabando SQL...");
		System.out.println(sql);
		*/
		
		var compra = new Compra();
		compra.id = compraDTO.id;
		compra.cliente = compraDTO.cliente;
		compra.autoModelo = compraDTO.autoModelo;
		
		var conn = new ConectorJPA();
		var em = conn.getEntityManager();
		var tx = em.getTransaction();
		tx.begin();
		em.persist(compra);
		tx.commit();
	}
}
