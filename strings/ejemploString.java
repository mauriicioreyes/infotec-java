public class ejemploString {
    public static void main(String[]args) {
        String nombre, apellido, nombre_apellido;
        nombre = "Mauricio";
        apellido = "Reyes";
        nombre_apellido = nombre + " " + apellido;

        // Atajo sout
        System.out.println("Nombre completo: " + nombre_apellido);

        System.out.println("Nombre completo: " + nombre + " " + apellido);

    }
}