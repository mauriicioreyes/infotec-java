import java.util.ArrayList;
import java.util.List;

public class Ejemplo_Lista {
    public static void main(String[] args) {
        List<Integer> listaInteger = new ArrayList<>();
        listaInteger.add(123);
        listaInteger.add(55);
        listaInteger.add(666);
        listaInteger.add(10);

        System.out.println("Elementos: " + listaInteger);
        
        listaInteger.add(2, 100);
        
        System.out.println("Elementos: " + listaInteger);
        
        for (int i = 0; i < listaInteger.size(); i++) {
            // System.out.println(i + ", " + listaInteger.get(i) + ", " + listaInteger.size());
            if (listaInteger.get(i) == 666) {
                listaInteger.add(i, 999);
                break;
            }
        }
        
        System.out.println("Elementos: " + listaInteger);
        
        int indice = listaInteger.indexOf(666);
        listaInteger.add(indice, 700);
        
        
        for (int i = 0; i < listaInteger.size(); i++) {
            System.out.println("Posición " + i + ", valor: " + listaInteger.get(i));
        }
        
        System.out.println("Elementos: " + listaInteger);
        // listaInteger.clear();
    }
}