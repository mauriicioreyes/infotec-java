import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        EmpleadoTipo1 mauricioT1 = new EmpleadoTipo1("Mauricio Reyes", 26, 1);
        EmpleadoTipo1 danielT1 = new EmpleadoTipo1("Daniel Manuel", 20, 1);
        EmpleadoTipo1 marianaT1 = new EmpleadoTipo1("Mariana Sánchez", 18, 3);

        EmpleadoTipo2 juanT2 = new EmpleadoTipo2("Juan Victor", 30, 5);
        EmpleadoTipo2 fernandaT2 = new EmpleadoTipo2("Fernanda Gazcón", 32, 2);
        EmpleadoTipo2 marisolT2 = new EmpleadoTipo2("Marisol Ruíz", 27, 1);

        EmpleadoTipo3 isellaT3 = new EmpleadoTipo3("Isella Guzmán", 25, 1);
        EmpleadoTipo3 isaiasT3 = new EmpleadoTipo3("Isaias Almidon", 26, 2);
        EmpleadoTipo3 alejandroT3 = new EmpleadoTipo3("Alejandro García", 32, 2);

        Producto p1 = new Producto("Galletas Saladas");
        Producto p2 = new Producto("Agua de Sabor");
        Producto p3 = new Producto("Cereal Crujiente");
        Producto p4 = new Producto("Aceite");
        Producto p5 = new Producto("Servitoalla");

        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);

        ArrayList listaEmpleados = new ArrayList<>();
        listaEmpleados.add(mauricioT1);
        listaEmpleados.add(danielT1);
        listaEmpleados.add(marianaT1);
        listaEmpleados.add(juanT2);
        listaEmpleados.add(fernandaT2);
        listaEmpleados.add(marisolT2);
        listaEmpleados.add(isellaT3);
        listaEmpleados.add(isaiasT3);
        listaEmpleados.add(alejandroT3);

        Utileria util = new Utileria();
        
        System.out.println("");

        System.out.println("Nombre: " + mauricioT1.getNombreCompleto());
        System.out.println("Tipo: " + mauricioT1.getTipo());
        System.out.println("Pago: " + mauricioT1.recibirPago(200.1));

        System.out.println("");

        System.out.println("Nombre: " + juanT2.getNombreCompleto());
        System.out.println("Tipo: " + juanT2.getTipo());
        System.out.println("Pago: " + juanT2.recibirPago(10.5));
        
        System.out.println();

        System.out.println("Nombre: " + alejandroT3.getNombreCompleto());
        System.out.println("Tipo: " + alejandroT3.getTipo());
        System.out.println("Pago: " + alejandroT3.recibirPago(700.0));

        System.out.println();
        
        System.out.println(p1.toString());
        
        System.out.println(p1.venderUnProducto());
        
        System.out.println(p1.venderProducto(15));
        
        System.out.println();
        
        System.out.println(util.imprimirHora());
        
        System.out.println();
        
        util.cadenaMayusculas("Hola");
        
        util.cadenaMinusculaInversa("Hola a todos los invitados!");
        
        System.out.println(util.getRegistroUso());
    }
}