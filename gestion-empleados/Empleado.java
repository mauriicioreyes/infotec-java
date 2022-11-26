public class Empleado {
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String[] actividadesDiarias;
    private Integer codigoEmpleado;

    public Empleado(String nombre, String apellidos, Integer edad, String[] actividadesDiarias, Integer codigoEmpleado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.actividadesDiarias = actividadesDiarias;
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String[] getActividadesDiarias() {
        return actividadesDiarias;
    }

    public void setActividadesDiarias(String[] actividadesDiarias) {
        this.actividadesDiarias = actividadesDiarias;
    }

    public Integer getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Integer codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
}