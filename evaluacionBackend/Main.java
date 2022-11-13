public class Main {
    public static void main (String[] args) {
        EmpleadoTipo1 eT1 = new EmpleadoTipo1("Mauricio Reyes", 26, 1);
        EmpleadoTipo2 eT2 = new EmpleadoTipo2("Juan Victor", 30, 5);

        System.out.println(eT1.getNombreCompleto());
        System.out.println(eT1.getTipo());

        System.out.println("");
        System.out.println(eT2.getNombreCompleto());
        System.out.println(eT2.getTipo());
    }
}