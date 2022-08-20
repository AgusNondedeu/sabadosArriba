package edu.it.actors;

public class Alarma extends Actor {
	protected void onNewMessage(String t) {
		System.out.println("******************************************************");
		System.out.println("Esta es una alarma porque ha llegado el numero: " + t);
		System.out.println("******************************************************");
	}
}
