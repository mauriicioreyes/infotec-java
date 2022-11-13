public class EmpleadoTipo1 extends Empleado {
    
    public EmpleadoTipo1(String nombreCompleto, Integer edad, Integer antiguedad) {
        super(nombreCompleto, edad, antiguedad);
        setTipo(1);
    }

    // Actividades (Métodos)
    // - Vender productos
    // - Acomodar productos
    // - Descansar
    // - Sentarse
}