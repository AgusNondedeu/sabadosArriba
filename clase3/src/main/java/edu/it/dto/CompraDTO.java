package edu.it.dto;

public class CompraDTO {
	public final String id;
	public final String cliente;
	public final String autoModelo;
	
	public CompraDTO(String cliente, String autoModelo) {
		this.id = java.util.UUID.randomUUID().toString();
		this.cliente = cliente;
		this.autoModelo = autoModelo;
	}
}
