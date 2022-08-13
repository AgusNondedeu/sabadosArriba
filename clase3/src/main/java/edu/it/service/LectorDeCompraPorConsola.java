package edu.it.service;

import java.util.Scanner;

import edu.it.dto.CompraDTO;

public class LectorDeCompraPorConsola implements LectorDeCompra {

	@Override
	public CompraDTO leer() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el cliente: ");
		String cliente = teclado.next();
		System.out.println("Ingrese el modelo: ");
		String modelo = teclado.next();
		CompraDTO compra = new CompraDTO(cliente, modelo);
		return compra;
	}

}
