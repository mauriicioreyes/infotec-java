public class EjercicioClases {
    public static void main(String[] args) {
        Caja c1 = new Caja("Cartón", "Sin empresa", "10402", 100,300, 3);

        Medidas m1 = new Medidas(500, 980, 100);

        if(c1.alto == m1.alto) {
            System.out.println("El valor es igual." + "\ncaja.alto: " + c1.alto + ", medidas.alto: " + m1.alto);
        } else {
            System.out.println("Altura diferente");
        }

        System.out.println(m1.obtenerVolumen());
        System.out.println(c1.obtenerVolumen());
    }
}