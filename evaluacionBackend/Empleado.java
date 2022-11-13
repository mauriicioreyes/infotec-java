public class Empleado {
    private String nombreCompleto;
    private Integer edad;
    private Integer antiguedad;
    private Integer tipo;

    // El dato tipo deberá estar inicializado por defecto, no podrá ser cambiado.
    public Empleado (String nombreCompleto, Integer edad, Integer antiguedad) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.antiguedad = antiguedad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    // Todos los empleados comparten una actividad llamada <Recibir Pago>
    // Cuando realizan esta actividad los empleados muestran el monto que les fue pagado
}