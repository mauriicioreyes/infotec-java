public class Hijo extends Padre{
    Integer edad;

    public static void main(String[] args) {
        Hijo instanciaHijo = new Hijo();

        instanciaHijo.edad = 18;
        instanciaHijo.nombre = "Carlos";
        instanciaHijo.apellido = "Baldor";

        instanciaHijo.imprimirNombre();
    }
}