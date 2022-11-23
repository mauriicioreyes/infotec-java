public class Main {
    public static void main(String [] args) {

        // 8) Ahora en nuestro programa principal creamos una instancia de un objeto de
        // tipo Persona utilizando la clase Doctor y le asignamos valores a sus 5
        // atributos.
        Persona persona1 = new Persona ("Alejandro", "Gumo", "Morado", 22, "Nicaragua 15");
        
        // 8.1 Creamos una instancia de un objeto de tipo Doctor y le asignamos valores a
        // sus 8 atributos.
        // 8.2 Asignamos al atributo paciente la instancia de persona creada previamente.
        Doctor doctor1 = new Doctor("Manuel", "Turizo", "Ramál", 35, "Su Casa 20", "A001", "Pediatría", persona1);

        doctor1.consultorio(persona1);
    }
}