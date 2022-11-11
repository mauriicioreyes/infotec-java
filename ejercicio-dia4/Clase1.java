public class Clase1 {
    private String nombre;
    private Integer entero;
    // private char letra;
    // private boolean estado;
    // private double cantidad;
    private Character letra;
    private Boolean estado;
    private Double cantidad;

    public Clase1 (String nombre, Integer entero, Character letra, Boolean estado, Double cantidad) {
        this.nombre = nombre;
        this.entero = entero;
        this.letra = letra;
        this.estado = estado;
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Clase1) {

            return this.nombre.equals(((Clase1) object).getNombre()) && this.entero.equals(((Clase1) object).getEntero());
        } else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEntero() {
        return entero;
    }

    public void setEntero(Integer entero) {
        this.entero = entero;
    }

    public Character getLetra() {
        return letra;
    }

    public void setLetra (Character letra) {
        this.letra = letra;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

}