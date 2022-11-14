public class Main {
    public static void main(String[] args) {
    // POO (Programación Orientada a Objetos)
        Implementacion instancia = new Implementacion();

        String resultado = instancia.concatena("1000");

        System.out.println(resultado);


    // PF (Programación Funcional)
        // Clase Anónima
        InterfazFuncional inter = new InterfazFuncional(){
            @Override
            public String concatena(String x) {
                return "\nPF: Clase anónima: " + x;
            }
        };

        String resultado2 = inter.concatena("5000");

        System.out.println(resultado2);
    }
}