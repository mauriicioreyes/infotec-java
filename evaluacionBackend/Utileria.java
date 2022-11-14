import java.time.LocalDateTime;

public class Utileria {
    // - Contar cuantas veces ha sido utilizada
    private Integer registroUso = 0;

    public Integer getRegistroUso() {
        return registroUso;
    }

    public void setRegistroUso(Integer registroUso) {
        this.registroUso = registroUso;
    }

    // MÉTODOS:
    // - Recibir lista de productos, indicar cuál tiene mayor precio.
    // - Recibir lista de productos, indicar cuál tiene mayor cantidad.
    // - Recibir lista de productos, indicar total de costo de los productos, tomando en cuenta la cantidad.
    //     - Recibir lista de productos, retornar los métodos anteriores

    // - Imprimir la hora actual
    public String imprimirHora() {
        String hora;
        registrarUso();
        LocalDateTime actual = LocalDateTime.now();
        if(actual.getHour() < 10) {
            hora = "Hora actual: 0" + actual.getHour();
        } else {
            hora = "Hora actual: " + actual.getHour();
        }
        return hora;
    }

    public void registrarUso() {
        setRegistroUso(getRegistroUso() + 1);
    }

    // - Recibir lista empleados, eliminar todos los tipo 3, es necesario saber el nombre del empleado que esta eliminando.
    
    // - Recibir cadena de texto, retornar cadena de texto en mayúsculas.
    public void cadenaMayusculas(String cadena) {
        registrarUso();
        System.out.println(cadena.toUpperCase());
    }
    
    // - Recibir cadena de texto, retornar cadena de texto en minúsculas e inversa.
    public void cadenaMinusculaInversa(String cadena) {
        registrarUso();
        String cadenaInvertida = "";
        for (int x = cadena.length() -1; x >= 0; x--) {
            cadenaInvertida = cadenaInvertida + cadena.charAt(x);
        }
        System.out.println(cadenaInvertida.toLowerCase());
    }
}