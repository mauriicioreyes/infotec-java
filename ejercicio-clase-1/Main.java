import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1(null, null, null, null, null);
        Clase2 clase2 = new Clase2();
        
        // Todas las clases en Java tienen una herencia por default, nuestra clase Object
        // Implementando Polimorfismo:
        //  Un objeto puede tomar la forma de otro, si cumple con sus características
        Object object1 = new Clase1(null, null, null, null, null);
        Object object2 = new Clase2();

        if (clase1 == object1) {
            System.out.println("clase1 y object1: Son iguales");
        } else {
            System.out.println("clase1 y object1: No son iguales");
        }

        
        if (clase2.equals(object2)) {
            System.out.println("clase2 y object2: Son iguales");
        } else {
            System.out.println("clase2 y object2: No son iguales");
        }
        
        System.out.println();

        System.out.println("clase2 Hash: " + clase2.hashCode());
        System.out.println("object2 Hash: " + object2.hashCode());
        
        System.out.println();
        
        // Igualar el hashCode entre dos objetos
        // clase2 = (Clase2) object2;
        object2 = clase2;
        System.out.println("clase2 Hash: " + clase2.hashCode());
        System.out.println("object2 Hash: " + object2.hashCode());
        
        // Formas de acceso a métodos de la clase
        Clase2.metodo1(clase1);
        clase2.metodo1(clase1);
        
        System.out.println();
        
        // Implementando método de la clase Utils
        List<Integer> lista = new ArrayList<>();
        lista.add(999);

        Clase1 clase1Primera = new Clase1(26, "Mauricio", 3000d, 5000l, lista);
        Clase1 clase1Segunda = new Clase1(26, "Mauricio", 3000d, 5000l, lista);

        Utils.compararClase1(null, null);
        System.out.println();
        Utils.compararClase1(clase1Primera, clase1Segunda);
    }
}