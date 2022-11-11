public class Main {
    public static void main (String[] args) {

        // No entendí como instanciar una clase con otra!
        // Crear 2 instancias de cada clase creada (CLASE1 Y CLASE2), una instancia será utilizando su misma clase y la otra será utilizando otra clase. (serán 4 instancias en total)
        Clase1 c1 = new Clase1("Mauricio", 10, 'M', true, 300.0);
        Clase1 c2 = new Clase1("Mauricio", 10, 'M', true, 300.0);
        // Clase1 c2 = new Clase1("Alejandra", 5, 'A', true, 100.0);

        Clase2 d1 = new Clase2("Hola", true, 123.0);
        Clase2 d2 = new Clase2("Hola", true, 123.0);

        System.out.println("");
        
        if (c1 == c2) {
            System.out.println("Clase1 y Clase2 son iguales!");
        } else {
            System.out.println("Clase1 y Clase2 NO son iguales!");
        }

        System.out.println("");
        
        if (c1.equals(c2)) {
            System.out.println("Clase1 y Clase2 son iguales!");
        } else {
            System.out.println("Clase1 y Clase2 NO son iguales!");
        }
        
        System.out.println("-----------------------------");
        
        if (d1 == d2) {
            System.out.println("Clase3 y Clase4 son iguales!");
        } else {
            System.out.println("Clase3 y Clase4 NO son iguales!");
        }
        
        System.out.println("");
        
        if (d1.equals(d2)) {
            System.out.println("Clase3 y Clase4 son iguales!");
            
        } else {
            System.out.println("Clase3 y Clase4 NO son iguales!");
        }
        
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println(c2.getCantidad());
        System.out.println("-----------------------------");
        
        System.out.println("");
        System.out.println(Clase2.saludar("Hola"));
    }
}