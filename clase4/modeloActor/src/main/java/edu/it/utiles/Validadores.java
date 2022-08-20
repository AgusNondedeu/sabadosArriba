package edu.it.utiles;

public class Validadores {
	public static void validarMetodoDeGrabacion(String... params) {
		if (params.length == 0) {
			throw new RuntimeException("ATENCION !!! NO VINO NINGUN METODO DE GRABACION");
		}
	}
}
