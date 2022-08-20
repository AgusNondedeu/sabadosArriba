package edu.it.factories;

import dialerpluspro.DialerPro;
import edu.it.services.DiscadorAdapter;
import edu.it.services.ServicioDiscador;

public class Factory {
	public static ServicioDiscador crearDiscador() {
		// return new ServicioDiscador(new DiscadorPotencia());
		return new ServicioDiscador(new DiscadorAdapter(new DialerPro()));
	}
}
