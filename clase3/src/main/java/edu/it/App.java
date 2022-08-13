package edu.it;

import edu.it.ejercicio1.Proceso;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        //Validadores.validarMetodoDeGrabacion(args);
        
        // Un factory trucho
        var lectorCompra = Factory.obtenerLectorDeCompra();
        var grabadorCompra = Factory.obtenerGrabadorDeCompra();
        
        
        var compra = lectorCompra.leer();
        grabadorCompra.grabar(compra);
    }
}
