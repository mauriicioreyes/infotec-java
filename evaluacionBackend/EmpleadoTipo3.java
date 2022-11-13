public class EmpleadoTipo3 extends Empleado {

    public EmpleadoTipo3(String nombreCompleto, Integer edad, Integer antiguedad) {
        super(nombreCompleto, edad, antiguedad);
        setTipo(3);
    }

    // No podrá realizar actividades
}