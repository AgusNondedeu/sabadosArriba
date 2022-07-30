package edu.it;

import edu.it.components.GrabadorDeCompra;
import edu.it.components.GrabadorDeCompraSQL;
import edu.it.components.LectorDeCompra;
import edu.it.components.LectorDeCompraPorConsola;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        // Un factory trucho
        LectorDeCompra lectorConsola = new LectorDeCompraPorConsola();
        GrabadorDeCompra grabadorCompra = (GrabadorDeCompra)Class.forName(args[0])
        										.getConstructor()
        										.newInstance();
        
        var compra = lectorConsola.leer();
        grabadorCompra.grabar(compra);
    }
}
