public class Libro extends Documento implements PrestaLibro{
    private boolean prestado;

    public Libro(String codigo, String titulo, boolean estado, Integer anho) {
        super(codigo, titulo, estado, anho);
        this.prestado = false;
    }

    public boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "\nLibro: " + getTitulo() + "\nCódigo: " + getCodigo() + "\nEstado: " + getEstado() + "\nAño: " + getAnho() + "\nPrestado: " + getPrestado();
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void prestado() {
        
    }
}