public class main {

    // psvm
    public static void main (String [] m) {
        // Creación de objetos
        empleado empleado1 = new empleado();
        empleado empleado2 = new empleado();

        // Modificar salario a 500
        empleado.setSalarioBase(500);

        // sout
        System.out.println("Salario base del empleado 1: " + empleado1.getSalarioBase());
        System.out.println("Salario base del empleado 2: " + empleado2.getSalarioBase());

        // Modificar salario a 2500
        empleado.setSalarioBase(2500);

        System.out.println("Salario base del empleado 1: " + empleado1.getSalarioBase());
        System.out.println("Salario base del empleado 2: " + empleado2.getSalarioBase());
        
        empleado1.setSalarioBase(4999);
        
        System.out.println("Salario base del empleado 1: " + empleado1.getSalarioBase());
        System.out.println("Salario base del empleado 2: " + empleado2.getSalarioBase());
    }
}