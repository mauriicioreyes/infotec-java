public class Clase2 {
    private static String mensaje;
    private static Boolean existe;
    private static Double precio;

    public Clase2() {

    }

    public Clase2(String mensaje, Boolean existe, Double precio) {
        Clase2.mensaje = mensaje;
        Clase2.existe = existe;
        Clase2.precio = precio;
    }
    @Override
    public boolean equals(Object object) {
        if(object instanceof Clase2) {
            return Clase2.mensaje.equals(Clase2.getMensaje());
        } else {
            return false;
        }
    }

    public static String saludar(String cadena) {
        return "saludar(): " + cadena;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static Clase1 metodo1 (Clase1 clase) {
        clase.setNombre(null);
        clase.setEntero(null);
        clase.setLetra(null);
        clase.setEstado(null);
        clase.setCantidad(null);
        return clase;

    }

    public static String metodo2 (String a, String b) {
        return a + "-" + b;
    }

    public static String getMensaje() {
        return mensaje;
    }

    public static void setMensaje(String mensaje) {
        Clase2.mensaje = mensaje;
    }

    public static Boolean getExiste() {
        return existe;
    }

    public static void setExiste(Boolean existe) {
        Clase2.existe = existe;
    }

    public static Double getPrecio() {
        return precio;
    }

    public static void setPrecio(Double precio) {
        Clase2.precio = precio;
    }
}