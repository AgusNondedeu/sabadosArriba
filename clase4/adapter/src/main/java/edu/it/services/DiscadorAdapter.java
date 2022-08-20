package edu.it.services;

import dialerpluspro.DialerPro;
import dialerpluspro.InfoCall;
import dialerpluspro.User;
import edu.it.model.DatosLlamada;
import edu.it.model.Usuario;

public class DiscadorAdapter implements IDiscador {
	DialerPro dialerPlusPro;
	
	public DiscadorAdapter(DialerPro dialerPlusPro) {
		this.dialerPlusPro = dialerPlusPro;
	}

	public DatosLlamada realizarLlamada(Usuario u) {
		// Conversion de Usuario a User
		var infoCall = dialerPlusPro.dial(new User());
		// Conversion de info call a DatosLlamada
		return new DatosLlamada();
	}

	public void emitirMensaje(DatosLlamada datosLlamada) {
		// Conversion de datos llamada a InfoCall
		dialerPlusPro.playMessage(new InfoCall());
	}

	public void cortar(DatosLlamada datosLlamada) {
		// Conversion de datos llamada a info call
		dialerPlusPro.hangup(new InfoCall());
	}
}
