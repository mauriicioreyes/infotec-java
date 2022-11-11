public class Revista extends Documento implements PrestaRevista{
    private Integer numero;

    public Revista(String codigo, String titulo, boolean estado, Integer anho, Integer numero) {
        super(codigo, titulo, estado, anho);
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nRevista: " + getTitulo() + "\nCódigo: " + getCodigo() + "\nEstado: " + getEstado() + "\nAño: " + getAnho() + "\nNúmero: " + getNumero();
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void numero() {
        
    }
}