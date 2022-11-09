public class Tienda {
    private String nombre;
    private String direccion;
    private Producto producto;
    private Cliente cliente;

    // Constructor
    public Tienda(String nombre, String direccion, Cliente cliente, Producto producto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.producto = producto;
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}