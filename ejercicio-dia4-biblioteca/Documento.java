public class Documento {
    private String codigo;
    private String titulo;
    private boolean estado;
    private Integer anho;

    public Documento(String codigo, String titulo, boolean estado, Integer anho) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.estado = estado;
        this.anho = anho;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Integer getAnho() {
        return anho;
    }

    public void setAnho(Integer anho) {
        this.anho = anho;
    }

    public String anhoCodigo() {
        return "\nAño: " + getAnho() + "\nCódigo: " + getCodigo();
    }
}
