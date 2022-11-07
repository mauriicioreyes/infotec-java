public class Persona {
    public Persona(String nombre, int edad) {

    }
    public static void main (String[] args) {
        
        // Instancia del objeto Persona
        // Su referencia en memoria es null
        Persona persona;

        // Inicializar objeto (otorgar espacio en memoria)
        // Se reserva en memoria el espacio para todos los atributos del objeto
        persona = new Persona("Mauricio", 26);
    }
}