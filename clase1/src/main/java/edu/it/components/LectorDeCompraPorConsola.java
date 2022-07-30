package edu.it.components;

import java.util.Scanner;

import edu.it.dto.Compra;

public class LectorDeCompraPorConsola implements LectorDeCompra {

	@Override
	public Compra leer() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el cliente: ");
		String cliente = teclado.next();
		System.out.println("Ingrese el modelo: ");
		String modelo = teclado.next();
		Compra compra = new Compra(cliente, modelo);
		return compra;
	}

}
