import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    // Repasar videos
    // 1. Expresiones Lambda
    // 2. Funciones de orden superior
    public static void main(String[] args) {

        // Api Stream: Nos ayuda a gestionar listas.

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        List<Integer> numerosFiltrados = new ArrayList<>();

        // Filtrar valores de forma tradicional
        for (int x = 0; x < numeros.size(); x++) {
            if(numeros.get(x) > 30) {
                numerosFiltrados.add(numeros.get(x));
            }
        }

        System.out.println("\nFiltrar normal: " + numerosFiltrados);
        
        // Filtrar valores mediante Api Stream
        // numeros.stream().filter((x) -> x > 30);
        numeros.stream().filter((Integer parametro1) -> {
            return parametro1 > 30;
        });

        System.out.println("\nFiltrar Api Stream (inmutable): " + numeros);

        List<Integer> apiFiltro = numeros.stream().filter((Integer parametro1) -> {
            return parametro1 <= 30;
        }).collect(Collectors.toList());
        
        System.out.println("\nFiltrar Api Stream (nueva lista): " + apiFiltro);
    }
}