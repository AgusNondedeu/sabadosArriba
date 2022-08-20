package edu.it.actors;

import edu.it.utiles.Util;

public class Actor1 extends Actor {
	private Integer contador = 0;
	
	protected void onNewMessage(String t) {
		this.broker.enviarMensaje(new Mensaje("edu.it.aldo", t + t));
	}
}
