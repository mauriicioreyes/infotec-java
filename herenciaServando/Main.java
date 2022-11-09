import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instancia la clase creando un objeto vacio:
        Persona objetoPersona1 = new Persona();
        Persona objetoPersona2 = new Persona();
        Persona objetoPersona3 = new Persona();

        List<Persona> personasList = new ArrayList<>();
        personasList.add(objetoPersona1);
        personasList.add(objetoPersona2);
        personasList.add(objetoPersona3);

        Animal objetoAnimal1 = new Animal();
        Animal objetoAnimal2 = new Animal();
        Animal objetoAnimal3 = new Animal();

        // Cualquier clase que generemos en nuestro programa tiene una herencia por default de Object.
        // Object object = new Persona();

        // Por medio de los métodos setter, establece los valores del objeto
        objetoPersona1.setNombre("Isaías");
        objetoPersona2.setNombre("Uriel");

        for(Persona item:personasList) {
            System.out.println(item.getNombreCompleto());
        }
    }
}