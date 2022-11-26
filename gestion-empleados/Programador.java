import java.util.Arrays;
import java.util.Collections;

public class Programador extends Empleado{
    private String herramientaDeDesarrollo = "Eclipse";
    private static String[] actividadesDiarias = {"Analisis de requerimientos", "Desarrollo de requerimientos", "Presentación-pruebas unitarias"};

    public Programador(String nombre, String apellidos, Integer edad) {
        super(nombre, apellidos, edad, actividadesDiarias, 9000);
    }

    public void imprimirValoresPorDefecto() {
        System.out.println("\nProgramador:");
        System.out.println("Nombre: "+ getNombre() + " " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Código: " + getCodigoEmpleado());
        System.out.println("Herramienta de desarrollo: " + herramientaDeDesarrollo);
        for (int x = 0; x < actividadesDiarias.length; x++) {
            System.out.println("Actividad " + (x + 1) + ": " + getActividadesDiarias()[x]);
        }
    }

    public void obtenerActividadesDiarias() {
        String[] actividades = new String[actividadesDiarias.length];

        for (int x = 0; x < actividades.length; x++) {
            actividades[x] = actividadesDiarias[x].substring(1, actividadesDiarias[x].length()-1);
        }
        
        // Arrays.sort(actividades);
        Arrays.sort(actividades, Collections.reverseOrder());
        
        System.out.println();
        System.out.println("Actividades Programador:");
        for (int x = 0; x < actividades.length; x++) {
            System.out.println("Actividad " + (x + 1) + ": " + actividades[x]);
        }
    }
}