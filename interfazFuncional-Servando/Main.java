public class Main {
    public static void main(String[] args) {
    // POO    
        Implementacion instancia = new Implementacion();

        String resultado = instancia.concatena("1000");

        System.out.println(resultado);

    // PF
        // Clase anónima
        InterfazFuncional inter = new InterfazFuncional() {
            @Override
            public String concatena(String x) {
                return "\nPF: Clase anónima: " + x;
            }
        };

        String resultado2 = inter.concatena("mensaje");

        System.out.println(resultado2);
    }
}