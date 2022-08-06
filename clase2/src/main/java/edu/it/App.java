package edu.it;

import edu.it.factories.Factory;
import edu.it.utiles.Validadores;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        Validadores.validarMetodoDeGrabacion(args);
        
        // Un factory trucho
        var lectorCompra = Factory.obtenerLectorDeCompra();
        var grabadorCompra = Factory.obtenerGrabadorDeCompra(args[0]);
        
        
        var compra = lectorCompra.leer();
        grabadorCompra.grabar(compra);
    }
}
