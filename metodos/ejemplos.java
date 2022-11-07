public class ejemplos {
    /*
     * ESTRUCTURA DE UN MÉTODO
     *  tipo-acceso tipo-retorno nombre (lista de argumentos)
     * // Cuerpo del método
     * // "return" en caso de requerirlo
     */

    public Integer retornoInteger() {
        return 1;
    }

    private void metodoRecibeTresParametrosYNoRetornaValor(String parametro1, String parametro2, String parametro3) {
        System.out.println("Este método no retorna valor, solo imprime los valores en la consola." + "\n" + "Parámetro 1: " + parametro1 + "\n" + "Parámetro 2: " + parametro2 + "\n" + "Parámetro 3: " + parametro3);
    }


    public static void main(String[] args) {
        ejemplos ej = new ejemplos();
        ej.metodoRecibeTresParametrosYNoRetornaValor("a", "b", "c");

    }
}