public class Medidas {
    Integer alto;
    Integer largo;
    Integer ancho;

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }


    public Medidas (Integer alto, Integer largo, Integer ancho) {
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
    }

    public String obtenerVolumen() {
        Integer volumen = alto * largo * ancho;
        return volumen.toString();
    }
}