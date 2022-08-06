package nicolas.components;

import nicolas.dto.Compra;
import java.util.Scanner;

public class LectorDeCompraPorConsola implements LectorDeCompra {

	public LectorDeCompraPorConsola(String filepath, String formateador){

	}

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
