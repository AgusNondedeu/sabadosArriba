package nicolas;

import nicolas.components.GrabadorDeCompra;
import nicolas.components.LectorDeCompra;
import nicolas.dto.Compra;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");

        String[] parameters = new String[4];
        parameters[0] = args[0];
        parameters[1] = args[1];

        if (args.length < 4)
            parameters[3] = "";
        else
            parameters[3] = args[3];

        if(args.length < 3)
            parameters[2] = "";
        else
            parameters[2] = args[2];

        // Un factory trucho
        LectorDeCompra lectorCompra = (LectorDeCompra)Class.forName(parameters[1])
                                            .getConstructor(String.class, String.class)
                                            .newInstance(parameters[2], parameters[3]);

        GrabadorDeCompra grabadorCompra = (GrabadorDeCompra)Class.forName(parameters[0])
        										.getConstructor()
        										.newInstance();
        
        Compra compra = lectorCompra.leer();
        grabadorCompra.grabar(compra);
    }
}
