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

        /*
         * LAMBDA
         * Lambda en Java corresponde a funciones anónimas
         * Son funciones que no tienen algún nombre asociado
         * (parámetros) -> {cuerpo}
         */

        InterfazFuncional lambda1 = (String s) -> {
            Integer suma = 4 + 4;
            return "\nForma Lambda 1: Retorno " + suma + ", parametro " + s;
        };

        concatenaSuperior(lambda1);


        concatenaSuperior((String s) -> {
            Integer suma = 4 + 4;
            return "\nForma Lambda 2: Retorno " + suma + ", parametro " + s;
        });


        InterfazFuncional lambda3 = s -> "\nForma Lambda 3: Retorno " + (4 + 4) + ", parametro " + s;
        concatenaSuperior(lambda3);


        /*
            Parámetros ():
            - Sin parámetros, se colocan los paréntesis: ()
            - Si sólo tiene un parámetro, puede declararse sin paréntesis: s / (s) -> {}
            - Si tiene más de un parámetro: (s, x) / (Integer s, String x)
         */

        /*
            Cuerpo {}:
            {
                Integer suma = 4 + 4;
                System.out.println(suma);
            }

            {
                return "cadena"
            }
         */
        }

    // Funciones de Orden Superior
        // Son funciones que deben cumplir por lo menos una caracteristica:
        // - Debe de recibir como parámetro una o más funciones
        // - Debe de retornar como resultado de su ejecución otra función 
    public static void concatenaSuperior(InterfazFuncional inter) {
        System.out.println(inter.concatena("High Order (Orden Superior)"));
    }
}
