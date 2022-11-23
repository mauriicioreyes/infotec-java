public class Doctor extends Persona {
    // 4) Crea una clase llamada Doctor que extienda a la clase Persona y que contenga los siguientes parámetros: cédula (tipo String), especialidad (tipo String) y paciente (tipo Persona).
    private String cedula;
    private String especialidad;
    private Persona paciente;

    // Constructores
    public Doctor() {}

    public Doctor(String nombre, String primerApellido, String segundoApellido, Integer edad, String domicilio, String cedula, String especialidad, Persona paciente) {
        super(nombre, primerApellido, segundoApellido, edad, domicilio);
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.paciente = paciente;
    }

    // Encapsulamiento
    // 5) Oculta los atributos de la clase Doctor haciendo uso de encapsulamiento.
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Persona getPaciente() {
        return paciente;
    }

    public void setPaciente(Persona paciente) {
        this.paciente = paciente;
    }

    // 6) Sobreescribe los dos métodos de la clase Persona con las siguientes
    // instrucciones:

    // 6.1 El método "nombreCompleto" retornará el nombre completo de nuestro atributo
    // paciente.
    @Override
    public String nombreCompleto() {
        return paciente.getNombre() + " " + paciente.getPrimerApellido() + " " + paciente.getSegundoApellido();
    }
    
    // 6.2 El método "imprimirNombreYDireccion" retornará el nombre y dirección de
    // nuestro atributo paciente.
    @Override
    public void imprimirNombreYDireccion() {
        System.out.println("Nombre(s): " + paciente.getNombre() + " Dirección: " + paciente.getDomicilio());     
    }

    // 7) Creamos un método llamado "consultorio" en la clase Doctor que reciba como
    // parámetros un objeto de tipo Persona e imprima en pantalla todos los datos de
    // la clase Doctor y todos los datos del atributo persona.
    public void consultorio(Persona persona) {
    System.out.println(
        "DOCTOR: " + "Cedula: " + this.cedula + ", Especialidad: " + this.especialidad +
        "\nPACIENTE: " + "Nombre: " + persona.getNombre() + " " + persona.getPrimerApellido() + " " + persona.getSegundoApellido() + " Edad: " + persona.getEdad() + " Domicilio: " + persona.getDomicilio());
    }
}