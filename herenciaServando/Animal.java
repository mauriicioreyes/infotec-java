public class Animal implements Habilidad2 {
    private String raza;
    private String edad;

    // Declara un atributo estático
    public static String pruebaStatic;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public void guardar() {

    }

    @Override
    public void editar() {

    }

    @Override
    public void eliminar() {

    }

    public static String convertirString(String s) {
        // this.raza;
        return s+s;
    }
}