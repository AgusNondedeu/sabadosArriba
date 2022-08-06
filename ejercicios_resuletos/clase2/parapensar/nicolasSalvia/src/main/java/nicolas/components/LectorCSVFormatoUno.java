package nicolas.components;

import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectorCSVFormatoUno implements LectorCSV {

    @Override
    public String leerArchivo(String fileLocation) throws URISyntaxException {
        try (Reader reader = Files.newBufferedReader(Paths.get(fileLocation))) {
            try (CSVReader csvReader = new CSVReader(reader)) {
                List<String[]> contenido = csvReader.readAll();
                return contenido.get(0)[0] + ";" + contenido.get(0)[1];
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
