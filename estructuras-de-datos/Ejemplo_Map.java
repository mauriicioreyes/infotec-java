import java.util.Map;
import java.util.HashMap;

public class Ejemplo_Map {
    // Declaración de un Map (un HashMap) con clave "Integer" y valor "String".
    // Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como 
    // clave son los objetos predefinidos de Java como String, Integer, Double ...
    // Cuidado: Los Map no permiten datos atómicos.

    public static void main(String[] args) {

        Map<Integer, String> nombreMap = new HashMap<Integer, String>();

        System.out.println("\nMap vacío: " + nombreMap.isEmpty());
        
        nombreMap.put(1, "Mauricio");
        nombreMap.put(3, "Daniel");
        nombreMap.put(2, "María");
        
        System.out.println("\nMap vacío: " + nombreMap.isEmpty());
        System.out.println("\nContenido Map: " + nombreMap);
        
        System.out.println("\nmap.get(clave): " + nombreMap.get(2));
        
        nombreMap.remove(3);
        System.out.println("\nContenido Map: " + nombreMap);

        System.out.println("Existe la clave?: " + nombreMap.containsKey(3));
        System.out.println("Existe el valor?: " + nombreMap.containsValue("Mauricio"));

        System.out.println("\nRetorna colección de valores: " + nombreMap.values());

        nombreMap.clear();

        System.out.println("\nRetorna colección de valores: " + nombreMap.values());
    }
    

}