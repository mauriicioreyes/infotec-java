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
    }
}