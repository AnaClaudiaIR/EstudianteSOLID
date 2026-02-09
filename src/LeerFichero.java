import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//método que reciba el path del fichero y devuelva un arraylist de String
public class LeerFichero {
    private List<String> listaFichero;
    public LeerFichero() throws IOException { //Constructor --> Leer el fichero y guardar cada línea en un array
        listaFichero = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!(line.isEmpty())) {
                    listaFichero.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer fichero: " + e.getMessage());
        }
    }
    public List<String> getListaFichero() {
        return listaFichero;
    }
}
