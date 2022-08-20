package edu.it.actors;

import edu.it.utiles.Util;

public class Aldo extends Actor {
	protected void onNewMessage(String t) {
		System.out.println("Soy actor aldo... ");
		System.out.println(t);
		var entero = Integer.parseInt(t);
		if (entero == 23) {
			this.broker.enviarMensaje(new Mensaje("edu.it.alarma", t));
		}
		if (entero % 2 == 0) {
			this.broker.enviarMensaje(new Mensaje("edu.it.pares", t));
		}
		else {
			this.broker.enviarMensaje(new Mensaje("edu.it.impares", t));
		}
		Util.dormir();
		this.broker.enviarMensaje(new Mensaje("edu.it.aldo", (entero + 1)+""));
	}
}
