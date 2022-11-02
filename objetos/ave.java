public class ave {
    // Variables de instancia
    String nombre;
    String raza;
    int edad;
    String color;

    // Declaración del constructor de la clase
    public ave(String nombre, String raza, int edad, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    // Método 1
    public String getNombre() {
        return nombre;
    }
    
    // Método 2
    public String getRaza() {
        return raza;
    }
    
    // Método 3
    public int getEdad() {
        return edad;
    }
    
    // Método 4
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return ("Hola soy un pájaro." + "\nMi nombre es " + this.getNombre() + " y tengo " + this.getEdad() + " años de edad." + "\nSoy raza " + this.getRaza() + " y color " + this.getColor() + ".");
    }

    // psvm
    public static void main (String [] args) {
        ave perico = new ave("Golfo", "Cotorra", 25, "humilde");

        // sout
        System.out.println(perico.toString());
    }
    
}