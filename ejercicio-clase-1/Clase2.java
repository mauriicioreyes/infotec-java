public class Clase2 {
    public static Integer atributo1;
    public static String atributo2;
    public static Double atributo3;

    public static Clase1 metodo1(Clase1 clase1) {
        return new Clase1(null, null, null, null, null);
    }

    // MÉTODO TRAMPA:
    // Los parámetros no pueden ser estáticos, no pueden declararse de manera estática
    public static String metodo2(String string1, String string2) {
        return string1 + " - " + string2;
    }
}