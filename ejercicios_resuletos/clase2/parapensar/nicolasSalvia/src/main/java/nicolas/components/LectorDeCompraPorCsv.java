package nicolas.components;

import nicolas.dto.Compra;

import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;

public class LectorDeCompraPorCsv implements LectorDeCompra{

    private String filePath;
    private String formatoLector;

    public LectorDeCompraPorCsv(String filePath, String formatoLector){
        this.filePath = filePath;
        this.formatoLector = formatoLector;
    }

    @Override
    public Compra leer() {
        try {
            LectorCSV lectorCSV = (LectorCSV) Class.forName(formatoLector).
                    forName(formatoLector)
                    .getConstructor()
                    .newInstance();

            String compra = lectorCSV.leerArchivo(filePath);

            return new Compra(compra.split(";")[0], compra.split(";")[1]);
        } catch (ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException | URISyntaxException e) {
            return null;
        }
    }
}
