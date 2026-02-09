import java.util.List;

//método que trabaje con el arraylist de estudiante y devuelva la media
public class CalcularMedia {
    public double calcularMedia(List<Estudiante> estudiantes) {
        double suma = 0;
        int totalNotas = estudiantes.size();
        double media = 0;
        for (Estudiante estudiante : estudiantes) {
          if (totalNotas == 0) {
              return 0;
          } else {
              suma += estudiante.getNota();
              media = suma / totalNotas;
          }
        }
        return media;
    }
}
