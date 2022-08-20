package edu.it.actors;

public class Mensaje {
	public final String destinatario;
	public final String data;
	
	public Mensaje(String destinatario, String data) {
		this.destinatario = destinatario;
		this.data = data;
	}
}