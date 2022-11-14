public class Producto {
    private String nombre;
    private Integer precio;
    private Integer cantidad;
    private Integer tipo;

    public Producto(String nombre) {
        this.nombre = nombre;
        this.precio = generarPrecioAleatorio();
        this.cantidad = generarCantidadAleatoria();
        this.tipo = generarTipoAleatorio();
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getPrecio() { return precio; }

    public Integer getCantidad() { return cantidad; }

    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }

    public Integer getTipo() { return tipo; }
    
    // Al crear un producto se le asignará su tipo (20 distintos) de manera aleatoria,
    // no se podrá repetir el mismo tipo de producto.
    public Integer generarTipoAleatorio() {
        Integer num = (int) (Math.random()*20+1);
        return num;
    }

    // Al crear un producto se asigna un precio aleatorio entre 300 y 500, no debe contener decimales.
    public Integer generarPrecioAleatorio() {
        Integer num = (int)(Math.random()*(500-300+1)+300);
        return num;
    }

    // La cantidad de productos se asigna de manera aleatoria dentro de un rango de 10 y 15.
    public Integer generarCantidadAleatoria() {
        Integer num = (int)(Math.random()*(15-10+1)+10);
        return num;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + "\n" + "Precio: " + precio + "\n" + "Cantidad: " + cantidad + "\nTipo: " + tipo;
    }

    // MÉTODOS:
    // - venderProducto: comprobar stock, restar uno, sino mostrar mensaje.
    
    public String venderProducto(Integer cantidadVender) {
        String respuesta;
        Integer stock = getCantidad();
        if (stock >= cantidadVender && cantidadVender > 0) {
            respuesta = "\nVenta: " + cantidadVender + "\nStock inicial: " + stock;
            stock = stock - cantidadVender;
            respuesta = respuesta + "\nStock final: " + stock; 
            setCantidad(stock);
        } else {
            respuesta = "\nError! \nStock: " + stock;
        }
        return respuesta;
    }

    public String venderUnProducto() {
        String respuesta;
        Integer stock = getCantidad();
        if (stock > 0) {
            respuesta = "\nStock inicial: " + stock;
            stock = stock - 1;
            setCantidad((stock));
            respuesta = respuesta + "\nStock final : " + stock;
        } else {
            respuesta = "No hay productos del tipo solicitado";
        }
        return respuesta;
    }
}