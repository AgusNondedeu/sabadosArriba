package edu.it;

import edu.it.factories.FactoryAbstracto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        //Validadores.validarMetodoDeGrabacion(args);
        
        FactoryAbstracto estrategiaCompra = null; // Algun derivado de factory abstracto
        estrategiaCompra.obtenerProcesoCompra().run();
    }
}
