public class Main {
    public static void main (String[] args) {
        EmpleadoTipo1 eT1 = new EmpleadoTipo1("Mauricio Reyes", 26, 1);
        EmpleadoTipo2 eT2 = new EmpleadoTipo2("Juan Victor", 30, 5);
        EmpleadoTipo3 eT3 = new EmpleadoTipo3("Alejandro García", 32, 2);

        Producto p1 = new Producto("Galletas Saladas");
        
        System.out.println("");

        System.out.println("Nombre: " + eT1.getNombreCompleto());
        System.out.println("Tipo: " + eT1.getTipo());
        System.out.println("Pago: " + eT1.recibirPago(200.1));

        System.out.println("");

        System.out.println("Nombre: " + eT2.getNombreCompleto());
        System.out.println("Tipo: " + eT2.getTipo());
        System.out.println("Pago: " + eT2.recibirPago(10.5));
        
        System.out.println();

        System.out.println("Nombre: " + eT3.getNombreCompleto());
        System.out.println("Tipo: " + eT3.getTipo());
        System.out.println("Pago: " + eT3.recibirPago(700.0));

        System.out.println();

        System.out.println(p1.toString());

        System.out.println(p1.venderUnProducto());
        
        System.out.println(p1.venderProducto(15));
    }
}