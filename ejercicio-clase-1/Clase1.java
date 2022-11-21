import java.util.List;

public class Clase1 {
    private Integer edad;
    private String nombre;
    private Double cantidad;
    private Long longitud;
    private List<Integer> lista;

    // Constructor
    public Clase1(Integer edad, String nombre, Double cantidad, Long longitud, List<Integer> lista) {
        this.edad = edad;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.longitud = longitud;
        this.lista = lista;
    }

    // Encapsulamiento mediante Getter y Setter
    public Integer getEdad() {
        return edad;
    }

    public void setEdad (Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Long getLongitud() {
        return longitud;
    }

    public void setLongitud(Long longitud) {
        this.longitud = longitud;
    }

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }
}