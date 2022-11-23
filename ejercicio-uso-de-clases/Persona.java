public class Persona {
    // 1) Crea una clase llamada Persona que contenga los siguientes atributos:
    // Nombres, primer apellido, segundo apellido, edad y domicilio (usa el tipo de
    // datos que creas adecuados).
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Integer edad;
    private String domicilio;

    public Persona() {}
    
    public Persona(String nombre, String primerApellido, String segundoApellido, Integer edad, String domicilio) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.domicilio = domicilio;
    }

    // Encapsulamieto mediante métodos Getter y Setter

    // 2) Oculta los atributos de la clase Persona haciendo uso de encapsulamiento.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    // Métodos
    // 3) Genera 2 métodos en la clase Persona
    // 3.1 El primero se llamará "nombreCompleto" y retornará el nombre y los apellidos de la persona en una cadena String.
    public String nombreCompleto() {
        // return getNombre() + " " + getPrimerApellido() + " " + getSegundoApellido();
        return this.nombre + " " + this.primerApellido + " " + this.segundoApellido;

    }

    // 3.2 El segundo se llamará "imprimirNombreYDireccion" no retornara valor alguno e imprimirá en consola el nombre y la dirección concatenada. Éste método usará la palabra reservada return, aunque no retorne valor.
    public void imprimirNombreYDireccion() {
        // System.out.println(getNombre() + " " + getDomicilio());
        System.out.println("Nombre(s): " + this.nombre + " Domicilio: " + this.domicilio);
        return;
    }
}