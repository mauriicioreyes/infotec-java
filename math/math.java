import java.util.*;

public class math {
    public static void main(String[] args) {
        double varDouble = 10.9;
        double resultado = 0;
        double varDouble2 = 30.49;
        float varFloat = 2.234f;
        
        System.out.println("\nValor: " + varDouble);
        
        // Seno
        resultado = Math.sin(varDouble);
        System.out.println("Seno: " + resultado);
        
        // Coseno
        resultado = Math.cos(varDouble);
        System.out.println("Coseno: " + resultado);
        
        // Tangente
        resultado = Math.tan(varDouble);
        System.out.println("Tangente: " + resultado);
        
        // Potencia
        resultado = Math.pow(varDouble, 2);
        System.out.println("Potencia: " + resultado);
        
        // Raíz cuadrada
        resultado = Math.sqrt(varDouble);
        System.out.println("Raíz cuadrada: " + resultado);
        
        // Logaritmo
        resultado = Math.log(varDouble);
        System.out.println("Logaritmo natural: " + resultado);
        
        // Valor absoluto
        resultado = Math.abs(varDouble);
        System.out.println("Valor absoluto: " + resultado);

        System.out.println("\nValor 1: " + varDouble);
        System.out.println("Valor 2: " + varDouble2);

        // Máximo
        resultado = Math.max(varDouble, varDouble2);
        System.out.println("Máximo: " + resultado);

        // Mínimo
        resultado = Math.min(varDouble, varDouble2);
        System.out.println("Mínimo: " + resultado);

        // Redondeo
        System.out.println("\nFlotante: " + varFloat);
        resultado = Math.round(varFloat);
        System.out.println("Redondeo: " + resultado);

        System.out.println("\nDouble: " + varDouble2);
        resultado = Math.round(varDouble2);
        System.out.println("Redondeo: " + resultado);        
    }
}