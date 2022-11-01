public class ejerciciosStrings {
    public static void main (String [] args) {
        String fraseInicial = "Hola Mundo Java";
        System.out.println("Frase Inicial: " + fraseInicial);

        // 1. Obtener la longitud del texto "Hola Mundo Java".
        System.out.println("\nLongitud: " + fraseInicial.length() + " caracteres");

        int count = 0;

        for (int x = 0; x < fraseInicial.length(); x++) {
            count++;
        }

        System.out.println("Longitud2: " + count + " caracteres");

        // 2. Eliminar los espacios del texto: "Hola Mundo Java".
        String fraseSinEspacios = fraseInicial.replace(" ", "");

        System.out.println("\nSin espacios 1: " + fraseSinEspacios);


        String fraseSinEspacios2 = "";
        for (int x = 0; x < fraseInicial.length(); x++) {
            if (fraseInicial.charAt(x) != ' ') {
                fraseSinEspacios2 += fraseInicial.charAt(x);
            }
        }

        System.out.println("Sin espacios 2: " + fraseSinEspacios2);

        // 3. Imprimir caracter por caracter la palabra "Hola Mundo Java".
        System.out.print("\nPor caracter: ");
        for (int x = 0; x < fraseInicial.length(); x++) {
            System.out.print(fraseInicial.charAt(x) + " ");
        }

        // 4. Invierte la cadena "Hola Mundo Java".
        String fraseInvertida = "";

        for (int x = fraseInicial.length() -1; x >= 0; x--) {
            fraseInvertida += fraseInicial.charAt(x);
        }

        System.out.println("\n\nFrase invertida: " + fraseInvertida);

        // 5. Cuenta las vocales de la palabra "Hola Mundo Java".
        int contadorVocales = 0;
        String vocales = "aeiou";

        for (int x = 0; x < fraseInicial.length(); x++) {
            if (vocales.indexOf(fraseInicial.charAt(x)) != -1) {
                contadorVocales++;
            }
        }

        System.out.println("\nVocales: " + contadorVocales);

        // 6. Contar el número de palabras en la cadena "Hola Mundo Java".
        String[] arrayString = fraseInicial.split(" ");
        System.out.println("\nPalabras: " + arrayString.length);

        for (int x = 0; x < arrayString.length; x++) {
            System.out.println("arrayString[" + x + "]: " + arrayString[x]);
        }

        // 7. Usando la cadena "Hola Mundo Java" agrega un guión medio (-) a lado derecho de cada caractér.
        String fraseGuion = "";

        for (int x = 0; x < fraseInicial.length(); x++) {
            fraseGuion += fraseInicial.charAt(x) + "-";
        }

        System.out.println("\n" + fraseGuion);

        // 8. Obtiene de cada caracter de la cadena "Hola Mundo Java" su código ASCII.
        System.out.println("Código ASCII");

        for (int x = 0; x < fraseInicial.length(); x++) {
            System.out.println("ASCII: " + (int)fraseInicial.charAt(x) + ", Caracter: " + fraseInicial.charAt(x));
        }

        // 9. Usando la cadena "Hola Mundo Java" obten la palabra JAVA
        System.out.println("\nFrase: " + fraseInicial + "\nFunción substring(11): " + fraseInicial.substring(11));
        
        fraseInicial = "Hola Java Mundo";
        System.out.println("\nFrase: " + fraseInicial + "\nFunción substring(5, 9): " + fraseInicial.substring(5, 9));
    }
}