import java.util.ArrayList;

//método q reciba la media y muestre el resultado con consola

public class MostrarResultadoConsola {
    public void mostrar(ArrayList<Estudiante> estudiantes, double media) {
        System.out.println("\n---NOTAS DE ESTUDIANTES---");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Nota: " + estudiante.getNota());
            System.out.println("------------------------");
        }
        System.out.println("\nMedia: " + String.format("%.2f", media));
    }
}
