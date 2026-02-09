import java.util.ArrayList;
import java.util.List;

//Método que parsee el arraylist de string y devuelva un arraylist de estudiante
public class ParsearFichero {
    private List<Estudiante> estudiantes; //

    public ParsearFichero(ArrayList<String> listaFichero) {
        estudiantes = new ArrayList<>();
        for (String linea : listaFichero) {
            try {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    String nombre = partes[0];
                    double nota = Double.parseDouble(partes[1]);
                    estudiantes.add(new Estudiante(nombre,nota));
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: "+ e.getMessage());
            }
        }
        System.out.println(estudiantes.size() + " estudiantes agregados.");
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
