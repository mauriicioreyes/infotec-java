public class metodosString {
    public static void main (String [] args) {
        String cadena = "cadena de texto";

        // Length();
        System.out.println("Función length(): " + cadena.length());

        // Substring(beginIndex);
        System.out.println("Función substring(): " + cadena.substring(6));

        // Substring(beginIndex, endIndex);
        System.out.println("Función substring(int i, int j): " + cadena.substring(6, 14));

        // indexOf(str);
        System.out.println("Función indexOf('c'): " + cadena.indexOf("c"));
        System.out.println("Función indexOf('o'): " + cadena.indexOf("o"));

        // boolean
        // equals(anObject:"cadena de texto");
        System.out.println("Función equals(): " + cadena.equals("cadena de TEXTO"));

        // equalsIgnoreCase(anotherString);
        System.out.println("Función equalsIgnoreCase(): " + cadena.equalsIgnoreCase("CADENA de TEXTO")); 

        // toUpperCase();
        System.out.println("Función toUpperCase(): " + cadena.toUpperCase());

        // toLowerCase();
        System.out.println("Función toLowerCase(): " + cadena.toLowerCase());
    }
}