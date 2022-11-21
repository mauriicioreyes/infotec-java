public class Utils {
    // Para hacer una función limpia y reutilizable, se genera en otra clase, la cual debe ser estática para que el desarrollador pueda utilizarla en cualquier parte del sistema, haciendo referencia a la clase y la función sin generar instancias

    public static void compararClase1(Clase1 clase1Primera, Clase1 clase1Segunda) {
        if (clase1Primera != null && clase1Segunda != null) {

            if (clase1Primera.getEdad() != null && clase1Primera.getEdad().equals(clase1Segunda.getEdad())) {
                System.out.println("Edad es igual");
            } else {
                System.out.println("Edad No es igual");
            }

            if (clase1Primera.getNombre() != null && clase1Primera.getNombre().equals(clase1Segunda.getNombre())) {
                System.out.println("Nombre es igual");
            } else {
                System.out.println("Nombre No es igual");
            }

            if (clase1Primera.getCantidad() != null && clase1Primera.getCantidad().equals(clase1Segunda.getCantidad())) {
                System.out.println("Cantidad es igual");
            } else {
                System.out.println("Cantidad No es igual");
            }

            if (clase1Primera.getLongitud() != null && clase1Primera.getLongitud().equals(clase1Segunda.getLongitud())) {
                System.out.println("Longitud es igual");
            } else {
                System.out.println("Longitud No es igual");
            }

            if (clase1Primera.getLista() != null && clase1Primera.getLista().equals(clase1Segunda.getLista())) {
                System.out.println("Lista es igual");
            } else {
                System.out.println("Lista No es igual");
            }
            
        } else {
            System.out.println("No es posible realizar la comparación!");
        }
    }
}