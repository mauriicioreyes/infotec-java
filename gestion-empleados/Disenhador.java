import java.util.Arrays;

public class Disenhador extends Empleado {
    private String herramientaDeDisenho = "Photoshop";
    private static String[] actividadesDiarias = {"Reuniones de avance", "Elaboración de diseño para páginas webs", "Presentación-ajustes del diseño", ""};


    public Disenhador (String nombre, String apellidos, Integer edad) {
        super(nombre, apellidos, edad, actividadesDiarias, 8000);

    }

    public void imprimirValoresPorDefecto() {
        System.out.println("\nDiseñador: ");
        System.out.println("Nombre: " + getNombre() + " " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Código: " + getCodigoEmpleado());
        System.out.println("Herramienta de diseño: " + herramientaDeDisenho);
        for(int x = 0; x < getActividadesDiarias().length; x++) {
            System.out.println("Actividad " + (x + 1) + ": " + getActividadesDiarias()[x]);
        }
    }

    public void obtenerActividadesDiarias() {
        if (getEdad() <= 25) {
            actividadesDiarias[3] = "Revisión de diseñador SR";
        } else {
            actividadesDiarias[3] = "Apoyo a diseñador JR";
        }

        Arrays.sort(actividadesDiarias);

        System.out.println();
        System.out.println("Actividades Diseñador:");

        for (int x = 0; x < actividadesDiarias.length; x++) {
            System.out.println("Actividad " + (x + 1) + ": " + actividadesDiarias[x]);
        }
    }
}