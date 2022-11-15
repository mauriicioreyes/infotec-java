public class PersonaDTO {
    // Objeto DTO
    // // Objeto de Transferencia de Datos

    public String nombreApellido;

    public PersonaDTO(Persona persona) {
        this.nombreApellido = persona.getNombre() + " " + persona.getApellido();
    }
}