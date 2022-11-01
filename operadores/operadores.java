import java.util.Scanner;

public class operadores {    
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2;
        float suma, resta, mult, div, resto;
        
        System.out.print("Ingresa dos números: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2;
        
        // Operadores aritméticos combinados con asignación
        /*
            +=, numero = numero + valor
            -=, numero = numero - valor
            *=, numero = numero * valor
            /=, numero = numero / valor
            %=  numero = numero % valor
        */
        
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("Suma: " + suma + "\nResta: " + resta + "\nDivisión: " + div + "\nMultiplicación: " + mult + "\nResto: " + resto);
    }
}
