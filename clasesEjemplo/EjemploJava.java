public class EjemploJava {
    public static void main(String[] args) {
        Producto servilleta = new Producto("Servilleta", 150.00);
        Cliente cliente1 = new Cliente("Mario", 500.00);

        Tienda tienda = new Tienda("Playa Bonita", "Calle Rama 123", cliente1, servilleta);

        System.out.println("Nombre del cliente: " + tienda.getCliente().getNombre());
        System.out.println("Nombre del producto: " + tienda.getProducto().getNombre());
    }
} 