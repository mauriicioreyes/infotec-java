public class automovil {

    String nombre;
    String marca;
    Double kilometraje;
    String color;

    static Integer modelo;
    public static void main(String[] args) {
        automovil.modelo = 1990;

        automovil auto1 = new automovil();
        auto1.nombre = "Kicks";
        auto1.marca = "Nissan";
        auto1.kilometraje = 2500d;
        auto1.color = "Blanco";

        automovil auto2 = new automovil();
        auto2.nombre = "Vento";
        auto2.marca = "Nyx";
        auto2.kilometraje = 35d;
        auto2.color = "Verde";

        auto1.modelo = 2000;
    }
}