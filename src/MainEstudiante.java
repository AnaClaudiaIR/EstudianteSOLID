import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainEstudiante {
    public  static void main(String[] args) throws IOException {
        LeerFichero leerFichero = new LeerFichero();
        List<String> lista = leerFichero.getListaFichero();

        ParsearFichero parsearFichero = new ParsearFichero((ArrayList<String>) lista);
        List<Estudiante> estudiantes = parsearFichero.getEstudiantes();

        CalcularMedia calcularMedia = new CalcularMedia();
        double media = calcularMedia.calcularMedia(estudiantes);

        MostrarResultadoConsola mostrador = new MostrarResultadoConsola();
        mostrador.mostrar((ArrayList<Estudiante>) estudiantes, media);
    }
}
