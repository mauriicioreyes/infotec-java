import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instancia la clase creando un objeto vacio:
        Doctor objetoDoctor1 = new Doctor();
        Doctor objetoDoctor2 = new Doctor();
        Doctor objetoDoctor3 = new Doctor();

        List<Doctor> DoctorsList = new ArrayList<>();
        DoctorsList.add(objetoDoctor1);
        DoctorsList.add(objetoDoctor2);
        DoctorsList.add(objetoDoctor3);

        Animal objetoAnimal1 = new Animal();
        Animal objetoAnimal2 = new Animal();
        Animal objetoAnimal3 = new Animal();

        // Cualquier clase que generemos en nuestro programa tiene una herencia por default de Object.
        // Object object = new Doctor();

        // Por medio de los métodos setter, establece los valores del objeto
        objetoDoctor1.setNombre("Isaías");
        objetoDoctor2.setNombre("Uriel");

        for(Doctor item:DoctorsList) {
            System.out.println(item.getNombreCompleto());
        }

        // Implementa un método que hereda Persona de Habilidad
        objetoDoctor1.printString();

        // Llama a método estático
        // Un método estático pertenece a la clase, no al objeto.
        // objetoAnimal1.convertirString("a");
        Animal.convertirString("a");

        // Llama el atributo Static
        objetoAnimal1.pruebaStatic = "PRUEBA-STATIC";
        System.out.println("objetoAnimal3: " + objetoAnimal3.pruebaStatic);

        Animal.pruebaStatic = "PRUEBA-2-STATIC";
        System.out.println("objetoAnimal2: " + objetoAnimal2.pruebaStatic);
        System.out.println("Animal: " + Animal.pruebaStatic);
          
    }
}