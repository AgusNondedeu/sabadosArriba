package edu.it;

import edu.it.factories.FactoryAbstracto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        var facAbs = (FactoryAbstracto)Class.forName(args[0])
        .getConstructor()
        .newInstance();
        
        facAbs.obtenerProcesoCompra().run();
    }
}
