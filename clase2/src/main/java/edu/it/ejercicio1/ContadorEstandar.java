package edu.it.ejercicio1;

public class ContadorEstandar implements Displayable {
	   private Integer x = 1;
	   
	   public void display() {
	      System.out.println(x);
	      x++;
	   }
	}