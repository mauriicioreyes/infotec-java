class Usuario {
    private String nombre;
    private int edad;
    private String direccion;

    // Sobrecarga de constructores
    public Usuario() {
        nombre = null;
        edad = 0;
        direccion = null;
    }

    public Usuario(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public Usuario(Usuario usr) {
        nombre = usr.nombre;
        edad = usr.edad;
        direccion = usr.direccion;
    }

    // Métodos Getter y Setter (encapsulamiento)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Sobrecarga de métodos
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEdad(float edad) {
        this.edad = (int) edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion (String direccion) {
        this.direccion = direccion;
    }
}

class ProgUsuarioEjemplo {
    public void imprimeUsuario(Usuario usr) {
        System.out.println("\nNombre: " + usr.getNombre());
        System.out.println("Edad: " + usr.getEdad());
        System.out.println("Dirección: " + usr.getDireccion());
    }

    public static void main(String[] args) {
        ProgUsuarioEjemplo prog = new ProgUsuarioEjemplo();

        // Se declaran dos objetos de la clase Usuario
        Usuario usr1, usr2;

        // Se utiliza el constructor por omisión de Usuario
        usr1 = new Usuario();
        prog.imprimeUsuario(usr1);

        // Se utiliza el segundo constructor de Usuario
        usr2 = new Usuario("Mauricio", 26, "Mi Casa 123");
        prog.imprimeUsuario(usr2);
        
        // Se utiliza el tercer constructor de Usuario
        usr1 = new Usuario(usr2);
        prog.imprimeUsuario(usr1);
        usr1.setEdad(30);
        usr2.setEdad(30.45f);
        prog.imprimeUsuario(usr1);
        prog.imprimeUsuario(usr2);
    }
}