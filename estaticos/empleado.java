public class empleado {
    
    // Nombre del empleado
    private String nombreEmpleado;

    // Apellido del empleado
    private String apellidoEmpleado;

    // Edad del empleado
    private int edadEmpleado;

    // Salario del empleado
    private static double salarioBase = 1000;

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public static void setSalarioBase(double salario) {
        salarioBase = salario;
    }

    public static String muestraMensaje() {
        return "Soy un método estático";
    }
}