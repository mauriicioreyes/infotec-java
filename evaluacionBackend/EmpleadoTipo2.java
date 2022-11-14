public class EmpleadoTipo2 extends Empleado {

    public EmpleadoTipo2(String nombreCompleto, Integer edad, Integer antiguedad) {
        super(nombreCompleto, edad, antiguedad);
        setTipo(2);
    }

    // Actividades
    // - Vender productos
    // - Descansar
    // - Correr

    public void venderProducto() {}
    public void descansar() {}
    public void correr() {}
}