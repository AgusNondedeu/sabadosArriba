package edu.it;

import edu.it.factories.Factory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        //Validadores.validarMetodoDeGrabacion(args);
        
        var estrategiaUnoUno = Factory.obtenerProcesoCompraEstrategia1();
        estrategiaUnoUno.run();
    }
}
