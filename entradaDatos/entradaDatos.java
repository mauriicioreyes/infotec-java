import java.util.Scanner;

public class entradaDatos {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        float numero2;
        double numero3;
        String nombreCompleto, apodo;
        char letra;
        
        System.out.print("Ingresa tu nombre: ");
        nombreCompleto = entrada.nextLine();
        
        // Captura el texto hasta el primer espacio
        System.out.print("Cuál es tu apodo: ");
        apodo = entrada.next();
        
        System.out.print("Ingresa una letra: ");
        letra = entrada.next().charAt(0);

        System.out.print("Ingresa un primer número: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Ingresa un segundo número: ");
        numero2 = entrada.nextFloat();
        
        System.out.print("Ingresa un tercer número: ");
        numero3 = entrada.nextDouble();
        
        System.out.println("Hola " + nombreCompleto + ", alias " + apodo);
        System.out.println("Tu letra: " + letra);
        System.out.println("El número 1 es: " + numero1);
        System.out.println("El número 2 es: " + numero2);
        System.out.println("El número 2 es: " + numero3);
    }
}
