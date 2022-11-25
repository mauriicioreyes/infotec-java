import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 1) Genera un arreglo con los siguientes valores [14, 33, 21, 45, 1], obtener valor mayor y el valor menor e imprimirlos en consola.
        Integer[] valores = {14, 33, 21, 45, 1};
        int mayor = 0, menor = 0, i = 0;
        // 1.1) Primer forma de ordenar valores
        
        for (int x = 0; x < valores.length; x++) {
            if (mayor == 0) {
                mayor = valores[x];
                menor = valores[x];
            }
            
            if (mayor < valores[x]) { mayor = valores[x]; }
            if (menor > valores[x]) { menor = valores[x]; }
        }
        
        System.out.println("\nMayor: " + mayor + ", menor: " + menor);
        
        // 1.2) Segunda forma de ordenar valores
        Arrays.sort(valores);
        System.out.print("\nOrdenar valores (menor a mayor) mediante Arrays.sort(): ");
        for (int x = 0; x < valores.length; x++) { System.out.print(valores[x] + ", "); }

        Arrays.sort(valores, Collections.reverseOrder());
        System.out.print("\nOrdenar valores (mayor a menor) mediante Arrays.sort(valores, Collections.reverseOrder()): ");
        for (int x = 0; x < valores.length; x++) { System.out.print(valores[x] + ", ");}

        // Imprime mayor y menor con la segunda forma
        System.out.println();
        System.out.println("\nMayor: " + valores[0] + ", menor: " + valores[valores.length-1]);

        // 2) Genera un arreglo con las siguientes cadenas de texto: "Hola Mundo", "Hola Java" y "Hola Curso", obtener el segundo elemento del arreglo y generar un arreglo que contenga cada caracter de la cadena de texto
        System.out.println();
        String[] cadenas = {"Hola Mundo", "Hola Java", "Hola Curso"};
        char[] caracteres = new char[cadenas[1].length()];
        for (int x = 0; x < cadenas[1].length(); x++) {
            caracteres[x] = cadenas[1].charAt(x);
            System.out.print(caracteres[x] + " - ");
        }

        // 3) Agrega 10 valores de tipo Integer en un arreglo, imprime cada uno de los valores y su índice correspondiente
        System.out.println("\n");
        Integer[] valoresInteger = {1, 10, 30, 29, 4, 56, 100, 9, 99, 66};
        // for (int x = 0; x < valoresInteger.length; x++) {
        //     System.out.println("Índice: " + x + ", Valor: " + valoresInteger[x]);
        // }
        while (i < valoresInteger.length) {
            System.out.println("Índice: " + i + ", valor: " + valoresInteger[i]);
            i++;
        }

        // 4) Utilizando el arreglo del ejercicio anterior, copia su contenido a otro arreglo que se llame "copiaEjercicio3" e imprime cada valor de ambos arreglos en consola
        
        // 4.1) Primer forma
        System.out.println("\nPrimer forma: ");
        Integer[] copia = new Integer[valoresInteger.length];
        for (int x = 0; x < copia.length; x++) {
            copia[x] = valoresInteger[x];
            System.out.println("\nvaloresInteger: índice: " + x + ", valor: " + valoresInteger[x]);
            System.out.println("copia: índice: " + x + ", valor: " + copia[x]);
        }

        // 4.2) Segunda forma
        System.out.println("\nSegunda forma: ");
        Integer[] copia2 = Arrays.copyOf(valoresInteger, valoresInteger.length);
        for (int x = 0; x < copia2.length; x++) {
            System.out.println("\nvaloresInteger: índice: " + x + ", valor: " + valoresInteger[x]);
            System.out.println("copia2: índice: " + x + ", valor: " + copia2[x]);
        }

        // 5) Genera un arreglo que contenga los nombres de 5 alumnos y otro arreglo que contenga las calificaciones de estos
        // 5 alumnos con los siguientes valores: [6, 7, 4, 10, 5], ahora en el tercer arreglo 
        // guardaremos los siguientes datos para cada alumno:
        // El nombre del alumno, la calificación y la palabra "Aprobado"
        // en caso de que su calificación sea mayor a 6 y "Reprobado" en caso contrario,
        // imprime los valores de este tercer arreglo en consola.
        System.out.println();
        System.out.println("RESULTADOS DE ALUMNOS");
        String[] alumnos = {"Carlos", "Mireya", "Francisco", "Karla", "Brenda"};
        Integer[] calificaciones = {6, 7, 4, 10, 5};
        String[] resultados = new String[alumnos.length];
        
        for (int x = 0; x < resultados.length; x++) {
            String resultado = "Aprobado";
            if (calificaciones[x] < 7) {
                resultado = "Reprobado";
            }
            resultados[x] = "Nombre: " + alumnos[x] + ", Calificación: " + calificaciones[x] + ", " + resultado;
            System.out.println(resultados[x]);
        }

        System.out.println();

        // Implementando operador ternario
        String[] resultados2 = new String[alumnos.length];
        for (int x = 0; x < resultados2.length; x++) {
            resultados2[x] = "Nombre: " + alumnos[x] + ", Calificación: " + calificaciones[x] + ", " + (calificaciones[x] > 6 ? "Aprobado" : "Reprobado");
            System.out.println(resultados2[x]);
        }
    }
}