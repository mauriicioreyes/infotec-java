import java.util.ArrayList;

public class Ejemplo_ArrayList {
    public static void main(String[] args) {
        ArrayList arlTest = new ArrayList();

        System.out.println("\nTamaño de ArrayList en la creación: " + arlTest.size());

        arlTest.add("H");
        arlTest.add("O");
        arlTest.add("L");
        arlTest.add("A");

        System.out.println("\nTamaño de ArrayList después de agregar elementos: " + arlTest.size());
        System.out.println("Lista de todos los elementos: " + arlTest);
        
        arlTest.remove("O");

        System.out.println("\nTamaño de ArrayList después de eliminar elemetos: " + arlTest.size());
        System.out.println("Contenido después de eliminar un elemento: " + arlTest);

    System.out.println("\nExiste A: " + arlTest.contains("A"));
    }
}