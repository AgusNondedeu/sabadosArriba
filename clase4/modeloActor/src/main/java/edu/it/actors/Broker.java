package edu.it.actors;

public interface Broker {
	void suscribe(Suscriptor sus);
	void enviarMensaje(Mensaje mensaje);
}
