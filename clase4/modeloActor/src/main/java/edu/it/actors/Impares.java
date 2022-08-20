package edu.it.actors;

public class Impares extends Actor {
	protected void onNewMessage(String t) {
		System.out.println(t);
		System.out.println("Este es un numero IMPAR");
	}
}
