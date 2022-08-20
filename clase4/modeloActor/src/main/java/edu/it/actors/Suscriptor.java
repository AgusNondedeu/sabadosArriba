package edu.it.actors;

public class Suscriptor {
	public final String nombre;
	public final Actor actor;
	
	public Suscriptor(String nombre, Actor actor) {
		this.actor = actor;
		this.nombre = nombre;
	}
}
