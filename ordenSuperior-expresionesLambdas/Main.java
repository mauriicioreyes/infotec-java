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

        // Invoca función de orden superior
        concatenaSuperior(instancia);

        // Invoca función de orden superior con nuestra clase anónima
        concatenaSuperior(inter);

    }

    // Funciones de Orden Superior
        // Son funciones que deben cumplir por lo menos una caracteristica:
        // - Debe de recibir como parámetro una o más funciones
        // - Debe de retornar como resultado de su ejecución otra función 
    public static void concatenaSuperior(InterfazFuncional inter) {
        System.out.println(inter.concatena("High Order (Orden Superior)"));
    }
}