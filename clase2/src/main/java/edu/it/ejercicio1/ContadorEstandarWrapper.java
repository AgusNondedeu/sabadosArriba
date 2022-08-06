package edu.it.ejercicio1;

public class ContadorEstandarWrapper implements Displayable {
	Displayable disp;
	
	public ContadorEstandarWrapper(Displayable disp) {
		this.disp = disp;
	}
	
	public void display() {
		System.out.println();
		System.out.println("------------------------------");
		disp.display();
		System.out.println("------------------------------");
		System.out.println();
	}
	
}
