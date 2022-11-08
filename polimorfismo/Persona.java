public abstract class Persona {
    private String nombre;
    
    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Constructor
    public Persona(String nombre) {
        super();
        this.nombre = nombre;
    }

    public abstract Boolean trabajando();
    
    public static void main(String[] args) {
        Persona a1 = new Abogado("Alejandro");
        Persona d1 = new Doctor("Mariana");

        System.out.println(a1.nombre + ", trabajando: " + a1.trabajando());
        System.out.println(d1.nombre + ", trabajando: " + d1.trabajando());
    }
}