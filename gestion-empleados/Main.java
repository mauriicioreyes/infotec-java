public class Main {
    public static void main (String[] args) {
        Disenhador d1;

        d1 = new Disenhador("Mauricio", "Reyes", 26);
        d1.imprimirValoresPorDefecto();
        d1.obtenerActividadesDiarias();

        Programador p1;
        p1 = new Programador("Emiliano", "Macías", 39);
        p1.imprimirValoresPorDefecto();
        p1.obtenerActividadesDiarias();
    }
}