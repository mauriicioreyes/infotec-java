public class Ejercicio1_2 {
    public static void main(String[] args) {
        
    // 1. Variable
        // - Crear una variable String que contenga "Aprendiendo java",
        String frase = "";
        // - Imprimir su contenido en mayúsculas.
        frase = "Aprendiendo java";
        System.out.println("\nFrase: " + frase.toUpperCase());

    // 2. Número de caracteres
        // - Imprimir el número de caracteres de la variable anterior
        System.out.println("\nN. Caracteres: " + frase.length());
        
    // 3. Suma, resta, división y multiplicación
        // - Crear 2 variables int con valor 5
        int valor1 = 5, valor2 = 5;
        // - Imprimir resultados de suma, resta división y multiplicación
        System.out.println("\nValor1: " + valor1 + "\nValor2: " + valor2 + "\n - Suma: " + (valor1+valor2) + "\n - Resta: " + (valor1-valor2) + "\n - División: " + (valor1/valor2) + "\n - Multiplicación: " + (valor1*valor2));

    // 4. Conversión
        // - Crear variable Double
        Double valorDouble = 20.0;
        String convertirDouble = "\nResultado: " + String.valueOf(valorDouble);
        // - Convertir en String y concatenar "Resultado: " y su resultado
        System.out.println(convertirDouble);

    }



}