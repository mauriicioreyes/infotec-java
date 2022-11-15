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

        
        System.out.println("\n--------------------------------");

        // Modificar valores de forma tradicional
        for(int x = 0; x < numeros.size(); x++) {
            numeros.set(x, numeros.get(x) + 5);
        }

        System.out.println("\nModificar normal: " + numeros);

        // Modificar valores mediante Api Stream
        List<Integer> numerosFiltrados2 = new ArrayList<>();

        numerosFiltrados2 = numeros.stream().map((x) -> x + 5).collect(Collectors.toList());

        System.out.println("\nModificar Api Stream (map): " + numerosFiltrados2);


        System.out.println("\n--------------------------------");

        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona(1, "Mauricio", "Reyes"));
        listaPersonas.add(new Persona(2, "Michel", "Reyes"));
        listaPersonas.add(new Persona(3, "Patricia", "Moreno"));
        listaPersonas.add(new Persona(4, "Victor", "García"));
        listaPersonas.add(new Persona(5, "José", "Velazco"));

        // Forma tradicional para enviar datos a PersonaDTO
        System.out.println("\nForma tradicional: \n");
        List<PersonaDTO> dataDTO = new ArrayList<>();
        for(Persona persona:listaPersonas) {
            dataDTO.add(new PersonaDTO(persona));
        }

        for(PersonaDTO persona:dataDTO) {
            System.out.println(persona.nombreApellido);
        }

        // Implementa Stream para objetos
        System.out.println("\nObjeto mediante Api Stream y Clase DTO: \n");

        List<PersonaDTO> personasData = listaPersonas.stream().map(PersonaDTO::new).collect(Collectors.toList());

        personasData.stream().forEach(x -> System.out.println(x.nombreApellido));
    }
}