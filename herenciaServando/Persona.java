public abstract class Persona {
    private String nombre;
    private String apellidos;

    // Contructor por default declarado de forma explícita
    public Persona() {

    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // Al tener los atributos privados, necesitamos generar sus métodos getter y setter
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

    public String getNombreCompleto() {
        // return nombre + " " + apellidos;

        // Implementa operador ternario
        // return nombre==null?"Sin Dato":nombre + " " + apellidos;
        return nombre==null?"Sin Dato":nombre + " " + (apellidos==null?"":apellidos);
    }

    // Método de tipo abstract,
    // Son métodos que están declarados pero su cuerpo no está construido.
    public abstract void pruebaAbstracto();

}