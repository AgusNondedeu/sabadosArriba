package edu.it.ejercicio1;

public class Proceso implements Runnable {
   public void run() {
      Displayable dispOriginal = new ContadorEstandar();
      Displayable dispWrapper = new ContadorEstandarWrapper(dispOriginal);

      Displayable disp = dispWrapper;

      Boolean x = false;
      
      for (;;) {
    	  disp = x ? dispOriginal : dispWrapper;
    	  disp.display();
    	  x = !x;
      }
   }
}